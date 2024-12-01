import java.lang.Math;
import java.util.Random;

public class Vegetal extends SerVivo{
    private int extensiones;
    private double largoRaices;

    public Vegetal(){}
    public Vegetal(double tam, int edad, String reproduccion, int cant, double largo){
        super(tam, edad, reproduccion);
        this.extensiones= cant;
        this.largoRaices= largo;
    }

    public int getExtensiones() {
        return extensiones;
    }
    public double getLargoRaices() {
        return largoRaices;
    }
    public void setExtensiones(int extensiones) {
        this.extensiones = extensiones;
    }
    public void setLargoRaices(double largoRaices) {
        this.largoRaices = largoRaices;
    }

    @Override
    public void nutrirse() {
        System.out.println("Por medio de sus raíces adquiere los nutrientes correspondientes.");
    }
    @Override
    public void crecer(int anios) {
        double nuevoTam= super.getTamanio();
        if (super.getEdad() < 3) {
            int aniosRestantes= 3 - super.getEdad();
            if (anios - aniosRestantes >= 0) {
                int primerosAnios= aniosRestantes;
                int restoAnios= anios - aniosRestantes;
                nuevoTam+= primerosAnios * 15 * nuevoTam;
                nuevoTam+= restoAnios * 0.75 * nuevoTam;
                
            }
            else{
                nuevoTam+= anios * 15 * nuevoTam;
            }
        }
        else{
            nuevoTam+= anios * 0.75 * nuevoTam;
        }
        System.out.printf("Crecio a %.2f centimetros cubicos.\n", nuevoTam);
        super.setTamanio(nuevoTam);
        this.largoRaices+= Math.pow(nuevoTam, (1/3)) * 0.6;
        
        int nuevaEdad= super.getEdad() + anios;
        super.setEdad(nuevaEdad);
    }
    @Override
    public void nacer() {
        super.nacer();
        System.out.println("Es un vegetal.");
    }
    @Override
    public void morir() {
        super.morir();
        System.out.println("Es un vegetal.");
    }
    @Override
    public void mostrarInfo() {
        System.out.printf("Este vegetal tiene las siguientes caracteristicas:\nTamaño: %.2f\n"+
        "Edad: %d\nForma de reproducirse: %s\n", super.getTamanio(), super.getEdad(), super.getFormaDeReproduccion());
        System.out.printf("Cantidad de extensiones: %d\nLargo de raices: %.2f.\n",
        this.extensiones, this.largoRaices);
    }
    @Override
    public SerVivo reproducir() {
        Random aleatorio= new Random();
        double tam= aleatorio.nextDouble(5) + 0.1;
        int cant= aleatorio.nextInt(extensiones) + 20;
        double largo= aleatorio.nextDouble(0.7) + 0.1;
        Vegetal planta= new Vegetal(tam, 0, getFormaDeReproduccion(), cant, largo);
        return planta;
    }

    public void hacerFotosintesis(){
        System.out.println("Se hace la fotosintesis.");
    }
    public void renovarExtensiones(){
        System.out.println("Llego el otoño y por ende renueva las hojas o extensiones que tenga.");
    }
}
