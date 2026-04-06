package Pecas;

public class Computador {


    //Atributos
    private String marca;
    private float preco;

    //Composições
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwareBasicos;

    //Agregações
    private MemoriaUSB memoriaUSB;

    //Construtor

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional,  HardwareBasico[] hardwareBasicos) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasicos = hardwareBasicos;
    }

    //Métodos
    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preco R$: " + preco);

        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " " +  sistemaOperacional.getTipo() + " bits ");

        System.out.println("Processador: " + this.hardwareBasicos[0].getNome() + " " + this.hardwareBasicos[0].getCapacidade() + " Mhz");
        System.out.println("Memoria: " + this.hardwareBasicos[1].getNome() +  " " + this.hardwareBasicos[1].getCapacidade() + " Gb ");

        if(this.hardwareBasicos[2].getCapacidade() < 500){
            System.out.println("Armazenamento: " + this.hardwareBasicos[2].getNome() + " " + this.hardwareBasicos[2].getCapacidade() + " Tb");

        }
        else{
            System.out.println("Armazenamento: " + this.hardwareBasicos[2].getNome() + " " + this.hardwareBasicos[2].getCapacidade() + " Gb");
        }

        if(this.memoriaUSB.getCapacidade() == 1){
            System.out.println("Memoria USB: " + memoriaUSB.getNome() + " capacidade " + memoriaUSB.getCapacidade() + " Tb");
        }
        else{
            System.out.println("Memoria USB: " + memoriaUSB.getNome() + " capacidade " + memoriaUSB.getCapacidade() + " Gb");
        }

    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB){
        this.memoriaUSB = memoriaUSB;
    }

    public float getPreco() {
        return preco;
    }
}
