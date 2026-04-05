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

    //Construtores

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional,  HardwareBasico[] hardwareBasicos) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasicos = hardwareBasicos;
    }

    //Métodos
    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);

        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome());

        for(int i = 0; i < hardwareBasicos.length; i++){
            System.out.println(hardwareBasicos[i].getNome() + " : " + hardwareBasicos[i].getCapacidade());
        }

        if(memoriaUSB != null){
            System.out.println("Memoria USB: " + memoriaUSB.getNome());
        }
    }

}
