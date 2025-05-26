package lezione10_AnimaliGeometrici;

public class Fattoria {

	public static void main(String[] args) {
		//La fattoria è fatta di Animali
		
		Animale mioCane = new Cane();
		Animale mioGatto = new Gatto();
		Animale miaMucca = new Mucca();
		
		//
		System.out.println("----La fattoria si sveglia !!! ----");
		mioCane.faiVerso();
		mioGatto.faiVerso();
		miaMucca.faiVerso();
		
		System.out.println("-----Contiamo gli animali-----");
		Animale[] animaliNellaFattoria = new Animale[4];
		
		animaliNellaFattoria[0] = mioCane;
		animaliNellaFattoria[1] = mioGatto;
		animaliNellaFattoria[2] = miaMucca;
		animaliNellaFattoria[3] = new Gallo();
		
		for(int i = 0; i < animaliNellaFattoria.length; i++) {
			System.out.print("Animale num " + i);
			animaliNellaFattoria[i].faiVerso();
		}
		
		
		System.out.println("Aggiungiamo un pappagallo");
		Pappagallo pappagallo = new Pappagallo();
		System.out.print(pappagallo.versoAlt());
	
	}
}
