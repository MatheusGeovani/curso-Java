package banco;

import java.util.regex.MatchResult;

public class MainBanco {
    public static void main(String[] args){
        ContaBanco c1 = new ContaBanco();
        
        c1.setDono("Matheus");
        c1.setNumDaConta(12345);
        c1.abrirConta("Conta Poupanca");
        c1.fecharConta();
        c1.setSacar(150);
        c1.fecharConta();
        
        
       
    

        c1.situacaoConta();


    }
}
