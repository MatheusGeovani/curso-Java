package array;
public class array {
    public static void main(String[] args){
        int[] numeros = {10,20,30,40,50};

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == 40){
                System.out.println(i+1);
                break;
            }
        }
    }
}