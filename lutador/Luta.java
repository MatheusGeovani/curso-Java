package lutador;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int vencedor;

    public Luta(){

    }
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if(this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random(); 
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===== RESULTADO DA LUTA =====");
                switch (vencedor){
                    case 0:
                        System.out.println("Empatou");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("Vitoria do " + this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2: 
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
            }
            System.out.println("====================================");
        }else {
            System.out.println("Luta nao pode acontecer");
        }
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    public int getRounds(){
        return this.rounds;
    }
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
}
