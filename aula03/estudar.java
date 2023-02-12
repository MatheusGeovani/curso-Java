package aula03;

public class estudar {
    int tempo;
    String disciplina;
    String linguagem;
    String canal;

    public estudar(){
        this.tempo = 0;
        this.disciplina = "POO";
        this.linguagem = "java";
        this.canal = "curso em video";
    }
    void status(){
        System.out.println("Linguagem: "+ this.linguagem);
        System.out.println("Canal: "+ this.canal);
        System.out.println("Disciplina: "+ this.disciplina);
        System.out.println("Tempo: "+ this.tempo);
    }
    void exercicios(){
        System.out.println("Aula 03");
    }
    void assistindo(){
    System.out.println("Qual canal esta assistindo: " + (this.canal));
    }
    void linguagem(){
        System.out.println("Linguagem: " + (this.linguagem));
        System.out.println("---------------------------------------");
    }


}
