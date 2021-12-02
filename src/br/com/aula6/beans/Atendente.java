package br.com.aula6.beans;

public class Atendente extends Pessoa {
	
	public Atendente() {}

	public Atendente(String nome, String cpf, String fone) {
		super(nome, cpf, fone);
	
	}

	@Override
	public void pesquisar() {
		System.out.println("Pesquisar o Atendente");
		
	}

	@Override
	public void salvar() {
		System.out.println("Salvar o Atendente");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluir o Atendente");
		
	}
	
	

}
