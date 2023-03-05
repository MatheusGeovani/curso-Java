package lutador;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String naciolidade){
        this.nacionalidade = naciolidade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
        setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(){
        this.categoria = categoria;
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Medio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }
   
    // Metodoos
    public void apresentar(){
        System.out.println("______________________________________________________________");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com  " + this.getIdade() + " anos e " + this.getAltura() + " metros");
        System.out.println("Pesando  " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
    public void status(){
        System.out.println(this.getNome() + " e um peso " + getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
