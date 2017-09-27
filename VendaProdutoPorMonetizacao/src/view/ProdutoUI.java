package view;


import model.Produto;
import repositorio.RepositorioProdutos;
import util.Console;

public class ProdutoUI {
	private RepositorioProdutos lista;
	
	public ProdutoUI(RepositorioProdutos lista){
		this.lista = lista;
		
	}
	
	public void executar(){
		int opcao=0;
		
		do{
			System.out.println(ProdutoMenu.getOpcoes());
			opcao = Console.scanInt("Digite uma opção:");
			
			switch (opcao) {
			
			case ProdutoMenu.OP_CADASTRARPRODUTO:
				cadastraProduto();
				
				break;
				
			case ProdutoMenu.OP_BUSCARPRODUTO:
				
				
				break;
				

			default:
				System.out.println("Opção Inválida");
				break;
			}
			
			
		}while(opcao !=ProdutoMenu.OP_VOLTAR);
	}

	private void buscaProduto(String nome) {
		lista.buscarProduto(nome);
		
		
		
	}

	private void cadastraProduto() {
		// TODO Auto-generated method stub
		
		String nome = Console.scanString("Digite o nome do Produto: ");
		
        if (lista.produtoExiste(nome)) {
            System.out.println("Produto já existente no cadastro");
        } else {
        	
            double preco = Console.scanDouble("Digite o valor do produto:");
            
                lista.addProduto(new Produto(nome,preco));
                System.out.println("Produto: " + nome + " cadastrado com sucesso!");
            
            
        }
		
	}

}
