public class Heranca {
    public static void main(String[] args){
        carro carroNormal = new carro("golf");
        carro carroNormal02 = new carro("honda civic");
        CarroCombate carroCombate = new CarroCombate("gol", 50);

        carroCombate.atirar();
        carroCombate.atirar();
        carroCombate.atirar();

        carroNormal.info();
        carroNormal02.info();
        carroCombate.info();


    }
}
