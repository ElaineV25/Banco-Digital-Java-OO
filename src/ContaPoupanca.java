public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, String titular) {
        super(agencia, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}
