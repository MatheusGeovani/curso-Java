package aula02;

public class Caneta {
    String nome;
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
    boolean rabiscado;

    public Caneta(String nome){
        this.nome = nome;
        this.cor = "azul";
        this.modelo = "bic";
        this.ponta = 5;
        this.carga = 80;
        this.tampada = false;
        this.rabiscado = true;
    }

    void status(){
        System.out.println("Uma caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Nao posso rabisca");
        }else{
            System.out.println("Estou rabiscando");
        }
        System.out.println("-----------------------------------------------------------");
    }
    void tampDestampada(){
        System.out.println("A caneta esta tampada: " + (this.tampada ? "Sim" : "Nao"));
    }
    
}
