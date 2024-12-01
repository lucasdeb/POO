public class Gerente extends Empleado{
    private String departamento;

    public Gerente(){}
    public Gerente(String depto){
        this.departamento= depto;
    }
    public Gerente(String nom, double sal, int ant, String depto){
        super(nom, sal, ant);
        this.departamento= depto;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void getInformacion(){
        super.getInformacion();
        System.out.printf(" y su departamento es %s\n", this.departamento);
    }
}
