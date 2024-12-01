public class Main{
    public static void main(String[] args) {
        Vegetal planta= new Vegetal(3.3, 0, "Asexual", 67, 0.3);
        planta.nacer();
        planta.mostrarInfo();
        planta.crecer(1);
        planta.crecer(5);
        planta.crecer(10);
        planta.hacerFotosintesis();
        planta.renovarExtensiones();
        planta.mostrarInfo();
        SerVivo hija= planta.reproducir();
        planta.morir();

        hija.mostrarInfo();

    }
}