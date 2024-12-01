package parcialitoPractica;

public class Casa {
    private int CantidadDePisos;
    private Boolean Patio;

    public Casa (int CantidadDePisos, Boolean Patio){
        this.CantidadDePisos = CantidadDePisos;
        this.Patio = Patio;
    }

    public void setCantidadDePisos(int CantidadDePisos){
        this.CantidadDePisos = CantidadDePisos;
    }

    public int getCantidadDePisos(){
        return CantidadDePisos;
    }

    public void setPatio(Boolean Patio){
        this.Patio = Patio;
    }

    public Boolean getPatio(){
        return Patio;
    }
}
