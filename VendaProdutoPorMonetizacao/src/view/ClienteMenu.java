
package view;

public class ClienteMenu {
	public static final int OP_CADASTRARCLIENTE = 1;
    public static final int OP_COMPRAR = 2;
    public static final int OP_DEPOSITAR = 3;
    public static final int OP_VOLTAR = 0;

    public static String getOpcoes() {
        return ("\n--------------------------------------\n"
                + "1- Efetuar Cadastro Cliente\n"
                + "2 - Efetuar Compra(precisa estar cadastrado)\n"	
                + "3 - Efetuar Depositar\n"
                + "0- Voltar\n"
                + "--------------------------------------\n");
    }    
	
	
	
	
}
