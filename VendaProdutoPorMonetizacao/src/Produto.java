
public class Produto {
	private int codigoProduto;
	private String nome;
	private double preco;
	
	
	public Produto(int codigoProduto, String nome, double preco) {
	
		this.codigoProduto = codigoProduto;
		this.nome = nome;
		this.preco = preco;
	}


	public int getCodigoProduto() {
		return codigoProduto;
	}


	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	

}
