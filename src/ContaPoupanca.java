public class ContaPoupanca extends ContaCorrente{
    public ContaPoupanca(String nomeTitular, int numeroConta) {
        super(nomeTitular, numeroConta);
    }
    public boolean rendimentoPoupanca(){
        this.setSaldo((float) (this.getSaldo() + (this.getSaldo() * 0.02)));
        return true;
    }
    @Override
    public void deposito(float v){

        this.setSaldo(getSaldo() + v);
        System.out.println("Depósito no total de " + v + " na sua poupança efetuado com sucesso!" );
    }
    @Override
    public void saque(float v){
        this.setSaldo(getSaldo() - v);
        System.out.println("Saque de " + v + " da sua poupança efetuado com sucesso!");
    }
    @Override
    public void consulSaldo(){
        System.out.println("Saldo atual da sua poupança: R$" + this.getSaldo());
    }
    //Metodos especiais
}
