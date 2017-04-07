package metier;

public abstract class Compte {

	
	private int id;
	private String nom;
	protected float solde;
	private static int nbComptes;
	public final float PI=3.14f;// exemple d'attribut final
	
	
	
	//Constructeur sans argument
	public Compte()
	{
		super();
		nbComptes++;
		
	}

	
	public Compte(int id, String nom, float solde)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.solde = solde;
		nbComptes++;
	}
	
	
	
/**
 * Methode retirer
 * @param montant montant a retirer
 * @return solde restant
 */
	public abstract float retirer(float montant);
	
	public static int getNbComptes() {
		return nbComptes;
	}


	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}


	/**
	 * Methode verser
	 * @param montant montant à verser
	 * @return nouveau solde
	 */
	public float verser(float montant)
	{
		if(montant>=0){
			this.solde+=montant;// this.solde = this.solde + montant
			 }
		return this.solde;
	}
	/*
	 * public float retirer(Compte c, float montant)
	  {
	 if (montant>=0){
	 if (montant<=c.getSolde()){
	 		c.setSolde(c.getSolde() - montant);
	 	}
	  }
	 return c.getSolde();
	
	  }
	
	 
	  * Si c'etait dans la classe service 
	  * public float verser(Compte c, float montant)
	  {
	 if(montant>=0){
	  c.setSolde(c.getSolde() + montant);
	 }
	 return c.getSolde();
	  }
	  */

	//Génération getter et setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

    // Génération méthode ToString()
	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", solde=" + solde + "]";
	}
	
	
	
	
	
	
}
