package lezione8_incapsulamento;

public class Studente {
	private String Nome;
	private String Cognome;
	private int annoIscrizione;
	private int numMatricola;
	private boolean presente;
	static int contatore;
	
	public Studente(String nome, String cognome, int annoIscrizione) {
		Nome = nome;
		Cognome = cognome;
		this.annoIscrizione = annoIscrizione;
		this.presente=true;
		this.numMatricola=++contatore;
	}

	///Per poter modificare le prop devo creare i metodi  getters & setter
	public String getNome() {
		return Nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}

	public int getNumMatricola() {
		return numMatricola;
	}

	public boolean isPresente() {
		return presente;
	}
	
	//con il set modifico, valorizzo un valore ad una proprieta'
	public void setPresente(String pass,boolean presente) {
		if (pass.equals("1234")) {
			this.presente=presente;
		}else {
			System.out.println("non puoi variare la presenza" + this.Nome);
		}
	}

	@Override
	public String toString() {
		StringBuilder desc=new StringBuilder();
		desc.append(this.numMatricola);
		desc.append("\t");
		desc.append(this.Nome);
		desc.append("\t");
		desc.append(this.Cognome);
		desc.append("\t");
		desc.append(this.presente ? "presente":"assente");
		
		return desc.toString(); //Sto facendo il toString() dell'oggetto StringBuilder
	}
	
	
	
	

}
