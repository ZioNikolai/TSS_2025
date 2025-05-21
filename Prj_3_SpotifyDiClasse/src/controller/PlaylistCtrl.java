package controller;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.Brano;

public class PlaylistCtrl {
	
	private ArrayList<Brano> brani;
	
	public PlaylistCtrl() {
		this.brani = new ArrayList<Brano>();
	}
	
	
	public void caricaCanzoni() {
		String raccolta[] = {
				"24K;Bruno Mars;3",
				"Beat It; Michael Jackson;3.5",
				"DTMF; Bad Bunny;4.1",
				"perfect; Ed Sheeran;2.5",
				"Beatiful people; Maryln Manson;4.0",
				"After hour; The Weeknd;4.0",
				"Californication;RHCP;3.5",
				"Pika Girl; S3rl;3.9",
				"Nu jeans e na maglietta;Nino D'angelo;2.5"	
		};
		for (String canzone : raccolta) {
			String[] splitted=canzone.split(";");
			String titolo= splitted[0];
			String autore= splitted[1];
			Double durata= Double.parseDouble(splitted[2]);
			
			Brano brano=new Brano(titolo, autore, 2.0);
			this.brani.add(brano);
			
		}
		
	}
	
	public void caricaCanzoniDaFile() {
		File fileCanzoni=new File("canzoni.csv");
	
		try {
			Scanner sc= new Scanner(fileCanzoni);
			
			while (sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] separate=riga.split(",");
				String autore= separate[0];
				String titolo= separate[1];
				Double durata= Double.parseDouble(separate[2]);
				Brano brano= new Brano(titolo, autore, durata);
				this.brani.add(brano);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("non sono stato in grado di trovare il file");
			e.printStackTrace();
		}
	}

	public ArrayList<Brano> getBrani() {
		return brani;
	}
	
	public void stampaBraniPL() {
		for (Brano brano : brani) {
			System.out.println(brano.stampa());
		}
	}
	
	
}
