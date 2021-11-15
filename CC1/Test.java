// Nom: XIROUCHAKIS,  Prenom: Alexandros,  Groupe: TP6
// paquetage anonyme

import java.text.DecimalFormat;

import javax.sound.sampled.LineEvent;

class Test {

public static void main (String [] args) {
	DecimalFormat df = new DecimalFormat("0.000"); // pour affichage de la distance
	
	System.out.println(); 		// à compléter : I.2 - appel à info 
	System.out.println();

// repereOK : limites A1-F5
	System.out.println("A1 ? " + lieu[0]); 	// à compléter : I.4 - appel à repereOK 
	System.out.println("B18 ? " + lieu[2]);
	System.out.println("G1 ? " + ...);
	System.out.println("C7 ? " + ...);
	System.out.println();


// Creation d'emplacements
	int nbElement = 5;
	Emplacement [] lieu ;
	
	lieu = ... 				// à compléter : I.8 a) tableau de nbElement 
	lieu[0] = new Emplacement ("A1");
	lieu[1] = new Emplacement ("C4");
	lieu[2] = new Emplacement ("B18"); // -> emplacement inconnu
	lieu[3] = new Emplacement ('B','1');
	lieu[4] = new Emplacement (...);	// à compléter I.8 b)

	System.out.println("Emplacements");
	for (int i=0; i<nbElement ; i++)
		System.out.println(i + ". " + lieu[i]);
	System.out.println();
	
// distance
	System.out.println("distance entre les lieux 0 et 1 (A1 à C4) : " 
	        + df.format(...));  		// à compléter I.9 : calcul distance 
	System.out.println();
	
// Sites
	nbElement = 4;
	Site [] curiosite;

	curiosite = new Site[nbElement];
	curiosite[0]= new Site("Pont du diable", lieu[0]);
	curiosite[1]= new Site("Ruines du chateau de la Belle", "F5");
	curiosite[2]= new Site("Musée des métiers d'autrefois", 'C','1');
	curiosite[3]= new Site("Caverne des Légendes", "B9");

	System.out.println("Sites");
	for (int i=0; i<nbElement ; i++)
		System.out.println(curiosite[i]);
	System.out.println();
	
// distance
	System.out.println("distance entre les curiosités 1 et 2 (F5 à C1) : " 
	        + df.format(...));   // à compléter II.4 - calcul distance 
	System.out.println();
	
} // main
}

