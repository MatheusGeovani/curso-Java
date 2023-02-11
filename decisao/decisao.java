package decisao;
public class decisao {
    public static void main(String[] args) {
        // == > < >= <= != !

        int nota = 50 ;
        int faltas = 20;
        int limiteFaltas = 30;
        int media = 60;

        if(nota >= media && faltas > limiteFaltas || nota >= 40 &&  nota < media) {
            System.out.println("Voce esta de recuperacao!");
        }
        else if(nota >= media){
            System.out.println("Voce foi aprovado!");
        }
        else {
            System.out.println("Voce foi reprovado!");
        }
        System.out.println("Fim do programa!");
    }
}
