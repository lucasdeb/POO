public class Obrero extends Empleado{
    private String especialidad;

    public Obrero(){}
    public Obrero(String esp){
        this.especialidad= esp;
    }
    public Obrero(String nom, double sal, int ant, String esp){
        super(nom, sal, ant);
        this.especialidad= esp;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void getInformacion() {
        super.getInformacion();
        System.out.printf(" y su especialidad es %s\n", this.especialidad);
    }
}
