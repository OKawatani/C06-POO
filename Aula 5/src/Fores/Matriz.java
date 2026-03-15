package Fores;
import java.util.Random;

public class Matriz {

    // Declarando variáveis
    Random rand = new Random();
    boolean coords[][] = new boolean[10][10];
    Personagem jorge = new Personagem();
    Bomba bombas = new Bomba();

    // Função pra gerar as bombas que não repete posições e não spawna no personagem
    void gerarBombas(int x){

        int i = 0;

        while (i < x){
            bombas.x = rand.nextInt(10);
            bombas.y = rand.nextInt(10);
            //System.out.printf("%nx:%d%ny:%d%n", bombas.x, bombas.y);

            if(coords[bombas.x][bombas.y] == false && (bombas.x !=4 && bombas.y != 4)){
                coords[bombas.x][bombas.y] = true;
                i++;
            }
        }
    }

    // Função de movimentação do personagem que não sai dos limites da matriz
    boolean Mover(int x){

        boolean moveu = false;

        switch (x) {
            case 1:
                if(jorge.posy<9){
                    jorge.posy++;
                    moveu = true;
                }
                else{
                    System.out.println("Impossível se mover nessa direção!");
                    System.out.println();
                }
                break;

            case 2:
                if(jorge.posy>0){
                    jorge.posy--;
                    moveu = true;
                }
                else{
                    System.out.println("Impossível se mover nessa direção!");
                    System.out.println();
                }
                break;

            case 3:
                if(jorge.posx>0){
                    jorge.posx--;
                    moveu = true;
                }
                else{
                    System.out.println("Impossível se mover nessa direção!");
                    System.out.println();
                }
                break;

            case 4:
                if(jorge.posx<9){
                    jorge.posx++;
                    moveu = true;
                }
                else{
                    System.out.println("Impossível se mover nessa direção!");
                    System.out.println();
                }
                break;

            default:
                System.out.println("Escoha uma opção válida.");
                break;
        }

        return moveu;
    }

    // Função pra checar a colisão do personagem com a bomba e imprimir a tela de game over
    void CheckMorto(){

        if(coords[jorge.posx][jorge.posy] == true){
            System.out.println("                                      +                                 ");
            System.out.println("                                      @                                 ");
            System.out.println("                        @             #                                 ");
            System.out.println("                        .#=          :#.                =               ");
            System.out.println("                         %#*         @#+               %                ");
            System.out.println("                         @###        %##             .#%                ");
            System.out.println("                         *####      +###:           ###                 ");
            System.out.println("       @+                :######   .@####          %###                 ");
            System.out.println("        -@##=            .@##@###@+@##@##%       %####:                 ");
            System.out.println("          @#####@=       +%##@@@#####@@@##@   .@#####@                  ");
            System.out.println("           -%########@@@@@##@@.@@@@@@@+@@###%####@@##@.        #+       ");
            System.out.println("             @###@@@%######@@:    .    .@@@%#@@@@*@@##@-  :+##@         ");
            System.out.println("              =@##@@%@@@@@@%.             .=*=.   =@@########@-         ");
            System.out.println("                @##@@-                              @@@@@@@##@#         ");
            System.out.println("                 @##@@:                                 ..@@##%@:       ");
            System.out.println("              .. :@##@@ .@@@#%@@%.   .@@@%@@@*   .-==.    .@@@####@@=   ");
            System.out.println("         =@@@=...%@@#@@@:........@@#@%.......:@.@*::.@@: #@@@######=.   ");
            System.out.println("      .@#..........@@@@.....:.....@@.....-.....@@....:@@@@...%@@#@@@@=  ");
            System.out.println("      @@:...:@@@...@@@-...@@@@@...@....@@@@@...@*.....@@@.....@@@.....@@");
            System.out.println("    .-%@@....@@...@@@@...-@@.@@...@...@@#.@@...@...+..*@......@@*...:@@ ");
            System.out.println(" =@@####@@...........=....@@:@=...@...+@@@@...@@...@.....*%...@@...%@@  ");
            System.out.println("        @@-....@@@....%....+%....@@*.........@@*...@....#@+..:@%..@@@   ");
            System.out.println("        :@@...-@#....@@#.......=@@@@@.....+@@@@@:.@@*..#@@-..#=...@@+   ");
            System.out.println("         @@.........@@@@@+..:@@@@-.@@@@@@@@@@-@@@@@@@@@@@@@@@@:...@@@   ");
            System.out.println("         .@@.....@@@@%@@@@@@@@@:      :*+.      .=.  ....@@@@@@@@@@@    ");
            System.out.println("          @@@@@@@@@@##%@.                             .@@@@@@###%       ");
            System.out.println("          .@@@@%   @##@@                             *@@#########%      ");
            System.out.println("                  :@##@@@@@@@@@@@                   :@@##@+     @#@     ");
            System.out.println("                 .@#############@@@=        .-%@@@*.@@##@:              ");
            System.out.println("                 @####@@%+==*@@%###@@    +@@@@####%@@@##@               ");
            System.out.println("                @#@.            @@##@@ @@@####%@@@######@               ");
            System.out.println("              -#                 =%##@@@###@@:     .@####.              ");
            System.out.println("                                  @##@###@:           *###              ");
            System.out.println("                                   ####@-               ##:             ");
            System.out.println("                                   ###@                  ##             ");
            System.out.println("                                   #@:                    ##            ");
            System.out.println("                                   %                       +.           ");
            System.out.println();
            System.out.println("                              G A M E  O V E R!");
            System.out.println();
            jorge.morto = true;
        }
    }
}
