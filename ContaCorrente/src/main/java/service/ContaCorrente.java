package service;

import java.util.ArrayList;

public class ContaCorrente {
	//atributos: características da classe
	public String nomeTitular;
	public double saldo;
	public ArrayList<String> historicoOperacoes = new ArrayList<>();

	//métodos: ações
	public void depositar(double valor) {
		//this indica que é o atributo da classe
		//só é obrigatório qnd mesmo nome do parâmetro
		this.saldo = this.saldo + valor;
		historicoOperacoes.add("depósito: " + valor);
	}
	
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			historicoOperacoes.add("saque: " + valor);
			return true;		
		}
		return false;
	}
	
	public boolean transferir(double valor, ContaCorrente contaDestino) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			contaDestino.saldo = contaDestino.saldo + valor;
			historicoOperacoes.add("transf. enviada: " + valor);
			contaDestino.historicoOperacoes.add("transf. recebida: " + valor);
			return true;
		}
		return false;		
	}
	public ArrayList<String> extrato(){
		historicoOperacoes.add("Saldo final: " + this.saldo);
		return historicoOperacoes;
	}
}