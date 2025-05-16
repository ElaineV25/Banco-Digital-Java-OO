public class ContaCorrente extends Conta {
    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}

