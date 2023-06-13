import java.text.DecimalFormat;

public class Emprestimo {
    private float valorEmprestimo;
    private int parcelas;
    public void gerarEmprestimo(ContaCorrente contaCorrente, float valorTransacao, int parcelas){
        this.valorEmprestimo = valorTransacao;
        this.parcelas = parcelas;

        contaCorrente.depositoContaCorrente(valorEmprestimo);
    }

    public void imprimirEmprestimo(){
        float valorParcelas = (float) ((valorEmprestimo + (valorEmprestimo * 0.1)) / 12);

        System.out.println("\n" + "\n" + "======Emprestimo Realizado======\n" +
                "Valor do Empréstimo: R$ " + new DecimalFormat(".##").format(valorEmprestimo) + "\n" +
                "Parcelas: " + parcelas + "\n" +
                "Valor das Parcelas: R$ " + new DecimalFormat(".##").format(valorParcelas));
    }

}
