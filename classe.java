public class classe {
    public static void main(String[] args) {

        int num = 0;

        Jogador j1 = new Jogador(++num); 
    

        j1.setMana(100);
        System.out.printf("Vidas do jogador 1: %d\n ", j1.getVidas());
        System.out.printf("Mana do jogador 1: %d", j1.getMana());
        
    }
}
