package Exercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> listaDouble = new ArrayList<Double>();

        for(int i = 0; i < 5; i++){
            listaDouble.add(new Random().nextDouble()*100);
        }

        System.out.println("Antes da ordenação");

        for(Double double1 : listaDouble){
            System.out.println(double1);
        }

        System.out.println("Depois da ordenação");

        Collections.sort(listaDouble, Collections.reverseOrder());

        for(Double double1 : listaDouble){
            System.out.println(double1);
        }

        System.out.println();
    }
}
