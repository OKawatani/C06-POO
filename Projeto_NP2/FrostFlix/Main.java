public class Main {
    public static void main(String[] args){

        plataforma FrostFlix = new plataforma();
        Usuario temp;

        try{
            FrostFlix.carregarUsuarios();
        } catch(Exception e){
            System.out.println("Erro ao carregar usuários.");
        }

        temp = FrostFlix.cadastrarUsuario();
        
        if(temp!=null) {
            
            try{
                FrostFlix.carregarCatalogo();
            } catch(Exception e){
                System.out.println("Erro ao carregar catálogo.");
            }
            
            FrostFlix.menu(temp);
            
        }
        else System.out.printf("%nLogin não efetuado, saindo...%n");

        try{
            FrostFlix.salvarUsuarios();
        } catch(Exception e){
            System.out.println("Erro ao salvar usuários.");
        }
    }
}
