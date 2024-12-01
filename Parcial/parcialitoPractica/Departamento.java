package parcialitoPractica;

public class Departamento {
    private int Piso;
    private Boolean Ascensor;
    private int CantidadDeAscensores;
    private Boolean TieneSum;
    private Boolean Seguridad;

    public Departamento(int Piso, Boolean Ascensor, int CantidadDeAscensores, Boolean TieneSum, Boolean Seguridad) {
        this.Piso = Piso;
        this.Ascensor = Ascensor;
        this.CantidadDeAscensores = CantidadDeAscensores;
        this.TieneSum = TieneSum;
        this.Seguridad = Seguridad;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public int getPiso() {
        return Piso;
    }

    public void setAscensor(Boolean Ascensor) {
        this.Ascensor = Ascensor;
    }

    public Boolean getAscensor() {
        return Ascensor;
    }

    public void setCantidadDeAscensores(int CantidadDeAscensores) {
        this.CantidadDeAscensores = CantidadDeAscensores;
    }

    public int getCantidadDeAscensores() {
        return CantidadDeAscensores;
    }

    public void setTieneSum(Boolean TieneSum) {
        this.TieneSum = TieneSum;
    }

    public Boolean getTieneSum() {
        return TieneSum;
    }

    public void setSeguridad(Boolean Seguridad) {
        this.Seguridad = Seguridad;
    }

    public Boolean getSeguridad() {
        return Seguridad;
    }
}
