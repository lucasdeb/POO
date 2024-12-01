public class Asistente extends Empleado{
    private String proyecto;

    public Asistente(){}
    public Asistente(String proyecto){
        this.proyecto= proyecto;
    }
    public Asistente(String nom, double sal, int ant, String proyecto){
        super(nom, sal, ant);
        this.proyecto= proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public void getInformacion() {
        super.getInformacion();
        System.out.printf(" y su proyecto es %s\n", this.proyecto);
    }
}
