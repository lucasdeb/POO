public class CartaEspecial extends Carta{
    
    public CartaEspecial(){}
    public CartaEspecial(int num, String color){
        super(num, color);
    }

    @Override
    public void efecto() {
        switch (super.getNumeroCarta()) {
            case 1:
                System.out.println("Gana 5 puntos.");
                break;

            case 2:
                System.out.println("El jugador contrario pierde 5 puntos.");
                break;

            case 3:
                System.out.println("Le roba 10 puntos al jugador contrario.");
                break;
            
            default:
                System.out.println("Suma la mitad de puntos que tiene actualmente el jugador contrario.");
                break;
        }
    }
}
