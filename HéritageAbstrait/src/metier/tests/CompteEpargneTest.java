package metier.tests;

import org.junit.Assert;
import org.junit.Test;

import metier.CompteEpargne;

public class CompteEpargneTest {

	@Test
	public void testCalculInteret() {
		CompteEpargne ce = new CompteEpargne(3,"testCompteEpargne",14000,(float)0.5);
		float y= ce.getSolde()*(1+0.5f);
		float resultat = ce.calculInteret();
		Assert.assertEquals(true, (resultat==y));
	}

}
