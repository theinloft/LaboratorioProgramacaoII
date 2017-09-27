package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Venda;

public class RepositorioVendas {
	private List<Venda> vendas;
	
	public RepositorioVendas(List<Venda> venda){
		venda = new ArrayList<Venda>();
	}
	
	public List<Venda> getVenda(){
		return vendas;
	}
	
	public boolean addVenda(Venda venda){
		return (vendas.add(venda));
	}
	
	
	

}
