public class TestCarro {
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat","Uno");
		
		System.out.println("Testando Acelerar()");
		System.out.println("Velocidade atual deve ser 20 e deve retornar true");
		System.out.println(carro.Acelerar(20));
		System.out.println(carro.VeloAtual);
		
		System.out.println();
		System.out.println("Velocidade atual deve ser 100 e deve retornar true");
		System.out.println(carro.Acelerar(90));
		System.out.println(carro.VeloAtual);
		
		System.out.println();	
		System.out.println("Velocidade atual deve ser 100 e deve retornar false");
		System.out.println(carro.Acelerar(200));
		System.out.println(carro.VeloAtual);
		
		System.out.println();
		System.out.println("Testando Frear()");
		
		System.out.println("Velocidade atual deve ser 20 e deve retornar true");
		System.out.println(carro.Frear(80));
		System.out.println(carro.VeloAtual);
		
		System.out.println();
		System.out.println("Velocidade atual deve ser 0 e deve retornar true");
		System.out.println(carro.Frear(200));
		System.out.println(carro.VeloAtual);
		
		System.out.println();
		System.out.println("Velocidade atual deve ser 0 e deve retornar false");
		System.out.println(carro.Frear(200));
		System.out.println(carro.VeloAtual);
		
		System.out.println("Testando Desligar()");
		System.out.println("Velocidade atual deve ser 30 antes de desligar");
		carro.VeloAtual = 30;

		System.out.println();
		System.out.println(carro.VeloAtual);
		System.out.println("Velocidade atual deve ser 0 após desligar");
		carro.Desligar();
		System.out.println(carro.VeloAtual);
	}
}