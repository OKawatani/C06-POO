package Midia;

public class Serie extends Conteudo implements Reprodutivel{
    
    int nTemps;

    public Serie(String titulo, String descricao, String genero, String diretor, int anoDeLancamento, float nota, int nTemps){

        super(titulo, descricao, genero, diretor, anoDeLancamento, nota);
        this.nTemps = nTemps;
    }

    @Override
    public void mostraInfo(){
        
        super.mostraInfo();
        System.out.printf("Número de temporada: %d%nNúmero de episódios: %d%n", nTemps);

    }

    
}
