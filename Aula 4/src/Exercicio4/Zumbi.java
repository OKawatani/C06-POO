package Exercicio4;

public class Zumbi {

    String nome;
    double vida;
    Boolean podeTransferir = false;


    double mostrarVida()
    {
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia)
    {
        if((vida - quantia) <= 0)
        {
            podeTransferir = false;
            System.out.println("Vida insuficiente! ");
        }
        else
        {
            vida -= quantia;
            podeTransferir = true;
        }

        if(podeTransferir == true)
        {
            zumbiAlvo.vida += quantia;
            System.out.println("Vida transferida!");
        }





    }
}
