package metier;

public class ComptePayant extends Compte {

	private float pourcentage;

	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}

	public ComptePayant(int id, String nom, float solde, float pourcentage) {
		super(id, nom, solde);
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "ComptePayant [pourcentage=" + pourcentage + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public float retirer(float montant)
	{
		if(montant>=0){
		if ((montant+(montant*pourcentage/100))<=this.solde){
			this.solde= this.solde -(montant+(montant*pourcentage/100));
			 }
		}
		return this.solde;
	}
	
	
	@Override// car la méthode existe déjà ! 
	public float verser(float montant)
	{
		if(montant>=0){
		{
			this.solde=this.solde + (montant-(montant*pourcentage/100));
			 }
		}
		return this.solde;
	}
	
	/*public float retirer(Compte c, float montant, float pourcentage)
	  {
	 if (montant>=0){
	 if (montant<=c.getSolde()){
	 		c.setSolde(c.getSolde() - (montant+(montant*pourcentage/100)));
	 	}
	  }
	 return c.getSolde();
	
	  }
	
	public float verser(Compte c, float montant, float pourcentage)
	  {
	 if (montant>=0){
		 if (montant<=c.getSolde()){
		 		c.setSolde(c.getSolde() + (montant-(montant*pourcentage/100)));
		 	}
	  }
	 return c.getSolde();
	
	  }
	  */

	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	
}
