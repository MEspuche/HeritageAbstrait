package metier.tests;

import org.junit.Assert;
import org.junit.Test;

import metier.ComptePayant;

public class ComptePayantTest {

	@Test
	public void testRetirer() {
		float montant;
		montant = 50;
		ComptePayant c = new ComptePayant (1,"testCompte", 1000, 0.2f);
		float y = c.getSolde()-(montant+(montant*0.2f/100));
		float resultat = c.retirer(montant);
		Assert.assertEquals(true, (resultat==y));
	}
	
	@Test
	public void testRetirer2() {
		float montant;
		montant = 1000;
		ComptePayant c = new ComptePayant (1,"testCompte", 1000, 0.2f);
		float y = c.getSolde();
		float resultat = c.retirer(montant);
		Assert.assertEquals(true, (resultat==y));
	}
	
	

	
	@Test
	public void testVerser() 
	{
		float montant;
		montant = 10000;
		ComptePayant c = new ComptePayant (1,"testCompte", 1000, 0.2f);
		float y = c.getSolde()+(montant-(montant*0.2f/100));
		float resultat = c.verser(montant);
		Assert.assertEquals(true, (resultat==y));
	}

}
