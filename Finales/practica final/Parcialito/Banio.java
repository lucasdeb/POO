public class Banio {
    private boolean tieneDucha;
    private boolean tieneBaniera;
    private boolean tieneBidet;

    public Banio(){}
    public Banio(boolean ducha, boolean baniera, boolean bidet){
        this.tieneDucha= ducha;
        this.tieneBaniera= baniera;
        this.tieneBidet= bidet;
    }

    public boolean tieneDucha(){
        return this.tieneDucha;
    }
    public boolean tieneBaniera(){
        return this.tieneBaniera;
    }
    public boolean tieneBidet(){
        return this.tieneBidet;
    }
    public void setTieneDucha(boolean tieneDucha) {
        this.tieneDucha = tieneDucha;
    }
    public void setTieneBaniera(boolean tieneBaniera) {
        this.tieneBaniera = tieneBaniera;
    }
    public void setTieneBidet(boolean tieneBidet) {
        this.tieneBidet = tieneBidet;
    }

    public void recolectorDeInformacionB(){
        System.out.print("Tiene ducha: ");
        if (this.tieneDucha()) {
            System.out.print("Si\nTiene baniera: ");
        }else{
            System.out.print("No\nTiene baniera: ");
        }
        if (this.tieneBaniera()) {
            System.out.print("Si\nTiene bidet: ");
        }else{
            System.out.print("No\nTiene bidet: ");
        }
        if (this.tieneBidet()) {
            System.out.print("Si\n");
        }else{
            System.out.print("No\n");
        }
    }
}
