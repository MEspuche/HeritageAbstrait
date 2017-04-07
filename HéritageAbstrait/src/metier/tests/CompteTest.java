package metier.tests;

import org.junit.Assert;
import org.junit.Test;

import metier.Compte;


public class CompteTest {

	
	
	@Test
	public void testRetirer()
	{
		float montant;
		montant = 900;
		Compte c = new Compte (1,"testCompte", 1000);
		float y = c.getSolde()-montant;
		float resultat = c.retirer(montant);
		Assert.assertEquals(true, (resultat==y));
	}

	@Test
	public void testRetirer2()
	{
		float montant;
		montant = 100000;
		Compte c = new Compte (1,"testCompte", 1000);
		float y = c.getSolde();
		float resultat = c.retirer(montant);
		Assert.assertEquals(true, (resultat==y));
	}
	
	
	@Test
	public void testVerser() 
		{
			float montant;
			montant = 10000;
			Compte c = new Compte (1,"testCompte", 1000);
			float y = c.getSolde()+montant;
			float resultat = c.verser(montant);
			Assert.assertEquals(true, (resultat==y));
		}
	
	@Test
	public void testVerser2() //cas montant inférieur à 0
	{
		float montant;
		montant = -10000;
		Compte c = new Compte (1,"testCompte", 1000);
		float y = c.getSolde();
		float resultat = c.verser(montant);
		Assert.assertEquals(true, (resultat==y));
	}
	
	

}
