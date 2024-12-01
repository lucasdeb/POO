import java.util.ArrayList;

public class Hotel {
    private int capacidad;
    private ArrayList<Habitacion> habitaciones;// Tamaño maximo 10 habitaciones
    private ArrayList<Persona> personas;// Tamaño maximo definido por la cantidad de habitaciones disponible

    public Hotel(){
        this.capacidad= 0;
        this.habitaciones= new ArrayList<Habitacion>();
        this.personas= new ArrayList<Persona>();
    }

    public int getCapacidad() {
        return capacidad;
    }
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void agregarPersona(Persona persona){
        if (this.personas.size() < capacidad) {
            this.personas.add(persona);
            System.out.println("Se aniadio a una persona.");
            persona.verDatos();
            this.capacidad--;
        }
        else{
            System.out.println("El hotel alcanzo su cupo maximo.");
        }
    }

    public void agregarHabitacion(Habitacion habitacion){
        this.habitaciones.add(habitacion);
        this.capacidad+= habitacion.getCapacidad();
    }

    public void checkIn(ArrayList<Persona> personas){
        boolean bandera= true;
        switch (personas.size()) {
            case 1:
                for (Habitacion habitacion : this.habitaciones) {
                    if (habitacion.getCapacidad() == 1 && !(habitacion.estaOcupada())) {
                        habitacion.setUsuarios(personas);
                        break;
                    }
                    else if (habitacion.getCapacidad() == 2 && !(habitacion.estaOcupada())) {
                        habitacion.setUsuarios(personas);
                        break;
                    }
                    else if (habitacion.getCapacidad() == 3 && !(habitacion.estaOcupada())) {
                        habitacion.setUsuarios(personas);
                        break;
                    }
                    else{
                        this.capacidad= 0;// No es posible meter mas personas individuales
                        bandera= false;
                        break;
                    }
                }
                if (bandera) {
                    for (Persona persona : personas) {
                        agregarPersona(persona);
                    }
                }
                break;
            case 2:
                for (Habitacion habitacion : this.habitaciones) {
                    if (habitacion.getCapacidad() == 2 && !(habitacion.estaOcupada())) {
                        habitacion.setUsuarios(personas);
                        break;
                    }
                    else if (habitacion.getCapacidad() == 3 && !(habitacion.estaOcupada())) {
                        habitacion.setUsuarios(personas);
                        break;
                    }
                    else{
                        bandera= false;
                        break;
                    }
                }
                if (bandera) {
                    for (Persona persona : personas) {
                        agregarPersona(persona);
                    }
                }
                break;
            case 3:
                for (Habitacion habitacion : this.habitaciones) {
                    if (habitacion.getCapacidad() == 2 && !(habitacion.estaOcupada())) {
                        habitacion.setUsuarios(personas);
                        break;
                    }
                    else if (habitacion.getCapacidad() == 3 && !(habitacion.estaOcupada())) {
                        habitacion.setUsuarios(personas);
                        break;
                    }
                    else{
                        bandera= false;
                        break;
                    }
                }
                if (bandera) {
                    for (Persona persona : personas) {
                        agregarPersona(persona);
                    }
                }
                break;
        
            default:
                break;
        }
    }
}
