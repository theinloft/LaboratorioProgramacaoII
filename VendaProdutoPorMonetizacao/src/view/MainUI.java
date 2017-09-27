package view;
import repositorio.RepositorioClientes;
import repositorio.RepositorioProdutos;
import view.MainMenu;
import util.Console;

public class MainUI {
	private RepositorioClientes listaClientes;
	private RepositorioProdutos listaProdutos;
	
	public MainUI(){
		listaClientes = new RepositorioClientes();
	}
	
	public void executar(){
		int opcao = 0;
		do {
			System.out.println(MainMenu.getOpcoes());
			opcao = Console.scanInt("Digite uma opção:");
			switch (opcao) {
			
			case MainMenu.OP_CLIENTE:
				new ClienteUI(listaClientes).executar();
				break;
			
			case MainMenu.OP_PRODUTO:
				
				new ProdutoUI(listaProdutos).executar();
				
				
			default:
				System.out.println("Opção inválida");
				break;
			}
			
			
		} while (opcao !=MainMenu.OP_SAIR);
	}
	

}
