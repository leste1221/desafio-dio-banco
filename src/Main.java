public class Main {
    public static void main(String[] args) {
        Cliente wesley = new Cliente();
        wesley.setNome("Wesley");
        Conta cc = new ContaCorrente(wesley);
        Conta poupanca = new ContaPoupanca(wesley);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
