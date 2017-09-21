import java.util.Scanner;

public class VendaProdutoPorMonetizacaoApp {
	public static void main(String[]args){
		
		Menu menu = new Menu();
		Scanner s = new Scanner(System.in);
		
		
		/*
		 * Menu inicial
		 * 
		 * - chamar metodo menu inicial.
		 * 
		 */
		
		int opcao = 0;
		menu.menuInicial(opcao);
		opcao = s.nextInt();
		
	}

}
