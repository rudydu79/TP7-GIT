package metier;

import java.util.Date;
import java.util.HashMap;


//test Rudy admin

public class Catalogue 
{

	private int annee;
	private Date dateDebut;
	private Date dateFin;
	private HashMap<Jouet,Integer> lesJouetsProposes;
	
	public Catalogue(int annee, Date dateDebut, Date dateFin) 
	{
		super();
		this.annee = annee;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lesJouetsProposes = new HashMap<Jouet,Integer>();
	}

	public int getAnnee() 
	{
		return annee;
	}

	public Date getDateDebut() 
	{
		return dateDebut;
	}

	public Date getDateFin() 
	{
		return dateFin;
	}
	
	public int quantiteProposee()
	{
		int cumul = 0;
		for (int qte : this.lesJouetsProposes.values())
			cumul += qte;
		
		return cumul;
	}
	
	public HashMap<Categorie,Integer> statsCateg()
	{
		HashMap<Categorie,Integer> lesCategories;
		Categorie uneCateg;
		Integer qte = 0;
		
		lesCategories = new HashMap<Categorie,Integer>();
		
		for (Jouet unJouet : this.lesJouetsProposes.keySet())
		{
			uneCateg = unJouet.getLaCateg();
			if (lesCategories.containsKey(uneCateg))
				qte = lesCategories.get(uneCateg) + this.lesJouetsProposes.get(unJouet);  
			
			lesCategories.put(uneCateg, qte);
				
		}
		
		return lesCategories;
	}
	
	public void ajouterJouet(Jouet unJouet, int qte)
	{
		this.lesJouetsProposes.put(unJouet, qte);
	}

	@Override
	public String toString() {
		return "Catalogue [annee=" + annee + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + "]";
	}
	
	
}
