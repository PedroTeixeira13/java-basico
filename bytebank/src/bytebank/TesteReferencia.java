package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		//isso é como se fossem duas cartas para o mesmo endereço
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		//vai alterar ambas as contas
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		//ambas as contas se referenciam para o mesmo objeto, nao significa que uma altera a outra
		//na verdade sao duas referencias para o mesmo objeto
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta");
		}
	}

}
