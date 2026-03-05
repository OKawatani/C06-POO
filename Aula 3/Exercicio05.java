import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int numGerado, numAdivinhado;
        numGerado = rand.nextInt(10) + 1;

        do
        {
            System.out.print("Digite um número de 1 a 10: ");
            numAdivinhado = entrada.nextInt();

            System.out.println("Número digitado: " + numAdivinhado);

        } while (numAdivinhado != numGerado);

        System.out.println("Parabéns! Você acertou!");
        entrada.close();
    }
}