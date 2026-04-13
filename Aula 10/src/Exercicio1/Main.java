package Exercicio1;

public class Main {


    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Ronaldo", 100);
        Lontra l1 = new Lontra("Cleber", 25 );
        Boi b1 = new Boi("Fabiano", 200);

        c1.emitirSon();
        l1.emitirSon();
        b1.emitirSon();

        b1.mostraInfo();
        l1.mostraInfo();
        c1.mostraInfo();


    }



}
