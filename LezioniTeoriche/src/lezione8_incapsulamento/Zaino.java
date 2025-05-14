package lezione8_incapsulamento;

import java.util.ArrayList;
import java.util.Iterator;

public class Zaino {
	private String marca;
	private String colore;
	private double volume;
	
	ArrayList<Oggetto> cose;

	public Zaino(String marca, String colore, double volume) {
		this.marca = marca;
		this.colore = colore;
		this.volume = volume;
	}
	public void inizializzaCose() {
		cose=new ArrayList<Oggetto>();
		cose.add(new Oggetto("biro", "blu", 0.02));
		cose.add(new Oggetto("quaderno", "righe", 0.08));
		cose.add(new Oggetto("PC", "Dell", 2.35));
	}
	
	public void elencaContenuto() {
		for (Oggetto oggetto: cose) {
			System.out.println(oggetto.getNome()+ ""+ oggetto.getDescrizione()+ ""+ oggetto.getVolume());
		}
	}
	
	public double calcolaVolumeOccupato() {
		double vol=0;
		for (Oggetto oggetto : cose) {
			vol += oggetto.getVolume();
		}
		return vol;
	}
	
	public boolean inserisciCOse(Oggetto o) {
		if(this.volume -(calcolaVolumeOccupato()+ o.getVolume())>=0) {
			cose.add(o);
			return true;
		}
		System.out.println("Oggetto "+ o.getNome()+ " non inserito per mancanza di spazio");
		return false;
	}
	
}
