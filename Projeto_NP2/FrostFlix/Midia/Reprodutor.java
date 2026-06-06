package Midia;

public class Reprodutor extends Thread {

    private String titulo;

    public Reprodutor(String titulo){
        this.titulo = titulo;
    }

    @Override
    public void run(){

        System.out.printf("%nReproduzindo %s...%n", titulo);

        for(int i = 1; i <= 10; i++){

            System.out.println("Minuto " + i);

            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println("Erro ao reproduzir.");
            }
        }

        System.out.println("Fim da reprodução");
    }
}