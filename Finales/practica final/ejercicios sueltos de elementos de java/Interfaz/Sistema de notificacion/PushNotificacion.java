import java.util.Scanner;

public class PushNotificacion implements Notificable, Priorizable{
    
    public PushNotificacion(){}

    @Override
    public void enviarNotificacion() {
        System.out.println("Se envió una notificacion por Push Notificacion.");
    }
    
    @Override
    public void establecerPrioridad() {
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese una prioridad del 1 al 3: ");
        int prioridad= scan.nextInt();

        while ((prioridad < 1) || (prioridad > 5)) {
            System.out.println("El numero ingresado no es un numero valido de prioridad. Ingrese nuevamente");            
            prioridad= scan.nextInt();
        }
        System.out.println("Se ha enviado un mensaje con prioridad "+ prioridad);
    }
}
