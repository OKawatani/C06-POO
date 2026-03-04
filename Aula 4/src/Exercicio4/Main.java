package Exercicio4;

public class Main {

    public static void main(String[] args)
    {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Ronaldo";
        z1.vida = 100.0;

        z2.nome = "Fabio";
        z2.vida = 20.0;

        System.out.println("Mostrar vida: " + z1.mostrarVida());
        System.out.println("Mostrar vida: " + z2.mostrarVida());

        z2.transfereVida(z1, 50);

        System.out.println("Mostrar vida: " + z1.mostrarVida());
        System.out.println("Mostrar vida: " + z2.mostrarVida());

    }
}
