package model;
import java.awt.List;


public class Cliente {
	
	/*Cadastro de clientes: para cada cliente anota-se o CPF, nome e email.*/
	
	
    private String nome;
    private String cpf;
    private String email;
    private Conta conta;
    
    
    public Cliente(String nome, String cpf, String email,Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.conta = conta;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
    
    
    public boolean estaFinalizada(){
    	return true;
    }
    
    
}
