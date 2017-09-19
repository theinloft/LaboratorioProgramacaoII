import java.util.*;


public class Menu {
	private int opcao;
	
	public Menu(){
		this.opcao = 0;
	}
	
	
	
	Scanner s = new Scanner(System.in);
	 
	
	public void menuInicial(int opcaoDesejada){
		
		
		
		do{
			System.out.println("**********Bem vindo!**********");
			System.out.println("Selecione uma opção:");
			System.out.println("1-Cliente");
			System.out.println("2 - Vendedor");
			 opcaoDesejada = s.nextInt();
		 
		}while(opcaoDesejada <=0 && opcaoDesejada >=2);
		
		if(opcaoDesejada ==1){
			menuCliente();
		}
		
		
	}
	
	
	
	public void menuCliente(){
		
		do{
		
		System.out.print("------------------------");
		System.out.println("Escolha uma opção:");
		
		System.out.println("1 - Já é nosso cliente");
		System.out.println("2 - Deseja efetuar seu cadastro");
		System.out.println("0 - Voltar para menu principal");
		System.out.print("------------------------");
		int opcao = s.nextInt(); 
		
		}while(opcao<0 && opcao>=2);
		
		if(opcao == 1){
			
		}
		
		
	}
	

}
