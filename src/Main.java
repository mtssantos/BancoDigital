public class Main {
    public static void main(String[] args) {
        ContaCorrente p1 = new ContaCorrente("arthur vieira", 1111);
        CartaoCredito c1 = new CartaoCredito(1000,1400,6, "asda");
        ContaInvestimento ivest = new ContaInvestimento("Arthur Vieira", 1234);
        ContaPoupanca poup = new ContaPoupanca("Vieira Arthur", 4321);

        poup.deposito(1000);
        ivest.saque(500);
        p1.deposito(500);
    }
}