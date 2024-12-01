package Final;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Hotel {
    public static void main(String[] args) {
        List<Habitacion> habitaciones = new ArrayList<Habitacion>();
        // Me falto hacer esto y la logica/verificacion completa de checkin y checkout

    }

    public void checkIn(List<Habitacion> habitaciones) {
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        String apellido = scanner.nextLine();
        int edad = scanner.nextInt();
        String genero = scanner.nextLine();
        int dni = scanner.nextInt();
        Persona titular = new Persona(nombre, apellido, edad, genero, dni);
        String id = scanner.nextLine();
        int tipo = scanner.nextInt();
        switch (tipo) {
            case 1:
                for (int i = 0; i > 12; i++) {
                }
                Doble doble = new Doble(titular, id);
                habitaciones.add(doble);
                break;
            case 2:
                Triple triple = new Triple(titular, id);
                habitaciones.add(triple);
                break;
            case 3:
                Cuadruple cuadruple = new Cuadruple(titular, id);
                habitaciones.add(cuadruple);
                break;
        }

    }

    public void checkOut(Habitacion habitacion) {
        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();
        int precio = habitacion.precio;
        double total = dias * precio;
        if ((habitacion.titular.edad > 65 & habitacion.titular.genero == "Mujer")
                || (habitacion.titular.edad > 70 & habitacion.titular.genero == "Hombre")) {
            total = total * 1.25;
        }
    }
}
