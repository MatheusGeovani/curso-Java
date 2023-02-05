public class notaAluno {
    public static void main(String[] args) {
        final int tam = 5;
        char[] gabarito = {'a', 'b', 'c', 'd', 'e'};
        char[] respostas = new char[tam];
        int nota = 0;

        respostas[0] = 'a'; 
        respostas[1] = 'b'; 
        respostas[2] = 'b';
        respostas[3] = 'e'; 
        respostas[4] = 'd';
        
        for(int i = 0; i < tam; i++) {
            if(gabarito[i] == respostas[i]){
                nota++;
            }
        }
        System.out.println("O aluno tirou "+ nota + " de " + tam);
    }
}
