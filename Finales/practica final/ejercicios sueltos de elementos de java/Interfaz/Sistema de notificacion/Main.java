public class Main {
    public static void main(String[] args) {
        CorreoElectronico mail= new CorreoElectronico();
        PushNotificacion pshNoti= new PushNotificacion();
        SMS sms= new SMS();

        mail.establecerPrioridad();
        mail.enviarNotificacion();

        pshNoti.establecerPrioridad();
        pshNoti.enviarNotificacion();

        sms.establecerPrioridad();
        sms.enviarNotificacion();
    }
}