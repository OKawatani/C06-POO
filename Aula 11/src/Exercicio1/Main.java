package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Fores", 10);
        Lontra l1 = new Lontra("Gugu", 20);
        Boi b1 = new Boi("Dada", 30);

        c1.emitirSom();
        l1.emitirSom();
        b1.emitirSom();

        System.out.println(" ");
        System.out.println(" ");

        c1.mostraInfo();
        System.out.println(" ");
        l1.mostraInfo();
        System.out.println(" ");
        b1.mostraInfo();
        System.out.println(" ");

        System.out.println(" ");

        l1.nadar();



    }

}
