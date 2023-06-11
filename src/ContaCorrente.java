import java.util.ArrayList;

public class ContaCorrente {

    //Atributos
    private double saldo;
    //Valor que tem na conta

    private int numeroConta;
    private String nomeTitular;
    private float histTransac;
    private float extrato;

    private float limCheEsp;



    public void deposito(float v){

        this.setSaldo(getSaldo() + v);
        System.out.println("Depósito no total de " + v + " efetuado com sucesso na sua conta corrente!" );
    }
    public void saque(float v){
        this.setSaldo(getSaldo() - v);
        System.out.println("Saque de " + v + " efetuado com sucesso da sua conta corrente");
    }
    public void consulSaldo(){
        System.out.println("Saldo atual da conta corrente: R$" + this.getSaldo());
    }
    //Metodos especiais


    public ContaCorrente(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;


    }
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("=========");
        System.out.println("Titular: " + this.getNomeTitular());
        System.out.println("Número da Conta: " + this.getNumeroConta());


    }

    public float getSaldo() {
        double saldo;
        return 0;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }


}
