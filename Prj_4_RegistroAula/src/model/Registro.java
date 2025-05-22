package model;
import java.util.*;

public class Registro {

	/**
	 * nomeCorso
	 * studenti
	 * 
	 * getStudenteByMatricola(numMat) 
	 * 
	 * aggiungiStudenteAlCorso() **ATT**
	 */
	
	    private String nomeCorso;
	    private ArrayList<Studente> studenti;

	    public Registro(String nomeCorso, ArrayList<Studente> studenti) {
			this.nomeCorso = nomeCorso;
			this.studenti = new ArrayList<>();
		}

		public String getNomeCorso() {
			return this.nomeCorso;
		}

		public ArrayList<Studente> getStudenti() {
			return this.studenti;
		}
	    
		public Studente getStudByMat(int nMat) {
			for(Studente s:studenti) {
				if(s.getnMat()== nMat) {
					return s;
				}
			}
			return null;
			
		}
		
		public void aggiungiStudente(Studente s) {
			this.studenti.add(s);
			
		}
		
}
