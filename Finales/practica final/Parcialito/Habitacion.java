public class Habitacion {
    private String nombreHabitacion;
    private double metrosCuadradosHabitacion;

    public Habitacion(){}
    public Habitacion(String nomHabitacion, double mtr2Habitacion){
        this.nombreHabitacion= nomHabitacion;
        this.metrosCuadradosHabitacion= mtr2Habitacion;
    }

    public String getNombreHabitacion() {
        return this.nombreHabitacion;
    }
    public double getMetrosCuadradosHabitacion() {
        return this.metrosCuadradosHabitacion;
    }
    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }
    public void setMetrosCuadradosHabitacion(double metrosCuadradosHabitacion) {
        this.metrosCuadradosHabitacion = metrosCuadradosHabitacion;
    }

    public void recolectorDeInformacionH(){
        System.out.printf("Tipo de habitacion: %s\nMetros cuadrados: %.3f\n",
        this.getNombreHabitacion(), this.getMetrosCuadradosHabitacion());
    }
}
