public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("0001","Paula");
        Conta cp = new ContaPoupanca("0002","Luciana");

        cc.depositar(1500);
        cc.transferir(700, cp);
        

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
