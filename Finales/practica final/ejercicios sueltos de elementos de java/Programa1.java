public class Programa1 {
    public static void main(String[] args) {
        // Crear variables
        char letra;
        String nombre;
        boolean esEstudiante;
        int edad;
        float temperatura;
        byte datoByte;
        short datoShort;
        long poblacion;

        // Inicializar las variables
        letra = 'A';
        nombre = "Juan";
        esEstudiante = true;
        edad = 25;
        temperatura = 27.5f;
        datoByte = 42;
        datoShort = 1000;
        poblacion = 789654123;

        // Imprimir los valores de las variables
        System.out.println("Char: " + letra);
        System.out.println("String: " + nombre);
        System.out.println("boolean: " + esEstudiante);
        System.out.println("int: " + edad);
        System.out.println("float: " + temperatura);
        System.out.println("Dato byte: " + datoByte);
        System.out.println("Dato short: " + datoShort);
        System.out.println("long: " + poblacion);
    }
}
