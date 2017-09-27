package view;

public class VendaMenu {
	public static final int OP_ADICIONARPRODUTO = 1;
	public static final int OP_FECHARCOMPRA = 2;
	public static final int OP_VOLTAR = 0;

	public static String getOpcoes() {
		return ("\n--------------------------------------\n"
                + "1- Adicionar Produto\n"
                + "2 - Fechar Compra\n"	
                + "0- Voltar\n"
                + "--------------------------------------\n");
    }    
		
	}


