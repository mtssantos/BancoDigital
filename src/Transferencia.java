import java.text.DecimalFormat;

public class Transferencia {
   protected float valorTransacao;
   public void transferirCtCp(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca, float valorTransferencia){
       this.valorTransacao = valorTransferencia;
       contaCorrente.saqueContaCorrente(valorTransferencia);
       contaPoupanca.depositoContaPoupanca(valorTransferencia);
       imprimirTransferencia();
   }
   public void transferirCpCt(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca, float valorTransferencia){
       this.valorTransacao = valorTransferencia;
       contaPoupanca.saqueContaPoupanca(valorTransferencia);
       contaCorrente.depositoContaCorrente(valorTransferencia);
       imprimirTransferencia();
   }

   public void imprimirTransferencia(){
       System.out.println("\n" + "======COMPROVANTE DE TRANSFERÊNCIA======" + "\n" +
            "VALOR DA TRANSFERÊNCIA: R$ " + new DecimalFormat(".##").format(valorTransacao));
   }
}
