package ihm;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import test.MenuPrincipal;

import metier.*;

public class FenetreChoixCatalogue extends JDialog implements ActionListener{
	
	private Container contenu ;
	private JButton btnValider;
	private JButton btnAnnuler;
	private JComboBox listeCatalogue;

	
	public FenetreChoixCatalogue( ) 
    {
            super(); // initialise les attributs d’une JDialog 
            this.btnValider=new JButton("Valider");
            this.btnValider.addActionListener (this);
            this.btnAnnuler=new JButton("Annuler");
            this.btnAnnuler.addActionListener (this);
            this.listeCatalogue=new JComboBox(MenuPrincipal.getLesCatalogues());
            
            this.contenu = this.getContentPane( ) ;

            this.contenu.add(btnValider);
            this.contenu.add(btnAnnuler);
            this.contenu.add(listeCatalogue);
            
            this.contenu.setLayout(null);
            
            this.btnAnnuler.setBounds(540,20,80,20);
            this.btnValider.setBounds(630,20,80,20);
            this.listeCatalogue.setBounds(20,20,500,20);
    }
            
	   public void actionPerformed(ActionEvent evt)
	     {
		   	         
		   if (evt.getSource() == btnAnnuler )
	        	 this.dispose();
		   
	        if (evt.getSource() == btnValider )
	        {
	        	Catalogue c = (Catalogue)this.listeCatalogue.getSelectedItem();
	        	JOptionPane.showMessageDialog(this, "Pour le catalogue "+c.toString()+", il existe "+c.quantiteProposee()+ " exemplaires de jouets proposés");
	        }
	     }
}
