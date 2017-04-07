package metier;

public class CompteSimple extends Compte {

	private float decouvert;

	//Constructeur 1
	public CompteSimple(float decouvert) {
		super();//Super appelle le constructeur Compte()
		this.decouvert = decouvert;
	}
	
	//Constructeur 2
	public CompteSimple(int id, String nom, float solde, float decouvert) {
		super(id, nom, solde);//Super appelle le constructeur (id, nom, solde)
		this.decouvert = decouvert;
	}
	
	//Generation to string()
	@Override
	public String toString() {
		return "CompteSimple [" + super.toString() + " Découvert = " + decouvert + "]";// Appelle la méthode ToString() de la classe mère
	}


	
	@Override
	public float retirer(float montant)
	{
		if (montant>=0){
		if (montant<solde){
		if (montant<decouvert+solde)
		{
			this.solde=(this.solde - montant);
		 }
		}
		}
		return solde;
	}
	
	
	/*public float retirer(Compte c, float montant, float decouvert)
	  {
	 if (montant>=0){
	 if (-(c.getSolde()-montant)>decouvert){
	 		c.setSolde(c.getSolde() - montant);
	 	}
	  }
	 return c.getSolde();
	
	  }
	*/
	
	
	
	// Getter Setter
	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public float verser(float montant) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
