public class Main {

    public static void main(String[] args) {
        JuegoMobile juego1= new JuegoMobile("Tetris", 2001, 157);
        JuegoPC juego2= new JuegoPC("COD", 2007, "Activision");

        BibliotecaDeJuegos biblio= new BibliotecaDeJuegos();
        biblio.addItem(juego1);
        biblio.addItem(juego2);

        Member miembro1= new Member("Patricio");
        Member miembro2= new Member("Cristian");

        biblio.registerMember(miembro1);
        biblio.registerMember(miembro2);

        miembro1.borrowItem(juego2);
        miembro2.borrowItem(juego2);

        JuegoPC juego3= new JuegoPC("Battlefield", 2003, "NoSe");
        JuegoMobile juego4= new JuegoMobile("flappybird", 2010, 122);

        juego3.displayInformacion();
        juego4.displayInformacion();
    }
}