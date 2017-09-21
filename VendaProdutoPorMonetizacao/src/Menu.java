import java.util.*;


public class Menu {
	
	private Conta[] conta;
	private Cliente[] cliente;
	private Produto[] produto;
	
	public Menu(){
		
	}
	
	
	
	Scanner s = new Scanner(System.in);
	 
	
	public void menuInicial(int opcaoDesejada){
		
		
		
		do{
			System.out.println("**********Bem vindo!**********");
			System.out.println("Selecione uma opção:");
			System.out.println("1-Cliente");
			System.out.println("2 - Lojista");
			System.out.println("------------------------------");
			 opcaoDesejada = s.nextInt();
		 
		}while(opcaoDesejada <=0 && opcaoDesejada >=3);
		
		if(opcaoDesejada ==1){
			menuCliente(opcaoDesejada);
		}
		if(opcaoDesejada == 2){
			menuLojista();
		}
		
		
	}
	
	
	
	private void menuLojista() {
		
		
	}



	public void menuCliente(int opcao){
		int opcaoSubmenu;
		do{
		
		System.out.println("------------------------");
		System.out.println("Escolha uma opção:");
		
		System.out.println("1 - Já é nosso cliente");
		System.out.println("2 - Deseja efetuar seu cadastro");
		System.out.println("0 - Voltar para menu principal");
		System.out.println("------------------------");
		opcaoSubmenu = s.nextInt(); 
		
		}while(opcaoSubmenu<0 && opcaoSubmenu>=3);
		
		if(opcaoSubmenu == 1){
			//buscar cliente existente para fazer operação de compra,deposito,etc...
			System.out.println("");
			
		}
		if(opcaoSubmenu == 2){
			System.out.println("**********Cadastro**********");
			System.out.println("Digite seu nome:");
			String nome = s.nextLine();
			System.out.println("Digite seu CPF:");
			String cpf = s.nextLine();
			System.out.println("Digite seu E-mail:");
			String email = s.nextLine();
			
			double saldo = 0.00;
			Conta novaConta = new Conta(saldo);
			
			
			
			
			Cliente novoCliente = new Cliente(nome,cpf,email);
			
			for(int i=1;i<=cliente.length;i++){
				cliente[i] = novoCliente;
			}
		}
		
		
	}
	

}
