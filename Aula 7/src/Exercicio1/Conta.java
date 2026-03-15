package Exercicio1;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] clientes;

    public Conta()
    {
        setClientes(new Cliente[3]);
    }

    // Métodos
    public void sacar(float quantia)
    {
        if(saldo >= quantia)
        {
            this.saldo -= quantia;
        }
        else
        {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void deposita(float quantia)
    {
        this.saldo += quantia;
    }


    // Getters e setters
    public float getSaldo() {
        return this.saldo;
    }

    public float getLimite(){
        return this.limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    public Cliente[] getClientes(){
        return clientes;
    }

    public void setClientes(Cliente[] clientes){
        this.clientes = clientes;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
