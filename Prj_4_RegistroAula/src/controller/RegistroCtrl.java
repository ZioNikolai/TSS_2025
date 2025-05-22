package controller;

	/**
	 * Sviluppa i seguenti metodi
	 * caricaStudentiDaFile()
	 * 
	 * ****aggiungiStudenteAFile()****
	 * 
	 * faiAppello() {chiede se lo stud è presente o assente. Lo stud è presente ? Y/N 
	 * stampaPresenti()
	 * stampaAssenti()
	 */
	
	import java.io.*;
	import java.util.*;

import model.Registro;
import model.Studente;

	public class RegistroCtrl {
		
	    private ArrayList<Studente> studenti = new ArrayList<Studente>();
	    ArrayList<Studente> presenti = new ArrayList<Studente>();
	    ArrayList<Studente> assenti = new ArrayList<Studente>();
	    private Registro registro; 
	    
	    
public RegistroCtrl(ArrayList<Studente> studenti, ArrayList<Studente> presenti, ArrayList<Studente> assenti,
				Registro registro) {
			this.studenti = studenti;
			this.presenti = presenti;
			this.assenti = assenti;
			this.registro = registro;
		}

//	    String nomeFile = "studenti.txt";

	    // Carica gli studenti dal file
	    public void caricaStudentiDaFile() {
	    	File fileElenco = new File("./elencoStudenti_TSS.csv");
	        try {
	            Scanner input=new Scanner(fileElenco);
	            while (input.hasNextLine()) {
	                String line=input.nextLine();
	                String[] elementi= line.split(",");
	                String nomeStud=elementi[0];
	                String cognomeStud=elementi[1];
	                String nomeCorso=elementi[2];
	                Integer matricola=Integer.parseInt(elementi[3]);
	                
	                Studente s=new Studente(nomeStud, cognomeStud,matricola,nomeCorso);
	                
	            }
	           
	        } catch (FileNotFoundException e) {
	            System.out.println("Errore nella lettura del file.");
	        }
	      
	    }
	    public void faiAppello() {
	    Scanner input=new Scanner(System.in);
	    
	    char scelta;
	    
	    presenti.clear();
	    assenti.clear();
	    
	    for(Studente studente: studenti);
	    	do {
	    		System.out.println(Studente);
	    		System.out.println("lo studente e presente o assente? ");
	    		
	    	}while(scelta !='p' && schelta!='a');
	    }
	}


