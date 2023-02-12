package aula03;

public class aula03 {
    public static void main(String[] args){
        estudar estudo = new estudar();
        estudar estudo02 = new estudar();

        estudo.canal = "Curso em video";
        estudo.disciplina = "POO";
        estudo.linguagem = "Java";
        estudo.tempo = 60;
        estudo.status();
        estudo.exercicios();
        estudo.assistindo();
        estudo.linguagem();

        estudo02.canal = "Rodrigo Branas";
        estudo02.disciplina = "API";
        estudo02.linguagem = "JavaScript";
        estudo02.tempo = 40;
        estudo02.status();
        estudo02.exercicios();
        estudo02.assistindo();
        estudo02.linguagem();
    }
}
