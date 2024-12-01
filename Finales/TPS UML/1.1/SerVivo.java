public abstract class SerVivo {
    private double tamanio;
    private int edad;
    private String formaDeReproduccion;

    public SerVivo(){}
    public SerVivo(double tam, int edad, String reproduccion){
        this.tamanio= tam;
        this.edad= edad;
        this.formaDeReproduccion= reproduccion;
    }
    
    public double getTamanio() {
        return tamanio;
    }
    public int getEdad() {
        return edad;
    }
    public String getFormaDeReproduccion() {
        return formaDeReproduccion;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setFormaDeReproduccion(String formaDeReproduccion) {
        this.formaDeReproduccion = formaDeReproduccion;
    }

    public abstract void mostrarInfo();
    public abstract void nutrirse();
    public abstract void crecer(int anios);
    public abstract SerVivo reproducir();
    public void nacer(){
        System.out.println("Nace un ser vivo.");
    }
    public void morir(){
        System.out.println("Muere un ser vivo.");
    }
}
/*
System.out.println("Se reproduce el ser vivo.");
SerVivo cria;
return cria;
*/