package model;

public class Conta {
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	
	public Conta(double saldo) {
	
		this.numero = (int) (Math.random() * 101);
		this.saldo = saldo;
	}


	public void consultaSaldo() {
		System.out.println("Saldo da Conta R$:"+saldo);
	}


	

	public int getNumero() {
		return numero;
	}
	
	public void depositar(double valor){
		if(valor >0){
		saldo+=valor;
		
		}
	}
	public void transferencia(double valor, int numero){
		if(valor >0 && saldo >0){
			saldo -=valor;
			
		}
	}
	
	
	
	
}
