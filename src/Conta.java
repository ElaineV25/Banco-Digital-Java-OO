public abstract class Conta {
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    public Conta(String agencia, String titular) {
        this.numero = SEQUENCIAL++;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void imprimirExtrato() {
        System.out.printf("Agência: %s | Conta %d - Titular: %s - Saldo: %.2f\n",
                agencia, numero, titular, saldo);
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
