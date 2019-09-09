package edu.ifal.academico.controle;

import edu.ifal.academico.modelo.Estudante;

public class CriadorDeEstudante {
	private Estudante estudante;

	public CriadorDeEstudante() {
		super();
	}
	
	public CriadorDeEstudante criadorDeEstudante (Estudante nome, Estudante endereco) {
		this.estudante = (nome);
		this.estudante = (endereco);
			
		return this;
	}
	
	public Estudante constroi() {
		return this.estudante;
	}
}