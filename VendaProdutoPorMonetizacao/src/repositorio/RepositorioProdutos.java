package repositorio;

import model.Cliente;
import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProdutos {
	private List<Produto> produtos;

	public RepositorioProdutos(List<Produto> produto) {
		
		produto = new ArrayList<Produto>();
	}

	public List<Produto> getProduto() {
		return produtos;
	}

	public boolean addProduto(Produto produto){
		return (produtos.add(produto));
		
	}
	public boolean produtoExiste(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
	
	 public Produto buscarProduto(String nome) {
		 
	        for (Produto produto : produtos) {
	            if (produto.getNome().equalsIgnoreCase(nome)) {
	                return produto;
	           }
	        }
	        return null;
	    }
	
	
	
	
}
