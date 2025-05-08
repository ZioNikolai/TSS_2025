package giochini;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner mioScann = new Scanner(System.in);
		char scelta;
		
		do {
			System.out.println("----MENU----");
			System.out.println("1. Gioco1");
			System.out.println("2. Gioco2");
			System.out.println("3. Gioco3");
			System.out.println("Q. Esci");
			System.out.println("----------");
			
			scelta = mioScann.nextLine().charAt(0);
			
			switch(scelta) {
			
			case 'a':
			case 'A':
			case '1':
				System.out.println("Hai scelto il gioco 1");
				//multipli
				//Stampa i numeri da 1 a 100. Per tutti i multipli di 3 stampa BOOM. Per tutti i multipli di 5 stampa ZOOM. Per tutti i multipli di 3 e 5 stampa BANGARANG
				break;
			case '2':
				System.out.println("Hai scelto il gioco 2");
				//pattern
				//Elabora un algoritmo per stampare il seguente Star Pattern
				//
				// @
				// @@
				// @@@
				// @@@@
				// @@@@@

				break;
			case '3':
				System.out.println("Hai scelto il gioco 3");
				//tombola
				//Ricrea il gioco della tombola. Da un set di 90 numeri estraine 20. Mi raccomando non posso estrarre 2 volte lo stesso numero.
			
				break;
			case 'q':
				System.out.println("Stai uscendo dal programma...");
				break;
				
			default:
				System.out.println("Scusa non capisco questo comando");
					
			}
			
		
		}while(scelta != 'q' && scelta != 'Q');
		
		System.out.println("Ciao, alla prossima partita !");
	}
}
