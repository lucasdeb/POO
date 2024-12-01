package Clase20231006;

import java.util.Scanner;

interface Notificable {
    void enviarNotificacion(String mensaje);
}

class CorreoElectronico implements Notificable {
    private String correo;
    private String mensaje;

    public CorreoElectronico(String correo, String mensaje) {
        this.correo = correo;
        this.mensaje = mensaje;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Correo: " + correo + " Mensaje: " + mensaje);
    }
}

class SMS implements Notificable {
    private String numero;
    private String mensaje;

    public SMS(String numero, String mensaje) {
        this.numero = numero;
        this.mensaje = mensaje;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Numero de Telefono: " + numero + " Mensaje: " + mensaje);
    }
}

public class SistemaDeNotificacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresar mensaje a mandar: ");
        String mensaje = input.nextLine();
        System.out.print("Ingresar correo electronico: ");
        String correo = input.nextLine();
        System.out.print("Ingresar numero de telefono: ");
        String numero = input.nextLine();

        CorreoElectronico CorreoElectronico = new CorreoElectronico(correo, mensaje);
        SMS sms = new SMS(numero, mensaje);

        CorreoElectronico.enviarNotificacion(mensaje);
        sms.enviarNotificacion(mensaje);

    }
}
