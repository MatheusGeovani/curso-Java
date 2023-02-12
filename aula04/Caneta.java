package aula04;

public class Caneta {
    public String nome;
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public boolean rabiscado;

    public Caneta(String nome){
        this.nome = nome;
        this.cor = "azul";
        this.modelo = "bic";
        this.ponta = 5;
        this.carga = 80;
        this.tampada = false;
        this.rabiscado = true;
    }

    public void status(){
        System.out.println("Uma caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("-----------------------------------------------------------");
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Nao posso rabisca");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
    protected void tampDestampada(){
        System.out.println("A caneta esta tampada: " + (this.tampada ? "Sim" : "Nao"));
       
    }
    
}
