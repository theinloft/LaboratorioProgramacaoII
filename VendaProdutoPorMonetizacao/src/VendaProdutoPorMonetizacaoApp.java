import java.util.Scanner;

public class VendaProdutoPorMonetizacaoApp {
	public static void main(String[]args){
		
		Menu menu = new Menu();
		Scanner s = new Scanner(System.in);
		int opcao = 0;
		
		/*
		 * Menu inicial
		 * 
		 * - chamar metodo menu inicial.
		 * 
		 */
		
		menu.menuInicial(opcao);
		opcao = s.nextInt();
		
	}

}
