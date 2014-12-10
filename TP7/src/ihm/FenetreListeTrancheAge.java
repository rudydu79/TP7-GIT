package ihm;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import metier.TrancheAge;


public class FenetreListeTrancheAge extends JDialog implements ActionListener
{
	private Container contenu;
	private JLabel lblTitre;
	private JLabel lblTrancheAge;

	private JList lstTrancheAge;
	private JScrollPane jsTrancheAge;

	private JButton btnAnnuler;
	private Vector<TrancheAge> lesTranches;
	
	public FenetreListeTrancheAge(Vector<TrancheAge> lesTranches)
	{
		this.contenu=this.getContentPane();
		this.contenu.setLayout(null);

		this.lblTitre = new JLabel("<html><u>Liste des tranches d'âge</u></html>");
		this.lblTitre.setBounds(180, 20, 150, 20);

		this.lblTrancheAge = new JLabel("Tranches d'âge ");
		this.lblTrancheAge.setBounds(100, 100, 100, 20);
		
		this.lstTrancheAge = new JList(lesTranches);
		this.jsTrancheAge=new JScrollPane(lstTrancheAge);
		this.jsTrancheAge.setBounds(100, 160, 350, 100);
		
		this.btnAnnuler = new JButton("Annuler");
		this.btnAnnuler.setBounds(200, 300, 100, 20);
		this.btnAnnuler.addActionListener(this);
		
		
		this.contenu.add(this.lblTitre);
		this.contenu.add(this.lblTrancheAge);
		this.contenu.add(this.jsTrancheAge);
	
		this.contenu.add(this.btnAnnuler);

		
		this.lesTranches = lesTranches;
	}
	
	public void actionPerformed(ActionEvent evt) 
	{
		TrancheAge laTranche;
		int nb;
		
		if (evt.getSource() == this.btnAnnuler)
			this.dispose();

	}
}
