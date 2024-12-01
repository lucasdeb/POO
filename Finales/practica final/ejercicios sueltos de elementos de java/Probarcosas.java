public class Probarcosas {
    public static void main(String[] args) {
        int[] lista= {1,2,3,4};
        int[] lista2= lista;
        System.out.println(lista2.length);
        int i=0;
        for (int num : lista2) {
            System.out.printf("i=%d, num=%d \n", i, num);
            i++;
        }
    }
}
