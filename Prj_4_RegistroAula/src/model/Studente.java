package model;

import java.util.Random;

public class Studente {

	/**
	 * nome
	 * cognome
	 * matricola
	 * corso
	 * contatore (all'occorrenza)
	 */
	
	private String nome;
	static String cognome;
	private int nMat;
	private String corso;
	private static int contatore=1;
	
	public Studente() {
		
	}

	public Studente(String nome, String cognome, int nMat, String corso) {
		this.nome = nome;
		this.cognome = cognome;
		this.nMat = nMat;
		this.corso = corso;
	}
	
	private static String tokenizer() {
		Random numRand=new Random();
		Double numD=numRand.nextDouble();
		
		return numD.toString(); 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getnMat() {
		return nMat;
	}

	public void setnMat(int nMat) {
		this.nMat = nMat;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}
}
