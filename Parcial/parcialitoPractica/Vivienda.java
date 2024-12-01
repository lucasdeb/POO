package parcialitoPractica;

public class Vivienda {
    private String propietario;
    private String Direccion;
    private Double MetrosCuadrados;
    private int CantidadHabitaciones;
    private Boolean TieneCochera;
    private int CantidadBaños;

    public Vivienda (String propietario, String Direccion, Double MetrosCuadrados, int CantidadHabitaciones, Boolean TieneCochera, int CantidadBaños){
        this.propietario = propietario;
        this.Direccion = Direccion;
        this.MetrosCuadrados = MetrosCuadrados;
        this.CantidadHabitaciones = CantidadHabitaciones;
        this.TieneCochera = TieneCochera;
        this.CantidadBaños = CantidadBaños;

    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setMetrosCuadrados(Double MetrosCuadrados) {
        this.MetrosCuadrados = MetrosCuadrados;
    }

    public Double getMetrosCuadrados() {
        return MetrosCuadrados;
    }

    public void setCantidadHabitaciones(int CantidadHabitaciones) {
        this.CantidadHabitaciones = CantidadHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return CantidadHabitaciones;
    }

    public void setTieneCochera(Boolean TieneCochera) {
        this.TieneCochera = TieneCochera;
    }

    public Boolean getTieneCochera() {
        return TieneCochera;
    }

    public void setCantidadBaños(int CantidadBaños) {
        this.CantidadBaños = CantidadBaños;
    }

    public int getCantidadBaños() {
        return CantidadBaños;
    }
}
