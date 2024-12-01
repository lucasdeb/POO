public class Programa0{
    public static void main(String[] args){

        int data = 10;
        char letra;
        boolean b = true;
        float num1 = 10.6f;
        byte dato1 = 43;
        short num2 = 100;

        //Vectors (arrays) practice

        System.out.println(num1);

        int[] array = {10,20,30,40,50};

        for(int num : array){
            System.out.println(num);
        }

        //Try catch exceptions

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
            } 
            catch (Exception i) {
            System.out.println("Something went wrong.");
            } 
            finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}