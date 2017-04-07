package metier.tests;

import org.junit.Assert;
import org.junit.Test;

import metier.CompteSimple;

public class CompteSimpleTest {

	@Test
	public void testRetirer() 
	{
		float montant;
		montant = 900;
		CompteSimple c = new CompteSimple (1,"testCompte", 12000,1000);
		float y = c.getSolde()-montant;
		float resultat = c.retirer(montant);
		Assert.assertEquals(true, (resultat==y));
	}
	
	@Test
	public void testRetirer2() 
	{
		float montant;
		montant = 13000;
		CompteSimple c = new CompteSimple (1,"testCompte", 12000,1000);
		float y = c.getSolde()-montant;
		float resultat = c.retirer(montant);
		Assert.assertEquals(y, resultat, 0);
	}
	
	@Test
	public void testRetirer3() 
	{
		float montant;
		montant = 14000;
		CompteSimple c = new CompteSimple (1,"testCompte", 12000,1000);
		float y = c.getSolde();
		float resultat = c.retirer(montant);
		Assert.assertEquals(true, (resultat==y));
	}


}
