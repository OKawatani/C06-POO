package Exercicio6;

public class Kart {

    String nome;
    Piloto piloto;
    Motor motor;

    public Kart()
    {
        motor = new Motor();

    }

    void pular()
    {
        System.out.println(piloto.nome + " Realizou um pulo com seu " + nome + "!");
    }
    void soltarTurbo()
    {
        System.out.println(piloto.nome + " aumentou sua velocidade com um turbo! ");
    }
    void fazerDrift()
    {
        System.out.println(piloto.nome + " esta rodando loucamente!");
    }
}
