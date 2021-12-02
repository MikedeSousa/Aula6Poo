package br.com.aula6.beans;

public class Medico extends Pessoa{	
	private String especialidade;
	private String crm;
	

	public Medico(String nome, String cpf, String fone, String especialidade, String crm) {
		super(nome, cpf, fone);
		this.especialidade = especialidade;
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public void pesquisar() {
		System.out.println("Pesquisando Médico");
		
	}

	@Override
	public void salvar() {
		System.out.println("Salvando Médico");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluindo Médico");
		
	}
	
		

}
