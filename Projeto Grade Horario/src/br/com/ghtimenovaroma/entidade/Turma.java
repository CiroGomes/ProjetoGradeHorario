package br.com.ghtimenovaroma.entidade;

public class Turma {
	private Curso curso;
	private int periodoAtual;

	// nome = curso.sigla + periodoAtual;
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getPeriodoAtual() {
		return periodoAtual;
	}

	public void setPeriodoAtual(int periodoAtual) {
		this.periodoAtual = periodoAtual;
	}

	public Turma() {

	}
}
