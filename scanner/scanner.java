package scanner;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        final int tam = 5;
        char[] gabarito = {'a', 'b', 'c', 'd', 'e'};
        char[] respostas = new char[tam];
        int nota = 0;
        Scanner scan = new Scanner(System.in);
        
        
        for(int i = 0; i < tam; i++) {
            respostas[i] = (scan.nextLine()).charAt(0);
            if(gabarito[i] == respostas[i]){

                nota++;

            }
        }
        System.out.println("O aluno tirou "+ nota + " de " + tam);
        scan.close();
    }
}

