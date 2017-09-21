
public class Conta {
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	
	public Conta(double saldo) {
	
		this.numero = (int) (Math.random() * 101);
		this.saldo = saldo;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}
	
	
	
	
}
