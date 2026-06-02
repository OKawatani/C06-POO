package Exercicio2;

public class PastelCarne extends Pastel{

    public PastelCarne(String nome, String sabor, int preco){
        super(nome,sabor,preco);
    }

    @Override
    public void addCarrinho(){
        System.out.println("Adicionando um pastel de carne ao carrinho");
    }

}
