public class CartaNormal extends Carta{
    
    public CartaNormal(){}
    public CartaNormal(int num, String color){
        super(num, color);
    }

    @Override
    public void efecto() {
        System.out.println("Sumas "+ super.getNumeroCarta() +" puntos.");
    }
}
