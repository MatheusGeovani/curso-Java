package aula02;

public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.print("Uma caneta " + this.cor);
    }

    void rabiscar(){

    }
    void tampar(){

    }
    void destampar(){
        System.out.printf("\nA caneta esta tampada:", this.tampada ? "Sim" : "Nao");
    }
}
