public class Main {
    public static void main(String[] args) {
        Casa casita= new Casa("Pato", "Marconi 223", 1600.000, 5, 2, true, 2, true);
        Casa casita2= new Casa("Pedro", "Vicente Lopez 1639", 2000.556, 20, 4, false, 4, true);
        Departamento depto= new Departamento("Cris", "Bla 123", 1000.000, 3, 1, false, 2, false, false);
        depto.setAscensores(true, 2);
        Departamento depto2= new Departamento("Isidro", "Callao 145", 1200.000, 4, 1, true, 3, true, true);
        depto2.setAscensores(false, 0);
        /* Departamento depto3= new Departamento("Pablo", "Callao 145", 1200.000, 3, 1, true, 4, true, true);
        depto3.setAscensores(false, 3); */
        Habitacion hab= new Habitacion("Living", 25.00);
        Habitacion hab2= new Habitacion("Comedor", 25.00);
        Banio banio= new Banio(true, false, true);

        casita.aniadirHabitacion(hab);
        casita.aniadirHabitacion(hab2);
        casita.aniadirBanio(banio);

        depto.aniadirHabitacion(hab);
        depto.aniadirHabitacion(hab2);
        depto.aniadirBanio(banio);
        
        casita.recolectorDeInformacion();
        casita2.recolectorDeInformacion();
        depto.recolectorDeInformacion();
        depto2.recolectorDeInformacion();
    }
}