package model;

public class Brano implements Comparable<Brano> {
	    private String autore;
	    private String titolo;
	    private String genere;
	    private int durata; // durata in secondi

	    public Brano(String autore, String titolo, String genere, int durata) {
	        this.autore = autore;
	        this.titolo = titolo;
	        this.genere = genere;
	        this.durata = durata;
	    }

	    public void play() {
	        System.out.println("Riproducendo: " + titolo + " di " + autore);
	    }

	    public void stampaInfo() {
	        System.out.println("Titolo: " + titolo + ", Autore: " + autore + ", Genere: " + genere + ", Durata: " + durata + " sec");
	    }

	    public int getDurata() {
	        return durata;
	    }

	    @Override
	    public int compareTo(Brano other) {
	        return this.titolo.compareTo(other.titolo); // ordina per titolo
	    }
	
}
