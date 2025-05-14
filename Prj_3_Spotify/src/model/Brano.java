package model;

	public class Brano {
		private String autore;
		private String titolo;
		private String genere;
		private int durata; // durata in secondi
		
		public Brano(String autore, String titolo, String genere, int durata) {
			super();
			this.autore = autore;
			this.titolo = titolo;
			this.genere = genere;
			this.durata = durata;
		}
		
		public void play() {
			System.out.println("Stiamo riproducendo: "+titolo+"di "+ autore);
			
		}
		
		public void stampaInfo() {
			 System.out.println("Titolo: " + titolo + 
					 			", Autore: " + autore + 
					 			", Genere: " + genere + 
					 			", Durata: " + durata + " sec");
		}

		public int getDurata() {
			return durata;
		}

		public String getAutore() {
			return autore;
		}

		public String getTitolo() {
			return titolo;
		}

		public String getGenere() {
			return genere;
		}
		
}

