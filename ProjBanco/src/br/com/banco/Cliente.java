package br.com.banco;

public class Cliente {
	private String nome, cpf;
	
	
	public Cliente(){
		this.setNome("Fulano da Silva");
		this.setCpf("111.111.111-11");
	}
	
	public Cliente(String nome, String cpf){
		this.setNome(nome);
		this.setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString(){
		return "Cliente: "+this.getNome() + "\n CPF: "+this.getCpf();
	}

}
