import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    
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

            if(numAdivinhado < numGerado)
            {
                System.out.println("O número é maior. Tente novamente.");
            }
            else if(numAdivinhado > numGerado)
            {
                System.out.println("O número é menor. Tente novamente.");
            }

        } while (numAdivinhado != numGerado);

        System.out.println("Parabéns! Você acertou!");
        entrada.close();
    }
}