public class matrizess {
    public static void main(String[] args) {
        int [][] numeros = {{10,20,40,50,60},{40,20,31,55,90},{30,40,50,60,70}};

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(numeros[i][j]);
                System.out.print("|");
            }
            System.out.println("\n");
        }
    }
}