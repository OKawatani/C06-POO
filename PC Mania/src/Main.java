
import Cliente.Cliente;
import Pecas.Computador;
import Pecas.HardwareBasico;
import Pecas.MemoriaUSB;
import Pecas.SistemaOperacional;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int opcao, compra;
    String dado;


    //Sistemas operacionais
    SistemaOperacional sistema1 = new SistemaOperacional("MacOS Sequoia", 64);
    SistemaOperacional sistema2 = new SistemaOperacional("Windows 8", 64);
    SistemaOperacional sistema3 = new SistemaOperacional("Windows 10", 64);

    //Hardwares basicos
    HardwareBasico processador1 = new HardwareBasico("Pentium core I3", 2200);
    HardwareBasico processador2 = new HardwareBasico("Pentium core I5", 3370);
    HardwareBasico processador3 = new HardwareBasico("Pentium core I7", 4500);

    HardwareBasico memoriaRAM1 = new HardwareBasico("Memoria RAM", 8);
    HardwareBasico memoriaRAM2 = new HardwareBasico("Memoria RAM", 16);
    HardwareBasico memoriaRAM3 = new HardwareBasico("Memoria RAM", 32);

    HardwareBasico armazenamento1 = new HardwareBasico("HD", 500);
    HardwareBasico armazenamento2 = new HardwareBasico("HD", 1);
    HardwareBasico armazenamento3 = new HardwareBasico("HD", 2);

    HardwareBasico[] hardwareBasico1 = new HardwareBasico[]{processador1, memoriaRAM1, armazenamento1};
    HardwareBasico[] hardwareBasico2 = new HardwareBasico[]{processador2, memoriaRAM2, armazenamento2};
    HardwareBasico[] hardwareBasico3 = new HardwareBasico[]{processador3, memoriaRAM3, armazenamento3};

    //Memorias USBs
    MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen-drive", 16);
    MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen-drive", 32);
    MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo", 1);


    //Promoções
    Computador computador1 = new Computador("Apple", 668, sistema1, hardwareBasico1);
    computador1.addMemoriaUSB(memoriaUSB1);

    Computador computador2 = new Computador("Samsung", 1902, sistema2, hardwareBasico2);
    computador2.addMemoriaUSB(memoriaUSB2);

    Computador computador3 = new Computador("Dell", 6346, sistema3, hardwareBasico3);
    computador3.addMemoriaUSB(memoriaUSB3);

    //Cliente
    Cliente cliente1 = new Cliente("Teste", "123.456.789-00");

        Cliente clienteLogado = null;

        do{

            System.out.println("PcMania");
            System.out.println("1- Fazer Login");
            System.out.println("2- Realizar compras");
            System.out.println("0- Sair");

            opcao = input.nextInt();

            switch(opcao){

                case 1:

                    System.out.println("Digite o nome ou o cpf da conta:");
                    dado = input.next();

                    if(cliente1.Login(dado)){
                        clienteLogado = cliente1;

                        System.out.println("Login realizado");
                        System.out.println("Bem vindo " + clienteLogado.getNome());
                    }
                    else{
                        System.out.println("Cliente não encontrado");
                    }

                    break;

                case 2:

                    if(clienteLogado == null){
                        System.out.println("Faça login primeiro!");
                    }
                    else{

                        System.out.println("Qual promoção você deseja?");

                        System.out.println("Promoção 1");
                        computador1.mostraPCConfigs();
                        System.out.println(" ");

                        System.out.println("Promoção 2");
                        computador2.mostraPCConfigs();
                        System.out.println(" ");

                        System.out.println("Promoção 3");
                        computador3.mostraPCConfigs();
                        System.out.println(" ");

                        compra = input.nextInt();
                        System.out.println("Produto adicionado ao carrinho");

                        if(compra == 1){
                            cliente1.calculaTotalCompra(computador1.getPreco());

                        }
                        if(compra == 2){
                            cliente1.calculaTotalCompra(computador2.getPreco());
                        }
                        if(compra == 3){
                            cliente1.calculaTotalCompra(computador3.getPreco());
                        }


                    }

                    break;

                case 0:
                    if(clienteLogado != null){
                        System.out.println("Dados do cliente: " + clienteLogado.getNome() );
                        System.out.println("Cpf: " + clienteLogado.getCpf());
                    }
                    System.out.println("Valor total dos itens R$:" + cliente1.getCarrinho());

                    System.out.println("Saindo do sistema...");

                    break;

                default:
                    System.out.println("Opção inválida");

            }

        }while(opcao != 0);












    }
}
