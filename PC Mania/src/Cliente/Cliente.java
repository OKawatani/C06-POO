package Cliente;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private float carrinho;

    Scanner input = new Scanner(System.in);

    //Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public boolean Login(String dados){

        if(this.nome.equals(dados) || this.cpf.equals(dados)){
            return true;
        }

        return false;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}


