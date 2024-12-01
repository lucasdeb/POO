public class ProbarArgs {
    public ProbarArgs(){}

    public int suma(int a, int b, int ... nums){
        int sum= a + b;
        for(int i= 0; i < nums.length; i++){
            sum+= nums[i];
        }
        return sum;
    }
    public void probar(){
        int valor= suma(1,2,3,4,5,6,9);
        int valor2= suma(1,5);
        System.out.println(valor+"\n"+valor2);
    }
}