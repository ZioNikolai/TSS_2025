package model;

import java.util.ArrayList;

public class Playlist {
	private ArrayList<Brano> brani;
	private String nome;		

	
	public Playlist(String nome){
		this.nome=nome;
		this.brani=new ArrayList<>();
	}

	public void addBrano(Brano b) {
		brani.add(b);
		
	}

	public void removeBrano(Brano b) {
		brani.remove(b);
		
	}
	
	public void infoPlayList() {
		int durataTotale=0;
		System.out.println("Playlist: " + nome);
		System.out.println("Numero brani: " + brani.size());
		for (Brano b : brani) {
			b.stampaInfo();
			durataTotale += b.getDurata();
		}
		System.out.println("Durata totale: " + durataTotale + "secondi");
		
	}

}


