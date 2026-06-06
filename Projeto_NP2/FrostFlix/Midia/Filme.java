package Midia;

public class Filme extends Conteudo implements Reprodutivel {
    
    public Filme(String titulo, String descricao, String genero, String diretor, int anoDeLancamento, float nota){

        super(titulo, descricao, genero, diretor, anoDeLancamento, nota);
    }


}
