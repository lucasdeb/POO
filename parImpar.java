public class parImpar {
    public static void main(String[] args){
        /*
        //Ej. 1

        int num = 22;

        if (num%2 == 0){
            System.out.println("Es par!");
        }
        else{
            System.out.println("Es impar!");
        }
        */

        /*

        //Ej. 2
        int n1 = 24;
        int n2 = 30;

        if(n1>n2){
            System.out.println("N1 es mayor a N2");
        }
        else if(n1==n2){
            System.out.println("N1 es igual a N2");
        }
        else{
            System.out.println("N2 es mayor a N1");
        }
        */

        /*

        //Ej. 3
        int nota = 1;

        switch (nota){
            case 0:
                System.out.println("Ausente");
                break;

            case 1:
                System.out.println("Las materias se recursan, la vida no");
                break;

            case 2:
                System.out.println("Hasta la prox amigo");
                break;
            
            case 3:
                System.out.println("Zafaste");
                break;

            case 4:
                System.out.println("Bien pibe");
                break;
            
            case 5:
                System.out.println("Leeeeenda");
                break;

            default:
                System.out.println("Algo esta mal");
        }
        */

        /*
        //Ej. 4

        int matriz[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("La matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
                if(i>j){
                    int aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }
            }
        }

        System.out.println("La matriz traspuesta:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        */
    }
}
