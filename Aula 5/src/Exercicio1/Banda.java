package Exercicio1;

import org.w3c.dom.ls.LSInput;

public class Banda {
    String nome;
    String genero;

    Membro[][] membros = new Membro[3][3];
    Musica[][] musicas = new Musica[2][2];
    Empresario[][] empresarios = new Empresario[1][1];

    void mostraInfo(){
        System.out.println("Nome da banda: " + nome);
        System.out.println("Gênero da banda: " + genero);
    }

    void addMusicaNova(Musica musica){
        for(int i = 0; i < musicas.length; i++)
        {
            for(int j = 0; j < musicas[i].length; j++)
            {
                if(musicas[i][j] == null)
                {
                    musicas[i][j] = musica;
                }
            }
        }
    }

    void addMembroNovo(Membro membro){
        for(int i = 0; i < membros.length; i++){
            for(int j = 0; j < membros[i].length; j++){

                if(membros[i][j] == null)
                {
                    membros[i][j] = membro;
                }

            }
        }
    }

    void Banda(String nome, String genero) {

    }
}
