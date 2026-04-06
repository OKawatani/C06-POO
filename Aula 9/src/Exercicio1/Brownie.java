package Exercicio1;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){

        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;

    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando ao carrinho de compras um: " + nome);
    }

    public void calcularValorTotalCompra(){
        System.out.println("Calculando valor total da compra de um: " + nome + ": " + preco);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);
    }
}
