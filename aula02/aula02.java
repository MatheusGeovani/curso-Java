package aula02;

public class aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("Caneta");
        Caneta c2 = new Caneta("Caneta");


        c1.cor = "vermelho";
        c1.modelo = "bic";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.status();
        c1.tampDestampada();
        c1.rabiscar(); 

        c2.cor = "preto";
        c2.modelo = "faber castelo";
        c2.ponta = 10;
        c2.carga = 20;
        c2.tampada = true;
        c2.status();
        c2.tampDestampada();
        c2.rabiscar();


    }
}
