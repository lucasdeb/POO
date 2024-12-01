public class Instructor {
    String nombre;
    String especialidad;
    String horario;

    public Instructor(String nombre, String especialidad, String horario) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horario = horario;
    }

    public void getNombre(String nombre) {
        System.out.println(nombre);
    }

    public void getEspecialidad(String especialidad) {
        System.out.println(especialidad);
    }

    public void getHorario(String horario) {
        System.out.println(horario);
    }
}
