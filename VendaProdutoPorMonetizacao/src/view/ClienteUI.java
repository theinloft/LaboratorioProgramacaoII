package view;

import model.Cliente;
import model.Conta;
import model.Produto;
import model.Venda;
import repositorio.RepositorioClientes;
import util.Console;
import util.DateUtil;

public class ClienteUI {
	private RepositorioClientes lista;
	private Venda venda;
	private Produto produto;
	
	public ClienteUI(RepositorioClientes lista){
		this.lista = lista;
		
	}
	
	public void executar(){
		
		int opcao=0;
		
		do{
		
		
		System.out.println(ClienteMenu.getOpcoes());
		opcao = Console.scanInt("Digite uma opção:");
		switch (opcao) {
		
		case ClienteMenu.OP_CADASTRARCLIENTE:
			cadastrarCliente();
			break;
			
		case ClienteMenu.OP_COMPRAR:
			
			break;
			
		case ClienteMenu.OP_VOLTAR:
			System.out.println("Retornando ao menu principal..");
			break;
			
		default:
			System.out.println("Opção Inválida.");
			
		}
		
		}while(opcao != ClienteMenu.OP_VOLTAR);
	}




	private void cadastrarCliente() {
		String cpf = Console.scanString("CPF: ");
        if (lista.clienteExiste(cpf)) {
            System.out.println("CPF já existente no cadastro");
        } else {
            String nome = Console.scanString("Nome: ");
            String email = Console.scanString("E-mail:");
            Conta conta = new Conta(0);
            
                lista.addCliente(new Cliente(nome, cpf, email,conta));
                System.out.println("Cliente " + nome + " cadastrado com sucesso!");
            
            
        }
	}
	

        public void buscaCliente(){
        
        if (lista.getClientes().size() <= 0) {
            System.out.println("-----------------------------");
            System.out.println("Nao ha clientes cadastrados");
            System.out.println("-----------------------------\n");
        } else {
            for (Cliente cliente : lista.getClientes()) {
                System.out.println("\nNome" + cliente.getNome());
                
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Email:"+cliente.getEmail());
               
                if (cliente.estaFinalizada()) {
                    System.out.println("[ENCERRADA]");
                }
        
        
		
            }
        }
}
}
        
        

	


