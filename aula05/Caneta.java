package aula05;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public Caneta(String modelo, String cor, float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public void status (){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Ponta: "+ getPonta());
        System.out.println("Cor: "+ getCor());
        System.out.println("Esta tampada: " + this.tampada);
    }
    
}
