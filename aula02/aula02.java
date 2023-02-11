package aula02;

public class aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.modelo = "bic";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 80;
        c1.status();
    }
}
