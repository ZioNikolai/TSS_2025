package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String nomePL;
	private List<Brano> brani;
	
	public Playlist(String nomePL) {
		this.nomePL = nomePL;
		this.brani = new ArrayList<Brano>(10);//posso mettere 10 brani
		System.out.println("");
	}

	public String getNomePL() {
		return nomePL;
	}

	public List<Brano> getBrani() {
		return brani;
	}
	
	public void addbrano(Brano brano) {
		if (brani.size()<= 10) {
			brani.add(brano);
		}else
		System.out.println("non puoi piu inserire le canzoni");
	}
	
	public void infoPlaylist() {
		System.out.println("hai scelto la playlist" + this.nomePL);
		int spazioDisponibile= 10- this.brani.size();
		
	}
}

