package view;

public class ProdutoMenu {
	public static final int OP_CADASTRARPRODUTO =1;
	public static final int OP_BUSCARPRODUTO =2;
	public static final int OP_VOLTAR =0;
	
	 public static String getOpcoes() {
	        return ("\n--------------------------------------\n"
	                + "1- Efetuar Cadastro de Produto\n"
	                + "2 - Buscar Produto\n"	
	                + "0- Voltar\n"
	                + "--------------------------------------\n");
	    }



}
