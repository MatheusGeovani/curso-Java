package Livro;

import java.util.regex.MatchResult;

public class main {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Matheus", 24, "Masculino");
        p[1] = new Pessoa("Lidia", 27, "Feminino");

        l[0] = new Livro("Tres porquinhos", "Jose", 200, "Matheus");
        

    }
}
