package view;

import model.Produto;
import model.Venda;
import repositorio.RepositorioVendas;
import repositorio.RepositorioProdutos;
import util.Console;

public class VendaUI {
	private RepositorioVendas lista; 
	private RepositorioProdutos produto;
	private Venda venda;
	
	
	
	
	public void executar(){
		
		int opcao = 0;
		
		do {
			System.out.println(VendaMenu.getOpcoes());
			opcao = Console.scanInt("Digite uma opção:");
			
			switch (opcao) {
			case VendaMenu.OP_ADICIONARPRODUTO:
				String nome = Console.scanString("Digite um produto que deseja comprar:");
				if(produto.buscarProduto(nome)==null){
					System.out.println("Produto não encontrado/ não existe");
				}
				else{
				System.out.println("Produto"+nome+"Adicionado");
				adicionarProduto(produto);
				}
				break;

			default:
				break;
			}
			
		} while (opcao !=VendaMenu.OP_VOLTAR);
	}


	private void adicionarProduto(RepositorioProdutos produto) {
		venda = new Venda(cliente, produto, quantidade);
		
		
	}

}
