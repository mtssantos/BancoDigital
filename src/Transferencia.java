public class Transferencia {
   protected float valorTransacao;
   public void transferirCtCp(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca, float valorTransferencia){
       this.valorTransacao = valorTransferencia;
       contaCorrente.saqueContaCorrente(valorTransferencia);
       contaPoupanca.depositoContaPoupanca(valorTransferencia);
   }
   public void transferirCpCt(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca, float valorTransferencia){
       this.valorTransacao = valorTransferencia;
       contaPoupanca.saqueContaPoupanca(valorTransferencia);
       contaCorrente.depositoContaCorrente(valorTransferencia);
   }
}
