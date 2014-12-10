package metier;

import java.util.ArrayList;

public class Categorie 
{

	private String code;
	private String libelle;
	private ArrayList<Jouet> lesJouets;
	
	public Categorie(String code, String libelle) 
	{
		super();
		this.code = code;
		this.libelle = libelle;
		this.lesJouets = new ArrayList<Jouet>();
	}

	public String getCode() 
	{
		return code;
	}

	public String getLibelle() 
	{
		return libelle;
	}
	
	public void ajouterJouet(Jouet unJouet)
	{
		this.lesJouets.add(unJouet);
	}
	
	public int nbJouets()
	{
		return this.lesJouets.size();
	}
	
}
