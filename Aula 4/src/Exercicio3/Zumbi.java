package Exercicio3;

public class Zumbi {

    String nome;
    double vida;

    double mostrarVida() {
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia)
    {
        vida -= quantia;
        zumbiAlvo.vida += quantia;
        System.out.println("Vida transferida!");
    }
}
