package view;

public class MainMenu {
	public static final int OP_CLIENTE = 1;
	public static final int OP_PRODUTO = 2;
	public static final int OP_SAIR = 0;
	
	public static String getOpcoes(){
		
	return(
	"**********Bem vindo!**********\n"+
	"Selecione uma opção:\n"+
	"1-Cliente\n"+
	"2 - Produtos\n"+
	"0 - Sair\n"+
	"------------------------------\n");
	}
}
