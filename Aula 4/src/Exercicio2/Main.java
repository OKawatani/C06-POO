package Exercicio2;

public class Main {
    public static void main(String[] args)
    {
        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "Jorge";
        zumbi1.vida = 100.0;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Roger";
        zumbi2.vida = 150.0;

        System.out.println("Zumbi1: " + zumbi1.mostraVida());
        System.out.println("Zumbi1: " + zumbi2.mostraVida());

        zumbi2.tranfereVida(zumbi1, 50);

        System.out.println("Zumbi1: " + zumbi1.mostraVida());
        System.out.println("Zumbi2: " + zumbi2.mostraVida());
    }
}
