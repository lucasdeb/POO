import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputs= new Scanner(System.in);
        String nombre;
        int opcion= 0;
        Tienda local= new Tienda();

        Premium persona= new Premium("Patricio");
        local.registrarSocio(persona);

        try{
            while (opcion != 6) {
                System.out.println("\nIngrese una opcion:\n1_ALQUILAR\n2_LISTA SOCIOS\n3_LISTA ARTICULOS\n4_DEVOLVER\n5_REGISTRAR SOCIO\n6_SALIR\n");
                opcion= inputs.nextInt();
                switch (opcion) {
                    case 1:
                        inputs.nextLine();
                        System.out.println("\nIngrese nombre de socio:");
                        nombre= inputs.nextLine();
                        boolean bandera= true;
                        for (Socio socio : local.getSocios()) {
                            if (socio.getNombre().equals(nombre)) {
                                bandera= false;
                                System.out.println("\nIngrese ID de articula a alquilar:");
                                int id= inputs.nextInt();
                                boolean bandera2= true;
                                for (Articulo articulo : local.getArticulosDisponibles()) {
                                    if (articulo.getID() == id) {
                                        bandera2= false;
                                        int saldoNuevo= socio.getCreditos() - articulo.getCosto();
                                        socio.setCreditos(saldoNuevo);
                                        local.prestar_recibirArticulo(articulo);
                                        socio.alquilar(articulo);
                                        System.out.printf("\n%s alquilo el articulo %s\n", socio.getNombre(), articulo.getTitulo());
                                        System.out.printf("El nuevo saldo de %s es de %d creditos\n\n", socio.getNombre(), socio.getCreditos());
                                        break;
                                    }
                                }
                                if (bandera2) {
                                    System.out.println("No existe tal articulo o ");
                                }
                                break;
                            }
                        }
                        if (bandera) {
                            System.out.println("No existe tal socio");
                        }
                        break;

                    case 2:
                        inputs.nextLine();
                        System.out.println("SOCIOS:");
                        for (Socio socio : local.getSocios()) {
                            System.out.printf("%s\n", socio.getNombre());
                        }
                        break;

                    case 3:
                        inputs.nextLine();
                        System.out.println("ARTICULOS: (ID - titulo - costo - disponible(1 o 0 caso contrario))");
                        for (Articulo articulo : local.getArticulos()) {
                            System.out.printf("%d - %s - %d creditos - ",
                            articulo.getID(), articulo.getTitulo(), articulo.getCosto());
                            if (articulo.estaDisponible()) {
                                System.out.printf("DISPONIBLE\n");
                            }
                            else{
                                System.out.printf("ALQUILADO\n");
                            }
                        }
                        break;

                    case 4:
                        inputs.nextLine();
                        System.out.println("\nIngrese nombre de socio:");
                        nombre= inputs.nextLine();
                        boolean bandera3= true;
                        for (Socio socio : local.getSocios()) {
                            if (socio.getNombre().equals(nombre)) {
                                bandera= false;
                                System.out.println("ARTICULOS: (ID - titulo)");
                                for (Articulo articulo : socio.getTitulos()) {
                                    System.out.printf("%d - %s\n",
                                    articulo.getID(), articulo.getTitulo());
                                }
                                System.out.println("\nIngrese ID de articula a devolver:");
                                int id= inputs.nextInt();
                                boolean bandera4= true;
                                for (Articulo articulo : local.getArticulos()) {
                                    if (articulo.getID() == id) {
                                        bandera4= false;
                                        int saldoNuevo= socio.getCreditos() + (articulo.getCosto() / 2);
                                        socio.setCreditos(saldoNuevo);
                                        local.prestar_recibirArticulo(articulo);
                                        System.out.printf("\n%s devolvio el articulo %s\n", socio.getNombre(), articulo.getTitulo());
                                        System.out.printf("El nuevo saldo de %s es de %d creditos\n\n", socio.getNombre(), socio.getCreditos());
                                        break;
                                    }
                                }
                                if (bandera4) {
                                    System.out.println("No tiene tal articulo");
                                }
                                break;
                            }
                        }
                        if (bandera3) {
                            System.out.println("No existe tal socio");
                        }
                        break;
                    
                    case 5:
                        inputs.nextLine();
                        System.out.println("\nIngrese tipo de socio (Basic, Prefer, Premium)");
                        String tipo= inputs.nextLine();
                        switch (tipo) {
                            case "Basic":
                                System.out.println("\nIngrese nombre:");
                                nombre= inputs.nextLine();
                                Basic miembroBasic= new Basic(nombre);
                                local.registrarSocio(miembroBasic);
                                break;

                            case "Prefer":
                                System.out.println("\nIngrese nombre:");
                                nombre= inputs.nextLine();
                                Prefer miembroPrefer= new Prefer(nombre);
                                local.registrarSocio(miembroPrefer);
                                break;

                            case "Premium":
                                System.out.println("\nIngrese nombre:");
                                nombre= inputs.nextLine();
                                Premium miembroPremium= new Premium(nombre);
                                local.registrarSocio(miembroPremium);
                                break;
                        
                            default:
                                System.out.println("Opcion no valida. Volviendo al menu\n");
                                break;
                        }
                        break;

                    case 6:
                        break;
                
                    default:
                        inputs.nextLine();
                        System.out.println("Opcion no valida\n");
                        break;
                }
            }
        }
        catch(InputMismatchException e1){
            System.out.println("ERROR: caracter invalido. Vuelva a ejecutar");
        }
    }
}
