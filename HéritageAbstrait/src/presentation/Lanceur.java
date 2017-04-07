package presentation;

import java.util.Scanner;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float leMontant;

		//Compte c = new Compte(1,"testCompte", 1000);
		//System.out.println(c);
		//System.out.println("-------------------Nombre COMPTES---------------------");
		//System.out.println(Compte.getNbComptes());
		//System.out.println("----------------------------------------");
		
		
		CompteSimple cs = new CompteSimple(2,"testCompeSimple",12000,1000);
		System.out.println(cs);
		System.out.println("-------------------Nombre COMPTES---------------------");
		System.out.println(Compte.getNbComptes());
		System.out.println("----------------------------------------");
		
		
		CompteEpargne ce = new CompteEpargne (3,"testCompteEpargne",14000,(float)0.5);
		System.out.println(ce);
		System.out.println("-------------------Nombre COMPTES---------------------");
		System.out.println(Compte.getNbComptes());
		System.out.println("----------------------------------------");
		
		
		
		
		ComptePayant cp = new ComptePayant(4,"testComptePayant",18000,0.2f);
		System.out.println(cp);
		System.out.println("-------------------Nombre COMPTES---------------------");
		System.out.println(Compte.getNbComptes());
		System.out.println("----------------------------------------");
		/*
		 * un compte simple est un compte (transtypage)
		 * Compte x = (Compte)cs; ou Compte cs2 = (Compte) new CompteSimple(2,...,...,...);
		 * System.out.println(x);
		 */
		Compte x = (Compte)cs; // Transtypage implicite 
		System.out.println(x);
		System.out.println(x.getClass());// la classe fille prédomine toujours sur la classe mère au niveau des méthodes
		
		
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel montant voulez vous verser ?");
		leMontant = clavier.nextFloat();
		//c.verser(leMontant);
		//System.out.println(c);
		cs.verser(leMontant);
		System.out.println(cs);
		ce.verser(leMontant);
		System.out.println(ce);
		cp.verser(leMontant);
		System.out.println(cp);
		
		System.out.println("Quel montant voulez vous retirer ?");
		leMontant = clavier.nextFloat();
		//c.retirer(leMontant);
		//System.out.println(c);
		cs.retirer(leMontant);
		System.out.println(cs);
		ce.retirer(leMontant);
		System.out.println(ce);
		cp.retirer(leMontant);
		System.out.println(cp);
		
		ce.calculInteret();
		System.out.println(ce);
		
		/*System.out.println(c.verser(c, leMontant));
		System.out.println(cs.verser(cs, leMontant));
		System.out.println(ce.verser(ce, leMontant));
		System.out.println(cp.verser(cp, leMontant, cp.getPourcentage()));
		
		
		System.out.println("Quel montant voulez vous retirer ?");
		leMontant = clavier.nextFloat();
		System.out.println(c.retirer(c, leMontant));
		System.out.println(cs.retirer(cs, leMontant, cs.getDecouvert()));
		System.out.println(ce.retirer(ce, leMontant));
		System.out.println(cp.retirer(cp, leMontant,cp.getPourcentage()));
		*/
	}

}
