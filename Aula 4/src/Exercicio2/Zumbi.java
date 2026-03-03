package Exercicio2;

public class Zumbi {

    //Membros
    String nome;
    double vida;

    //Métodos
    double mostraVida()
    {
        return vida();
    }

    void tranfereVida(Zumbi zumbiAlvo, double quantia)
    {
        vida -= quantida;
        zumbiAlvo.vida += quantia;
        System.out.println("Vida tranferida!");
    }



}
