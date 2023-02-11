package curso;
public class cursoJava {
    public static void main (String[] args){

        int num = 0;
        num = 24;
        String nome = "Matheus";

        System.out.print("Matheus\n"); // não realiza quebra de linha
        System.out.println("Curso de java!"); // realiza quebra de linha no final
        System.out.printf("%s - %d","Matheus", 24); 
        System.out.printf("\nValor da variavel num:%d",num);
        System.out.printf("\nMeu nome e %s e tenho %d anos",nome,num);
    }
}