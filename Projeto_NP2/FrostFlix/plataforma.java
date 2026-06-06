import java.nio.file.*;
import java.util.*;

import Midia.*;

public class plataforma {
    
    private List<Usuario> usuarios;
    private List<Conteudo> catalogo;
    private Scanner scan = new Scanner(System.in);
    private int entrada = 0;

    public plataforma(){
        this.usuarios = new ArrayList<>();
        this.catalogo = new ArrayList<>();
    }

    public void menu(Usuario sessão){
        
        System.out.printf("%nO que vamos assistir hoje?");
        while(entrada!=4){
            
            System.out.printf("%n1_Catálogo de filmes%n2_Catálogo de séries%n3_Pesquisar%n4_sair%n");
            entrada = scan.nextInt();
            scan.nextLine();

            switch (entrada) {
                case 1:
                case 2:
                    listarCatalogo(entrada);
                    break;
                case 3:
                    System.out.printf("%nFuncionalidade não disponível.%n");
                    break;
                case 4:
                    break;
                default:
                    System.out.printf("%nInsira uma opção válida!%n");
                    break;
            }
        }
    }

    public void listarCatalogo(int op){

        if(op == 1){    
            List<Conteudo> filmesDisponiveis = new ArrayList<>();

            for(Conteudo c : catalogo){
                if(c instanceof Filme){
                    filmesDisponiveis.add(c);
                }
            }

            System.out.printf("%n0 - Voltar%n");
            for(int i=0;i<filmesDisponiveis.size();i++){
                Conteudo c = filmesDisponiveis.get(i);
                System.out.println(i+1 + " - " + c.getTitulo());
            }

            int escolha = scan.nextInt();

            if(escolha!=0 && escolha<=filmesDisponiveis.size()){
                escolhaConteudo(escolha-1,filmesDisponiveis);
            }
        }
        else if(op == 2){
            List<Conteudo> seriesDisponiveis = new ArrayList<>();

            for(Conteudo c : catalogo){
                if(c instanceof Serie){
                    seriesDisponiveis.add(c);
                }
            }

            System.out.printf("%n0 - Voltar%n");
            for(int i=0;i<seriesDisponiveis.size();i++){
                Conteudo c = seriesDisponiveis.get(i);
                System.out.println(i+1 + " - " + c.getTitulo());
            }

            int escolha = scan.nextInt();

            if(escolha!=0 && escolha<=seriesDisponiveis.size()){
                escolhaConteudo(escolha-1,seriesDisponiveis);
            }
        }
    }

    public void escolhaConteudo(int escolha, List<Conteudo> opcoes){

        int opcao=0;
        Conteudo c = opcoes.get(escolha);
        c.mostraInfo();

        System.out.printf("%n1_Assistir%n2_Voltar%n");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                c.Reproduzir();
                break;
            case 2:
                break;
            default:
                System.out.printf("%nInsira uma opção válida!%n");
                break;
        }
    }

    public Usuario cadastrarUsuario(){
        
        String nome = "usuario";
        String email;
        String senha;
        Usuario u;
        
        System.out.printf("%n F R O S T F L I X %n");
        
        while(entrada!=3){

            System.out.printf("%n1_Entrar%n2_Cadastrar%n3_sair%n");
            entrada = scan.nextInt();
            scan.nextLine();

            switch (entrada) {
                case 1:
                    System.out.printf("%nEmail: ");
                    email = scan.nextLine();
                    System.out.printf("Senha: ");
                    senha = scan.nextLine();
                    
                    u = new Usuario(nome,email,senha);
                    if(verificarUsuarios(u)){
                        if(login(u)){
                            u = copiarUsuario(u);
                            System.out.printf("%nLogin efetuado, bem vindo de volta %s%n", u.getNome());
                            return u;
                        }
                        else System.out.printf("%nSenha incorreta.%n");
                    }
                    else System.out.printf("Email ou Senha incorretas.%n");

                    break;

                case 2:
                    System.out.printf("%nEmail: ");
                    email = scan.nextLine();
                    System.out.printf("%nSenha: ");
                    senha = scan.nextLine();
                    System.out.printf("Nome de usuário: ");
                    nome = scan.nextLine();
                    
                    u = new Usuario(nome,email,senha);

                    if(verificarUsuarios(u)){
                        System.out.printf("%nEmail já utilizado, cadastro não realizado%n");
                    }
                    else{
                        System.out.printf("%nCadastro realizado, bem vindo %s!%n", u.getNome());
                        usuarios.add(u);
                        return u;
                    }
                    break;

                case 3:
                    break;
                default:
                    System.out.printf("%nInsira uma opção válida!%n");
                    break;
            }
        }

        return null;
    }

    public Usuario copiarUsuario(Usuario usuario){
        for(Usuario u:usuarios){
            if(u.getEmail().equals(usuario.getEmail())){
                return u;
            }
        }
        return usuario;
    }

    public boolean verificarUsuarios(Usuario usuario){
        for(Usuario u:usuarios){
            if(u.getEmail().equals(usuario.getEmail())){
                return true;
            }
        }
        return false;
    }

    public boolean login(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail()) &&
                u.getSenha().equals(usuario.getSenha())) {
                return true;
            }
        }
        return false;
    }

    public void salvarUsuarios() throws Exception{
        
        Path arquivo = Paths.get("FrostFlix/arquivos/Usuarios.csv");
        StringBuilder sb = new StringBuilder();
        for (Usuario u : usuarios) 
            sb.append(u.getNome() + ";" + u.getEmail() + ";" + u.getSenha() + "\n");
        
        Files.writeString(arquivo, sb.toString());

    }

    public void carregarCatalogo()throws Exception{
        
        Path p = Paths.get("FrostFlix/arquivos/Catalogo.csv");
        List<String> linhas = Files.readAllLines(p);

        for(String linha : linhas){
            String[] partes = linha.split(";");
            int ano = Integer.parseInt(partes[5]);
            float nota = Float.parseFloat(partes[6]); 
            
            if(partes[0].equals("f")) {
                
                Conteudo c = new Filme(partes[1], partes[2], partes[3], partes[4], ano, nota);
                catalogo.add(c);
            
            }
            else if(partes[0].equals("s"))
            {   
                int nTemps = Integer.parseInt(partes[7]);
                Conteudo c = new Serie(partes[1], partes[2], partes[3], partes[4], ano, nota, nTemps);
                catalogo.add(c);
            }
        }
    }

    public void carregarUsuarios() throws Exception{
        
        Path p = Paths.get("FrostFlix/arquivos/Usuarios.csv");
        List<String> linhas = Files.readAllLines(p);

        for(String linha : linhas){
            String[] partes = linha.split(";");
            Usuario u = new Usuario(partes[0], partes[1], partes[2]);
            usuarios.add(u);
        }

    }

}
