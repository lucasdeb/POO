import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Persona cargarPersona(){
        Scanner inputs= new Scanner(System.in);
        boolean bandera;

        System.out.println("Ingrese nombre:");
        String nombre= inputs.nextLine();
        System.out.println("Ingrese apellido:");
        String apellido= inputs.nextLine();
        System.out.println("Ingrese genero (Masculino/Femenino):");
        String genero= inputs.nextLine();
        System.out.println("Ingrese DNI:");
        int DNI=0;
        bandera= true;
        while (bandera) {
            try {
                DNI= inputs.nextInt();
                bandera= false;
            } catch (InputMismatchException e) {
                System.out.println("ERROR, esta ingresando caracteres invalidos:\n"+
                e+"\nPor favor ingrese un DNI:");
                inputs.nextLine();
            }
        }
        System.out.println("Ingrese edad:");
        int edad=0;
        bandera= true;
        while (bandera) {
            try {
                edad= inputs.nextInt();
                bandera= false;
            } catch (InputMismatchException e) {
                System.out.println("ERROR, esta ingresando caracteres invalidos:\n"+
                e+"\nPor favor ingrese una edad:");
                inputs.nextLine();
            }
        }
        inputs.nextLine();

        Persona persona= new Persona(nombre, apellido, genero, DNI, edad);
        return persona;
    }

    public static void menu(Agencia concesionaria){
        Scanner inputs= new Scanner(System.in);
        boolean bandera, op1, op3;
        String tipo, codigo;
        ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
        Persona auxP;
        int dias= 0;

        
        int opcion= -1;
        bandera= true;
        while (bandera) {
            try {
                while (opcion != 0) {
                    System.out.println("OPCIONES:\n1_Alquilar vehiculo\n2_Mostrar stock\n3_Devolver vehiculo\n0_Salir\nIngrese opcion:");
                    opcion= inputs.nextInt();

                    switch (opcion) {
                        case 1:
                            op1= true;
                            System.out.println("Ingrese tipo de vehiculo (moto, auto, camioneta):");
                            inputs.nextLine();
                            while (op1) {
                                tipo= inputs.nextLine();
                                op1= false;
                                switch (tipo) {
                                    case "moto":
                                        for (int i = 0; i < 2; i++) {
                                            auxP=cargarPersona();
                                            listaPersonas.add(auxP);
                                        }
                                        concesionaria.sistemaConcesionVehiculo(listaPersonas);
                                        listaPersonas.clear();
                                        break;
            
                                    case "auto":
                                        for (int i = 0; i < 4; i++) {
                                            auxP=cargarPersona();
                                            listaPersonas.add(auxP);
                                        }
                                        concesionaria.sistemaConcesionVehiculo(listaPersonas);
                                        listaPersonas.clear();
                                        break;
            
                                    case "camioneta":
                                        for (int i = 0; i < 5; i++) {
                                            auxP=cargarPersona();
                                            listaPersonas.add(auxP);
                                        }
                                        concesionaria.sistemaConcesionVehiculo(listaPersonas);
                                        listaPersonas.clear();
                                        break;
                                    default:
                                        System.out.println("La opcion ingresada no es valida. Por favor ingrese nuevamente una opcion.");
                                        op1= true;
                                        break;
                                }
                            }
                            break;

                        case 2:
                            concesionaria.mostrarRegistro();
                            break;

                        case 3:
                            op3= true;
                            System.out.println("Ingrese la cantidad de dias que uso el vehiculo");
                            while (op3) {
                                dias= inputs.nextInt();
                                if (dias < 1) {
                                    System.out.println("No puede ingresar numeros menores a 0");
                                    inputs.nextLine();
                                    continue;
                                }
                                op3= false;
                            }
                            inputs.nextLine();
                            op3= true;
                            System.out.println("Ingrese el codigo unico de su vehiculo:");
                            codigo= inputs.nextLine();
                            while (op3) {
                                for (Vehiculo vehiculo : concesionaria.getVehiculos()) {
                                    if (codigo.equals(vehiculo.getCodigoUnico())) {
                                        op3= false;
                                        concesionaria.recibirVehiculo(vehiculo, dias);
                                    }
                                }
                                if (op3) {
                                    System.out.println("El codigo ingresado no es valido. Por favor ingrese nuevamente su codigo.");
                                    codigo= inputs.nextLine();
                                }
                            }
                            break;

                        case 0:
                            break;

                        default:
                            System.out.println("La opcion ingresada no es valida. Por favor ingrese nuevamente una opcion.");
                            break;
                    }
                    //inputs.nextLine();
                }
                bandera= false;
            }
            catch (InputMismatchException e) {
                System.out.println("ERROR, esta ingresando caracteres invalidos:\n"+
                e+"\nSe resetea el progreso. Por favor ingrese una opcion valida:");
                inputs.nextLine();
            }
        }
    }

    public static void main(String[] args) {

        Agencia concesionaria= new Agencia();

        menu(concesionaria);
    }
}