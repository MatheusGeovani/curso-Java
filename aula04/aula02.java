package aula04;

public class aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("Caneta");



        c1.cor = "vermelho";
        c1.modelo = "bic";
        //c1.ponta = 0.5f;
        //c1.tampada = true;
        c1.rabiscar();
        c1.tampDestampada(); 
        c1.carga = 80;
        c1.status();
        


    }
}
