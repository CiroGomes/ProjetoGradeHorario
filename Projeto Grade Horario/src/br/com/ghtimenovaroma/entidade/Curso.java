package br.com.ghtimenovaroma.entidade;

public class Curso {
	private String nome;
	private String sigla;
	private int periodoMax;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public int getPeriodoMax() {
		return periodoMax;
	}
	
	public void setPeriodoMax(int periodoMax) {
		this.periodoMax = periodoMax;
	}

	public Curso(){
		
	}
}
