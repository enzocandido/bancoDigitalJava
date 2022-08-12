package banco;

public class Main {
	public static void main(String[] args) {
		Cliente enzo = new Cliente();
		enzo.setNome("Enzo");
		Conta cc = new ContaCorrente(enzo);
		Conta poupanca = new ContaPoupanca(enzo);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
