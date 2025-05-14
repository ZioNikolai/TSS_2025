package lezione8_incapsulamento;

import java.util.Arrays;

public class Corso {
	private int contatore=0;
	private String descrizione;
	private int durataCorso;
	private Studente[] studenti;

	//non dichiaro il costruttore di default
	
	//genero i setter per modificare/creare le proprieta'
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public void setDurataCorso(int durataCorso) {
		this.durataCorso = durataCorso;
	}
	//mi serve per stabilire il numero dei studenti nel corso 
	public void setStudenti(int dimensione) {
		this.studenti=new Studente[dimensione];
	}
	
	public void inserisciStudente(Studente studente) {
		studenti[contatore]=studente;
		contatore++;
	}
	
	@Override
	public String toString() {
		StringBuilder desc= new StringBuilder();
		
		desc.append("Corso: "+ descrizione + "\n");
		desc.append("Durata: "+ durataCorso + "ore \n");
		desc.append("Posti Totali: "+ studenti.length);
		int postiDisponibili=studenti.length - (contatore);
		desc.append("Posti disponibili: "+ postiDisponibili + "\n");
		
		StringBuilder elencoStud= new StringBuilder();
		elencoStud.append("\nelenco Stud Iscritti: \n");
		for (Studente studente : studenti) {
			if (studente!=null) {
				elencoStud.append(studente.getNome() + "" + studente.getCognome()+"\n");				
			}
		}
		return desc.toString()+elencoStud.toString();
	}
	
}
