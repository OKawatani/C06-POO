package Exercicio6;

public class Main {
    public static void main(String[] args)
    {
        // Criação do piloto 1 e seu kart.

        Kart kart1 = new Kart();
        Piloto piloto1 = new Piloto();

        kart1.piloto = piloto1;

        kart1.nome = "RB20";
        kart1.motor.cilindradas = "100 cilindradas";
        kart1.motor.velocidadeMaxima = 100;
        piloto1.nome = "Max";
        piloto1.vilao = true;


        // Criação do piloto 2 e seu kart.

        Kart kart2 = new Kart();
        Piloto piloto2 = new Piloto();

        kart2.piloto = piloto2;

        piloto2.nome = "Leclerc";
        kart2.nome = "Fe44";
        kart2.motor.cilindradas = "150 cilindradas";
        kart2.motor.velocidadeMaxima = 150;
        piloto2.vilao = false;

        kart1.motor.mostrarInfo();
        kart1.soltarTurbo();
        kart1.fazerDrift();

        System.out.println("-------------------------------------");

        kart2.motor.mostrarInfo();
        kart2.piloto.soltaSuperPoder();
        kart2.pular();










    }

}
