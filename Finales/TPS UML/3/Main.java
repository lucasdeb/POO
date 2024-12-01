import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Guionista guionista= new Guionista("B", "B", "5/3/1994", 2000);
        String guion= guionista.escribirGuion();
        Productor productor= new Productor("C", "C", "4/3/1997", 2004);
        Genero genre= new Genero("Comedia", "Para hacer reir");

        Pelicula peli= productor.producir(guion, "Madagascar", "En la selva", 2003, 3, genre);
        
        System.out.println(peli.getNombre()+", "+peli.getSinopsis());
        System.out.println(peli.getGenero().getTipo());

        ArrayList<Personaje> personajes= new ArrayList<>();
        personajes.add(new Personaje("Alex", "el leon"));
        personajes.add(new Personaje("Marty", "la sebra"));
        Actor actor= new Actor("A", "A", "6/10/1994", 3000, personajes);
        
        Editor editor= new Editor("D", "D", "5/6/1995", 2060);
        Director director= new Director("E", "E", "2/5/1999", 4023);

        peli.agregarMiembro(actor);
        peli.agregarMiembro(guionista);
        peli.agregarMiembro(productor);
        peli.agregarMiembro(editor);
        peli.agregarMiembro(director);


    }
}