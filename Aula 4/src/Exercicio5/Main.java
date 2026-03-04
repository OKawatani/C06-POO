package Exercicio5;

public class Main {

    public static void main(String[] args)
    {
        Personagem p1 = new Personagem();
        Arma arma1 = new Arma();

        p1.arma = arma1;

        p1.nome = "Ronaldo";
        p1.pontos = 100;
        arma1.nome = "Faca AK47";
        arma1.poder = 5;
        arma1.resistencia = 10;
        arma1.descricao = "Essa é a faca Ak47, a faca perfeita para o combate";

        p1.arma.mostrarInfoArma();
        p1.tomarDano();
        p1.usarArma();

        System.out.println("Vida após receber dano: " + p1.pontos);
        System.out.println("Resistencia da arma após receber dano: " + p1.arma.resistencia);








    }
}
