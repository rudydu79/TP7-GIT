package test;


import ihm.FenetreMenu;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Vector;

import metier.Catalogue;
import metier.Categorie;
import metier.Jouet;
import metier.TrancheAge;
public class MenuPrincipal {


	public static void main(String[] args) 
	{
        FenetreMenu f= new FenetreMenu();
        f.setBounds(20,20,350,300);
        f.setVisible(true);
        f.setTitle("Ergosum");

	}
	
	public static Vector<Catalogue> getLesCatalogues() 
	{
		Vector<Catalogue> lesCatalogues;
		TrancheAge t1,t2;
		Categorie c1,c2;
		Jouet j1, j2, j3;
		Catalogue cat1,cat2;
		
		lesCatalogues= new Vector<Catalogue>();
		
		t1 = new TrancheAge("t1",5,7);
		t2 = new TrancheAge("t2",8,12);
		
		c1 = new Categorie("c1","jeu éducatif");
		c2 = new Categorie("c1","jeu de société");
		
		j1 = new Jouet(253,"Console de jeux éducatifs Vtech Storio",25.50,c1,t1);
		j2 = new Jouet(445,"Puzzle éducatif",8,c1,t1);
		j3 = new Jouet(445,"Puzzle éducatif",9.90,c1,t2);

		cat1 = new Catalogue(2013,Date.valueOf("2013-11-01"),Date.valueOf("2013-12-15"));
		cat1.ajouterJouet(j1, 5);
		cat1.ajouterJouet(j2, 5);
		cat1.ajouterJouet(j3, 5);
				
		cat2 = new Catalogue(2014,Date.valueOf("2014-11-01"),Date.valueOf("2014-12-15"));
		
		lesCatalogues.add(cat1);
		lesCatalogues.add(cat2);
		
		return lesCatalogues;
	}
	
	public static Vector<TrancheAge> getLesTranches() 
	{
		Vector<TrancheAge> lesTranches;
		
		lesTranches= new Vector<TrancheAge>();
		
		lesTranches.add(new TrancheAge("t1",5,7));
		lesTranches.add(new TrancheAge("t2",8,12));

		return lesTranches;
	}
}
