package repositorio;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class RepositorioClientes {
	private List<Cliente> clientes;
	

	public RepositorioClientes() {
		
		clientes = new ArrayList<Cliente>();
	}
	
	public boolean addCliente(Cliente cliente){
		return (clientes.add(cliente));
		
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public boolean clienteExiste(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
           }
        }
        return null;
    }
	
	
	
}
