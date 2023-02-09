public class Jogador {

    private int num = 0;
    private int vidas = 0;
    private int mana = 0;

    public Jogador(int num){
        this.vidas = 3;
        this.mana = 0;
        this.num = num;
        System.out.printf("%nJogador numero %d criado%n",num);
    }
    public int getVidas () {
        return this.vidas;
    }
    public int getMana () {
        return this.mana;
    }
    public void setMana (int mana) {
        this.mana = mana;
    }
}



