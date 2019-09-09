package edu.ifal.academico.controle;

import edu.ifal.academico.modelo.Disciplina;
import edu.ifal.academico.modelo.Estudante;

public class CriadorDeDisciplina {
	private Disciplina disciplina;
	private Estudante estudante;

	public CriadorDeDisciplina() {
		super();
	}
	
	public CriadorDeDisciplina criadorDeDisciplina (Disciplina nome, Estudante matricula) {
		this.disciplina = (nome);
		this.estudante = (matricula);
		
		return this;
		
	}

	public Disciplina constroi() {
		return this.disciplina;
	}
	

	

}
