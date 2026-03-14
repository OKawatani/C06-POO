package Desafio;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();

    int x = aleatorio.nextInt(2);
    int y = aleatorio.nextInt(2);

    Scanner ler = new Scanner(System.in);

    boolean matrix[][];
    matrix = new boolean[2][2];

    for(int i  = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++){
            matrix[i][j] = false;
            matrix[x][y] = true;
        }
    }

    for(int i  = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

                System.out.println("Digite o valor de I, entr 0 e 1: ");
                int n1 =  ler.nextInt();
                System.out.println("Digite o valor de J, entr 0 e 1: ");
                int n2 =  ler.nextInt();

                if(matrix[n1][n2]){
                    System.out.println("Explodiu!");
                    break;
                }
                else{
                    System.out.println("Continue...");
                }




            }
    }

    }
}
