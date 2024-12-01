package Final;

public abstract class Habitacion {
    Persona titular;
    String id;

    public Habitacion(Persona titular, String id) {
        this.titular = titular;
        this.id = id;
    }
}

class Doble extends Habitacion {
    final int precio = 2000;
    Persona ocupantes[];

    public Doble(Persona titular, String id) {
        super(titular, id);
        ocupantes = new Persona[2];

    }
}

class Triple extends Habitacion {
    final int precio = 2800;
    Persona ocupantes[];

    public Triple(Persona titular, String id) {
        super(titular, id);
        ocupantes = new Persona[3];
    }
}

class Cuadruple extends Habitacion {
    final int precio = 3500;
    Persona ocupantes[];

    public Cuadruple(Persona titular, String id) {
        super(titular, id);
        ocupantes = new Persona[4];
    }
}
