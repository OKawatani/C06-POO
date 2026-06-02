package Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pastel> ListaPastel = new ArrayList<Pastel>();

        PastelCarne pCarne = new PastelCarne("Pastel", "Carne", 12);
        PastelQueijo pQueijo = new PastelQueijo("Pastel", "Queijo", 10);
        PastelFrango pFrango = new PastelFrango("Pastel", "Frango", 15);

        ListaPastel.add(pCarne);
        ListaPastel.add(pQueijo);
        ListaPastel.add(pFrango);

        System.out.println("Antes da ordenação por preço");

        for(Pastel p: ListaPastel){
            System.out.println(p.getSabor() + ":" + p.getPreco());
        }

        Collections.sort(ListaPastel);

        System.out.println("Depois da ordenação por preço");

        for(Pastel p: ListaPastel){
            System.out.println(p.getSabor() + ":" + p.getPreco());
        }

    }
}
