
import Cliente.Cliente;
import Pecas.Computador;
import Pecas.HardwareBasico;
import Pecas.MemoriaUSB;
import Pecas.SistemaOperacional;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


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



    Computador computador1 = new Computador("Apple", 668, sistema1, hardwareBasico1);
    Computador computador2 = new Computador("Samsung", 1902, sistema2, hardwareBasico2);
    Computador computador3 = new Computador("Dell", 6346, sistema3, hardwareBasico3);

    computador1.mostraPCConfigs();






    }
}
