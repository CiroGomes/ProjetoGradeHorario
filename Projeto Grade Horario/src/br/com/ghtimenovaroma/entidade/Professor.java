package br.com.ghtimenovaroma.entidade;

public class Professor {
	private String nome;
	private Disponibilidade disponibilidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Disponibilidade getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public Professor() {

	}
}
