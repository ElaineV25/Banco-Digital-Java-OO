public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Paula");
        Conta cp = new ContaPoupanca("Luciana");

        cc.depositar(1000);
        cc.transferir(300, cp);
        
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
