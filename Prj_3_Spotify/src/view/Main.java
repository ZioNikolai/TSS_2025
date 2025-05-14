package view;

import model.Brano;

public class Main {
	public static void main(String[] args) {
		Brano b1= new Brano("Autore1", "Titolo1", "Neomelodico", 210);
		Brano b2= new Brano("Autore2", "Titolo2", "Trap", 350);
		
		model.Playlist playlist = new model.Playlist("| La mia playlist |");
        playlist.addBrano(b1);
        playlist.addBrano(b2);

        playlist.infoPlayList();

        b1.play();
	}
}
