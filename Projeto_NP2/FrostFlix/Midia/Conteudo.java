package Midia;
public abstract class Conteudo {
    
    //protected String tipo;
    protected String titulo;
    protected String descricao;
    protected String genero;
    protected String diretor;  
    protected int anoDeLancamento;
    protected float nota;
    //protected String estudio;
    //protected int visuazilacoes; 
    //protected int id;  
    //protected int classificacao;
    
    public Conteudo(String titulo, String descricao, String genero, String diretor, int anoDeLancamento, float nota){
        
        //this.tipo = tipo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.genero = genero;
        this.diretor = diretor;
        this.anoDeLancamento = anoDeLancamento;
        this.nota = nota;

    }
    
    public void Reproduzir(){
        
        Reprodutor r = new Reprodutor(titulo);
        r.start();
    }

    public void mostraInfo(){
        System.out.printf("%n%s%nDescrição: %s%nGenero: %s%nDiretor: %s%nAno de lançamento: %d%nNota: %.1f%n",titulo,descricao,genero,diretor,anoDeLancamento,nota);
    }

    public String getTitulo(){
        return titulo;
    }
    
}
