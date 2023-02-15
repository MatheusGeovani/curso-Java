package banco;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    // protected String cp;
    // protected String cc;
    private String dono;
    private float saldo;
    private boolean status;
    public float sacar;
    public float mensalidade;
    public float depositar;

    public ContaBanco(){
        this.setNumDaConta(0000);;
        this.tipoConta = "Sem conta";
        // this.cc = cc;
        // this.cp = cp;
        this.dono = dono;
        this.setSaldo(0);
        this.status = false;
    }
    public int getNumDaConta(){
        return numConta;
    }
    public void setNumDaConta(int n){
        this.numConta = n;
    }
    public String getPoupanca(){
        return this.tipoConta;
    }
    public void setPoupanca(String conta){
        this.tipoConta = conta;
    }
    public String getCorrente(){
        return this.tipoConta;
    }
    public void setCorrente(String conta){
        this.tipoConta = conta;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(int saldo){
        if(status == true){
            this.saldo = saldo;
        }
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public void abrirConta(String text){
        status = true;
        if(text == "Conta Corrente"){
            tipoConta = text;
            this.saldo = 50;
        } else {
            tipoConta = text;
            this.saldo = 150;
        }
    }
    public void fecharConta() {
        if(saldo == 0){
            status = false;
            this.numConta = 00000;
            this.tipoConta = "Sem conta";
        } else {
            System.out.println("Verifique seu saldo");
        }
    }
    public float getDepositar(){
        return this.depositar;
    }
    public void setDepositar(float depositar){
        if(status == true){
            this.depositar += depositar;
            saldo += this.depositar;
        }else {
            System.out.println("Verifique se a conta esta aberta!");
        }
    }
    public float getSacar(){
        return this.sacar;
    }
    public void setSacar(float sacar){
        if(sacar <= saldo && saldo > 0 && status == true){
            saldo -= sacar;
        }
    }
    public float getMensalidade(){
        return this.mensalidade;
    }
    public void setPagarMensalidade(){
        if(tipoConta == getCorrente() && status == true){
            saldo -= 12;
        }else if(tipoConta == getPoupanca() && status == true) {
            saldo -= 20;
        }
    }
    public void situacaoConta(){
        System.out.println("Dono...............: " + this.dono);
        System.out.println("Tipo da conta......: " + this.tipoConta);
        System.out.println("Num da conta.......: " + this.numConta);
        System.out.println("Status da conta....: " + (this.status ? "Aberta" : "Fechada"));
        System.out.println("Saldo..............: " + this.saldo);
    }
}
