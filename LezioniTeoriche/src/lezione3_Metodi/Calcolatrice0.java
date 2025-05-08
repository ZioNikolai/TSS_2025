package lezione3_Metodi;

import java.util.Scanner;

public class Calcolatrice0 {

	public static void main(String[] args) {
		
		double primoNum = getInput("Inserisci il primo num ?");
		double secondNum = getInput("Inserisci il secondo num ?");
		
		double somma = primoNum + secondNum;
		
		System.out.println("La somma dei tuoi 2 numeri vale: " + somma);
		
	}
	
	public static double getInput(String domanda) {
		return 0;
	}
	
	
	public static double getInput(String domanda) {
		System.out.println(domanda);
		
		Scanner input = new Scanner(System.in);
		
		double mioDouble = input.nextDouble();
		
		return mioDouble;
	}
	
}
