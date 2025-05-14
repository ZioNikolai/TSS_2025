package lezione8_incapsulamento;

public class Tester {
	
	public static void main(String[] args) {
		
		
		Studente stud1=new Studente("maria", "Verdi", 2025);
		
		//posso leggere le proprieta' solo perche ho i metodi get
		
		System.out.println(stud1.getNome());
		System.out.println(stud1.getCognome());
		System.out.println(stud1.getNumMatricola());
		System.out.println(stud1.toString());
		
		
		Studente stud2=new Studente("mario","Rossi",2024);
		System.out.println(stud2.toString());

		Studente stud3=new Studente("Nicolo'","musci",2025);
		stud3.setPresente("1234", false);
		System.out.println(stud3.toString());
		
		//CORSO
		Corso corso1=new Corso();//creo un corso vuoto e utilizzo i metodi set per 
		corso1.setDescrizione("Java e JavaScript");
		corso1.setDurataCorso(750);
		corso1.setStudenti(10);
		corso1.inserisciStudente(stud1);
		corso1.inserisciStudente(stud2);
		corso1.inserisciStudente(stud3);
		System.out.println(corso1.toString());
		
		//ZAINO
		Zaino Seven=new Zaino("Invicta", "blu", 6);
		Seven.inizializzaCose();
		
		Seven.inserisciCOse(new Oggetto("botiglia","acqua", 1));
		Seven.inserisciCOse(new Oggetto("Panino","Pomodoro e tonno", 0.6));
		Seven.inserisciCOse(new Oggetto("Nicolo","Smemoranda ", 2));

		Seven.elencaContenuto();
	}
}
