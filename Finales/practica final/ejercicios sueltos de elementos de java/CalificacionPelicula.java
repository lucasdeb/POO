public class CalificacionPelicula {
    public static void main(String[] args) {
        int calificacion = 3;

        switch (calificacion) {
            case 1:
                System.out.println("Horrible");
                break;
            case 2:
                System.out.println("Mala");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Buena");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Calificación no válida");
        }
    }
}
