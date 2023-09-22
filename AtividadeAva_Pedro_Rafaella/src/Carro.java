public class Carro {
	public String Marca;
	public String Modelo;
	public int VeloAtual;
	public int VeloMax;

	public Carro(String marca, String modelo){
		this.Marca = marca;
		this.Modelo = modelo;
		this.VeloAtual = 0;
		this.VeloMax = 100;
	}
	
	public boolean Acelerar(int a){
		if (VeloAtual ==  VeloMax){
			return false;
		}
		
		VeloAtual = VeloAtual + a;
		if (VeloAtual > VeloMax){
			VeloAtual = VeloMax;
			return true;
		}
		return true;	
	}
	
	public boolean Frear(int a) {
		if (VeloAtual == 0) {
			return false;
		}
		
		VeloAtual = VeloAtual - a;
		if (VeloAtual < 0) {
			VeloAtual = 0;
			return true;
		}
		return true;	
	}
	
	public void Desligar () {
			VeloAtual = 0;
	}
}