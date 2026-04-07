package Exercicio2;

public class Main {

    public static void main(String[] args) {

        BrownieCafe Brcafe = new BrownieCafe("Brownie de cafe", 42, "Cafe");
        BrownieNutella BrNutella = new BrownieNutella("Brownie de Nutella", 5, "Nutella");
        BrownieDoceDeLeite BrDdL = new BrownieDoceDeLeite("Brownie de Doce de Leite", 100, "Doce de Leite");

        Brcafe.mostraInfo();

        BrNutella.mostraInfo();

        BrDdL.mostraInfo();

        Brcafe.adicionaCafe();

        BrNutella.addCarrinhoDeCompras();

        BrDdL.calcularValorTotalCompra();
    }
}
