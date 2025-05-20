public class ContaCorrente extends Conta {

    public ContaCorrente(String agencia, String titular) {
        super(agencia, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}


