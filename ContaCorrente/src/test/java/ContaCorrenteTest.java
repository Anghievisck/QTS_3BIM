import service.ContaCorrente;

public class ContaCorrenteTest {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(100);
		System.out.println(cc1.saldo + " - deve ser 100");
		cc1.depositar(50);
		System.out.println(cc1.saldo + " - deve ser 150");
		
		boolean sucesso = cc1.sacar(80);
		System.out.println(cc1.saldo + " - deve ser 70");
		System.out.println(sucesso + " - deve ser true");
		
		sucesso = cc1.sacar(80);
		System.out.println(cc1.saldo + " - deve ser 70");
		System.out.println(sucesso + " - deve ser false");
		
		System.out.println("Desafio Transferir: ");
		System.out.println("");
		
		ContaCorrente cc2 = new ContaCorrente();
		boolean sucesso2 = cc1.transferir(70, cc2);
		System.out.println(cc1.saldo + " - deve ser 0");
		System.out.println(cc2.saldo + " - deve ser 70");
		System.out.println(sucesso2 + " - deve ser true");		

		sucesso2 = cc1.transferir(70, cc2);
		System.out.println(cc1.saldo + " - deve ser 0");
		System.out.println(cc2.saldo + " - deve ser 70");
		System.out.println(sucesso2 + " - deve ser false");		
	}
}