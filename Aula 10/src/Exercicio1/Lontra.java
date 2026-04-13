package Exercicio1;

public class Lontra extends Mamifero{

    public Lontra(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSon(){
        System.out.println("Quick quick");
    }
}
