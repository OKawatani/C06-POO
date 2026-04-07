package Exercicio2;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor){

        super(nome, preco, sabor);

    }

    public void adicionaDoceDeLeite(){
        System.out.printf("Adicionando mais doce de leite no: %s", nome);

    }

}
