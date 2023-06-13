public class Main {
    public static void main(String[] args) {
        Conta cn = new Conta();
        ContaCorrente ct = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        ContaInvestimento ci = new ContaInvestimento();
        Emprestimo ep = new Emprestimo();
        Transferencia tr = new Transferencia();

        cn.CriaConta("Mateus Santos", 12345, 1234);

        ct.depositoContaCorrente(500);

        cp.depositoContaPoupanca(1500);

        ci.depositoContaInvestimento(10000);

        ep.gerarEmprestimo(ct, 1000, 12);

        tr.transferirCtCp(ct, cp, 500);
        tr.transferirCpCt(ct, cp, 570);

        System.out.println("Bem vindo ao BANCO LOKO \n" +
                "Aqui está as informações de sua conta: \n" +
                "Nome do Titular: " + cn.getNome() + "\n" +
                "Agência: " + cn.getAgencia() + "\n" +
                "Conta: " + cn.getNumeroConta() + "\n"
        );

        ct.ConsultaSaldo();
        cp.ConsultaSaldo();
        ci.ConsultaSaldo();

        ep.imprimirEmprestimo();

    }

}