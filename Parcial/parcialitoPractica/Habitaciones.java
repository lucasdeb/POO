package parcialitoPractica;

public class Habitaciones {
    private String NombreHabitacion;
    private Double MetrosCuadradosHabitacion;

    public Habitaciones(String NombreHabitacion, Double MetrosCuadradosHabitacion){
        this.NombreHabitacion = NombreHabitacion;
        this.MetrosCuadradosHabitacion = MetrosCuadradosHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.NombreHabitacion = nombreHabitacion;
    }

    public String getNombreHabitacion() {
        return NombreHabitacion;
    }

    public void setMetrosCuadradosHabitacion(int CantidadHabitaciones, Double MetrosCuadrados, Double MetrosCuadradosHabitacion){
        MetrosCuadradosHabitacion = MetrosCuadrados/CantidadHabitaciones;
    }

    public Double getMetrosCuadradosHabitacion(){
        return MetrosCuadradosHabitacion;
    }
}
