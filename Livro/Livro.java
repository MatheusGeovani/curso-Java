package Livro;

public class Livro implements interfaceLivro {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(){
        return "Livro{" + "Titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas
                + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor };
    }

    public Livro(){
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.totPaginas = 0;
        this.leitor = leitor;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String ti){
        this.titulo = ti;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String au){
        this.autor = au;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }


    // Metodos abstratos
    @Override
    public void abrir(){
        setAberto(true);
    }

}
