package model;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Venda {
	private int codigo;
	private LocalDateTime hora;
	private LocalDate data;
	private Cliente cliente;
	private Produto produto;
	private int quantidade;
	
	
	public Venda(int codigo, Cliente cliente, Produto produto, int quantidade) {
		
		this.codigo++;
		this.hora = LocalDateTime.now();
		this.data = LocalDate.now();
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public LocalDateTime getHora() {
		return hora;
	}


	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}


	public LocalDate getData() {
		return data;
	}


	


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
	
	
	
}
