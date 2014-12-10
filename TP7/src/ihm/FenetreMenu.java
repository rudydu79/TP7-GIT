package ihm;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import metier.TrancheAge;
import test.MenuPrincipal;


public class FenetreMenu extends JDialog implements ActionListener 
{
	
	private Container contenu ;
	private JLabel lblTitre ;
	private JLabel lblStitre ;
	private JRadioButton rbAjoutTrancheAge;
	private JRadioButton rbListeTrancheAge;
	private JRadioButton rbAjoutCategorie;
	private JRadioButton rbAjoutJouet;
	private JRadioButton rbAjoutCatalogue;
	private JRadioButton rbListeJouetsCatalogue;
	private JButton btnValider;
	private JButton btnAnnuler;
	private ButtonGroup groupe;  
	private Vector<TrancheAge> lesTranches;

	
	public FenetreMenu( )
    {
			
			super(); // initialise les attributs d’une JDialog 
            this.lblTitre = new JLabel ("Société ERGOSUM ");
            this.lblStitre = new JLabel ("--------------------------");
            
            this.groupe=new ButtonGroup();
            this.rbAjoutTrancheAge=new JRadioButton("Ajouter une tranche d'âge",true);
            this.rbListeTrancheAge=new JRadioButton("Lister les tranches d'âge",false);
            this.rbAjoutCategorie=new JRadioButton("Ajouter une catégorie",false);
            this.rbAjoutJouet=new JRadioButton("Ajouter un jouet",false);  
            this.rbAjoutCatalogue=new JRadioButton("Ajouter un catalogue",false);  
            this.rbListeJouetsCatalogue=new JRadioButton("Nombre de jouets par catalogue",false);  
            
            this.btnValider=new JButton("Valider");
            this.btnValider.addActionListener (this);
            this.btnAnnuler=new JButton("Annuler");
            this.btnAnnuler.addActionListener (this);
            
            this.groupe.add(rbAjoutTrancheAge);
            this.groupe.add(rbListeTrancheAge);
            this.groupe.add(rbAjoutCategorie);
            this.groupe.add(rbAjoutJouet);
            this.groupe.add(rbAjoutCatalogue);
            this.groupe.add(rbListeJouetsCatalogue);

            this.contenu = this.getContentPane( );
            this.contenu.add (lblTitre );
            this.contenu.add (lblStitre );
            this.contenu.add(rbAjoutTrancheAge);
            this.contenu.add(rbListeTrancheAge);
            this.contenu.add(rbAjoutCategorie);
            this.contenu.add (rbAjoutJouet);
            this.contenu.add (rbAjoutCatalogue) ;
            this.contenu.add (rbListeJouetsCatalogue);
            this.contenu.add (btnValider);
            this.contenu.add (btnAnnuler);
            
            this.contenu.setLayout(null);
            
            this.lblTitre.setBounds( 110, 20 , 200, 20 );
            this.lblStitre.setBounds( 110, 25 , 200, 20 );
            this.rbAjoutTrancheAge.setBounds(30,50,200,20);
            this.rbListeTrancheAge.setBounds(30,70,200,20);
            this.rbAjoutCategorie.setBounds(30,90,200,20);
            this.rbAjoutJouet.setBounds(30,110,200,20);
            this.rbAjoutCatalogue.setBounds(30,130,200,20);
            this.rbListeJouetsCatalogue.setBounds(30,150,400,20);
            this.btnAnnuler.setBounds(30,190,100,20);
            this.btnValider.setBounds(210,190,100,20);
            
            this.lesTranches = MenuPrincipal.getLesTranches();
            

    }
	   public void actionPerformed(ActionEvent evt)
	     {
	         if (evt.getSource() == btnAnnuler )
	        	 System.exit(0); 
	         
	         if (evt.getSource() == btnValider )
	        	 if ( this.rbListeJouetsCatalogue.isSelected())
	        	 {
	        		FenetreChoixCatalogue fChoixCatalogue;
					fChoixCatalogue = new FenetreChoixCatalogue();
					fChoixCatalogue.setBounds(20,20,750,100);
					fChoixCatalogue.setTitle("Choix du catalogue");
					fChoixCatalogue.setModal(true);
					fChoixCatalogue.setLocation(100,100);
					fChoixCatalogue.setVisible(true);

	        	 }
		         if ( this.rbAjoutTrancheAge.isSelected())
	        	 {
	        		FenetreAjoutTrancheAge fAjoutTranche;
	        		fAjoutTranche = new FenetreAjoutTrancheAge(this.lesTranches);
	        		fAjoutTranche.setBounds(20,20,500,400);
	        		fAjoutTranche.setTitle("Ajout d'une tranche d'âge");
	        		fAjoutTranche.setModal(true);
	        		fAjoutTranche.setLocation(100,100);
	        		fAjoutTranche.setVisible(true);
	
	        	 }
		         
		         if ( this.rbListeTrancheAge.isSelected())
	        	 {
	        		FenetreListeTrancheAge fListeTranche;
	        		fListeTranche = new FenetreListeTrancheAge(this.lesTranches);
	        		fListeTranche.setBounds(20,20,500,400);
	        		fListeTranche.setTitle("Liste des tranches d'âge");
	        		fListeTranche.setModal(true);
	        		fListeTranche.setLocation(100,100);
	        		fListeTranche.setVisible(true);
	
	        	 }
	     }
	   
}
