import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        Juego juego= new Juego();
        juego.iniciar();
        Jugador player= juego.getJugador();
        Escena nivelActual= new Escena();
        HashMap<String, Escena> niveles= juego.getEscenas();
        for (String descrip : niveles.keySet()) {// sabemos que hay una sola
            nivelActual= niveles.get(descrip);
        }
        // Aca despues vendría la sucesion de switches e ifs
        System.out.print("El "+nivelActual.getDescripcion()+" esta lleno de recursos. Ves un cartel que nos"+
        "dice \"Viajando para el Norte se encuentra el Desierto, yendo para el Sur"+
        "tenemos la Selva frondoza y para el Este tenemos las Sierras\"");
        /* Debería cambiar las direcciones del norte, sur, etc. por las keys de las 
        salidas y sus values que serían las keys de las escenas nuevas, de esa manera 
        con un while-loop podría estar ciclando continuamente y de esa manera se adapta a todo el juego */
        System.out.println("\nQue deseas hacer?\na- Ir al Norte\nb- Ir al Sur\nc- Ir al Este\nd- Merodear por aca");
        String variable= myScanner.next();
        int verif= 0;
        switch (variable) {
            case "a":
                juego.cambiarEscena("Desierto");
                System.out.println("Te diriges al Norte, entrando al Desierto.");
                verif= 1;
                break;

            case "b":
                juego.cambiarEscena("Selva");
                System.out.println("Te diriges al Sur, entrando a la Selva.");
                verif= 2;
                break;

            case "c":
                juego.cambiarEscena("Sierras");
                System.out.println("Te diriges al Este, entrando a las Sierras.");
                verif= 3;
                break;

            default:
                for (Objeto objeto : nivelActual.getObjetosEnEscena()) {
                    player.tomarObjeto(objeto);
                }
                verif= 4;
                break;
        }
        // Acá tambien entraría un loop que varíe con las cosas del inventario
        if(verif == 4){
            System.out.println("Que deseas hacer?\na- Usar Ramas\nb- Usar Piedra\nc- Usar Frutas");
            variable= myScanner.next();
            ArrayList<Objeto> inv= player.getInventario();
            try{
                switch (variable) {
                    case "a":
                        for (Objeto item : inv) {
                            if(item.getNombre() == "Ramas"){
                                player.usarObjeto(item);
                                break;
                            }
                        }
                        break;

                    case "b":
                        for (Objeto item : inv) {
                            if(item.getNombre() == "Piedra"){
                                player.usarObjeto(item);
                                break;
                            }
                        }
                        break;

                    case "c":
                        for (Objeto item : inv) {
                            if(item.getNombre() == "Frutas"){
                                player.usarObjeto(item);
                                break;
                            }
                        }
                        break;
                }
            }
            catch(Exception objetoNoDisponible){
                System.out.println(objetoNoDisponible);
            }// Acá luego habría una repeticion del primer switch pero la opcion merodear cambiaría por usar objeto
        }
        else{
            System.out.println("Aqui vendrian ciertos else if utilizando como condicion el valor de la verificacion,"+
            " de manera que varie segun vayamos al Norte, Sur, Este, con sus respectivos objetos cada uno");
        }
    }
}