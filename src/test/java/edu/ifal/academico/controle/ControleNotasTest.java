package edu.ifal.academico.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.ifal.academico.modelo.Estudante;

public class ControleNotasTest {
	
	private Estudante estudante1;
	private Estudante estudante2;
	private Estudante estudante3;
	private Estudante media1;
	private Estudante media2;
	private Estudante media3;
	private Estudante media;
	private Estudante estudante;
	private CriadorDeEstudante criadorDeEstudante;
	
	private Estudante Estudante(String string) {
		return estudante;
		
	}
	
	@Before
	public void inicializacao() {
		estudante1 = Estudante("Daphne");
		estudante2 = Estudante("Leilane");
		estudante3 = Estudante("da Silva");
		media1 = Estudante ("9");
		media2 = Estudante ("3");
		media3 = Estudante ("6");
		
	}

	@Test
	public void validaSeNotaForMenos1(){
		CriadorDeEstudante criadorDeEstudante;
		estudante1 = ;
		
		
		boolean resultadoEsperado = false;
		boolean resultadoObtido = true;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

	}
	
	
	@Test
	public void validaSeNotaFor0() {
		boolean resultadoEsperado = true;
		boolean resultadoObtido = false;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

		
	}
	@Test
	public void validaSeNotaFor5() {
		boolean resultadoEsperado = true;
		boolean resultadoObtido = false;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

		
	}
	@Test
	public void validaSeNotaFor10() {
		boolean resultadoEsperado = false;
		boolean resultadoObtido = true;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

		
	}
	@Test
	public void validaSeNotaFor11() {
		boolean resultadoEsperado = false;
		boolean resultadoObtido = true;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

		
	}
	
	
	@Test
	public void verificaSeCom5EhAprovado() {
		boolean resultadoEsperado = false;
		boolean resultadoObtido = true;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

		
	}
	
	@Test
	public void verificaSeCom6EhAprovado() {
		boolean resultadoEsperado = false;
		boolean resultadoObtido = true;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

		
	}
	
	@Test
	public void verificaSeCom7EhAprovado() {
		boolean resultadoEsperado = false;
		boolean resultadoObtido = true;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

		
	}
	
	@Test
	public void verificaSeCom3VaiPraRecuperacaoFinal() {
		boolean resultadoEsperado = false;
		boolean resultadoObtido = true;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

	}
	
	@Test
	public void verificaSeCom4VaiPraRecuperacaoFinal() {
		boolean resultadoEsperado = true;
		boolean resultadoObtido = false;
		
		
		
		assertEquals(resultadoEsperado, resultadoObtido);

		
	}
	
	
	
}
