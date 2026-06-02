package Exercicio3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int numValores = 100000;
        long tempoInicial, tempoFinal;

        List<Integer> listaInteiro =  new ArrayList<Integer>();
        Set<Integer> conjuntoInteiro = new HashSet<Integer>();
        Map<Integer,Integer> mapaInteiro = new HashMap<Integer, Integer>();

        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < numValores; i++){
            listaInteiro.add(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo total para inserir os valores na lista: " + (tempoFinal - tempoInicial) + "ms");

        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < numValores; i++){
            conjuntoInteiro.add(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo total para inserir os valores no conjunto: " + (tempoFinal - tempoInicial) + "ms");

        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < numValores; i++){
            mapaInteiro.put(i,i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo total para inserir os valores no mapa: " + (tempoFinal - tempoInicial) + "ms");

        //Buscando todos os valores na lista
        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < numValores; i++){
            listaInteiro.contains(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo total para buscar os valores na lista: " + (tempoFinal - tempoInicial) + "ms");

        //Buscando os valores no Hashset
        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < numValores; i++){
            conjuntoInteiro.contains(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo total para buscar os valores no conjunto: " + (tempoFinal - tempoInicial) + "ms");

        //Buscando os valores no mapa
        tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < numValores; i++){
            mapaInteiro.containsKey(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo total para buscar os valores no mapa: " + (tempoFinal - tempoInicial) + "ms");
    }
}
