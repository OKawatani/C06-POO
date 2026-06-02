package Exercicio2;

public abstract class Pastel implements Comparable<Pastel> {

    protected String nome;
    protected String sabor;
    protected int preco;


    @Override
    public int compareTo(Pastel p){
        if(this.preco < p.preco){
            return -1;
        }
        if(this.preco > p.preco){
            return 1;
        }
        return 0;
    }


    public Pastel(String nome, String sabor, int preco){
        this.nome = nome;
        this.sabor = sabor;
        this.preco = preco;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Preco: " + this.preco);
    }

    public void addCarrinho(){
        System.out.println("Pastel de " + sabor + "adicionado ao carrinho!");
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }

}
