package Exercicio2;

public class BrownieNutella extends Brownie{



    public BrownieNutella (String nome, double preco, String sabor){

        super(nome, preco, sabor);

    }

    public void adicionaNuttela(){
        System.out.println("Adicionando mais Nutella no:" + nome);
    }
}
