public class ContaInvestimento extends ContaCorrente {
    public ContaInvestimento(String nomeTitular, int numeroConta) {
        super(nomeTitular, numeroConta);
    }

    public boolean rendimentoInvestimento() {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * 0.1));
        return true;
    }
    @Override
    public void deposito(float v){

        this.setSaldo(getSaldo() + v);
        System.out.println("Investimento de " + v + " efetuado com sucesso!" );
    }
    @Override
    public void saque(float v){
        this.setSaldo(getSaldo() - v);
        System.out.println("Saque do seu fundo de investimentos de " + v + " efetuado com sucesso");
    }
    @Override
    public void consulSaldo(){
        System.out.println("Saldo atual investido: R$" + this.getSaldo());
    }
    //Metodos especiais
}
