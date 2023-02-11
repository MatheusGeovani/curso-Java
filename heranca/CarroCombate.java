package heranca;
public class CarroCombate extends carro {
    private final int max_armamento = 100;
    private final int min_armamento = 0;
    private int qtdeArmamento = 0;

    public CarroCombate(String nome, int blindagem){
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qtdeArmamento = 100;
    }
    public void setQtdeArmamento(int qtdeArmamento){
        this.qtdeArmamento += qtdeArmamento;
        if(this.qtdeArmamento > max_armamento) {
            this.qtdeArmamento = max_armamento;
        }
        if(this.qtdeArmamento < min_armamento) {
            this.qtdeArmamento = min_armamento;
        }
    }
    public int getQtdeArmamento (){
        return this.qtdeArmamento;
    }
    public void atirar(){
        if(this.qtdeArmamento > min_armamento){
            setQtdeArmamento(-1);
        }else {
            System.out.println("Sem armamento");
        }
    }
    public void info() {
        super.info();
        System.out.printf("Qtde.Arm....:%s%n",this.qtdeArmamento);
    }
}
