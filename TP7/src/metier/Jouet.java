package metier;

public class Jouet 
{

	private int numero;
	private String libelle;
	private double prix;
	private Categorie laCateg;
	private TrancheAge laTranche;
	
	public Jouet(int numero, String libelle, double prix, Categorie laCateg,
			TrancheAge laTranche) 
	{
		super();
		this.numero = numero;
		this.libelle = libelle;
		this.prix = prix;
		this.laCateg = laCateg;
		this.laTranche = laTranche;
		this.laCateg.ajouterJouet(this);
	}

	public int getNumero() 
	{
		return numero;
	}

	public String getLibelle() 
	{
		return libelle;
	}

	public double getPrix() 
	{
		return prix;
	}

	public Categorie getLaCateg() 
	{
		return laCateg;
	}

	public TrancheAge getLaTranche() 
	{
		return laTranche;
	}
	
	
	public boolean convient(int age)
	{
		return (age >= this.laTranche.getAgeMin() && age <=this.laTranche.getAgeMax());
	}
	
	public String getInfos()
	{
	
		return this.libelle + ";" + this.laCateg.getLibelle() + ";" + this.laTranche.getAgeMin() 
				+ "-" + this.laTranche.getAgeMax();
	}
	
	
}
