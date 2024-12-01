package parcialitoPractica;

public class Baño {
    private Boolean tieneDucha;
    private Boolean tieneBañera;
    private Boolean tieneBidet;

    public Baño(Boolean tieneDucha, Boolean tieneBañera, Boolean tieneBidet){
        this.tieneDucha = tieneDucha;
        this.tieneBañera = tieneBañera;
        this.tieneBidet = tieneBidet;
    }

    public void settieneBañera(Boolean tieneBañera){
        this.tieneBañera = tieneBañera;
    }

    public Boolean gettieneBañera(){
        return tieneBañera;
    }

    public void settieneDucha(Boolean tieneDucha){
        this.tieneDucha = tieneDucha;
    }

    public Boolean gettieneDucha(){
        return tieneDucha;
    }

    public void settieneBidet(Boolean tieneBidet){
        this.tieneBidet = tieneBidet;
    }

    public Boolean gettieneBidet(){
        return tieneBidet;
    }


}
