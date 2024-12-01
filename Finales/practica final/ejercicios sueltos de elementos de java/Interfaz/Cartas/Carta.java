public abstract class Carta {
    private int numeroCarta;
    private String colorCarta;

    public Carta(){}
    public Carta(int num, String color){
        this.numeroCarta= num;
        this.colorCarta= color;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }
    public String getColorCarta() {
        return colorCarta;
    }
    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }
    public void setColorCarta(String colorCarta) {
        this.colorCarta = colorCarta;
    }

    public abstract void efecto();
}
