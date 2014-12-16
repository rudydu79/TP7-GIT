package ihm;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import metier.TrancheAge;


public class FenetreAjoutTrancheAge extends JDialog implements ActionListener
{
	private Container contenu;
	private JLabel lblTitre;
	private JLabel lblCode;
	private JLabel lblAgeMin;
	private JLabel lblAgeMax;
	private JTextField txtCode;
	private JTextField txtAgeMin;
	private JTextField txtAgeMax;
	private JButton btnAnnuler;
	private JButton btnValider;
	private Vector<TrancheAge> lesTranches;
	
	public FenetreAjoutTrancheAge(Vector<TrancheAge> lesTranches)
	{
		this.contenu=this.getContentPane();
		this.contenu.setLayout(null);

		this.lblTitre = new JLabel("<html><u>Ajout d'une tranche d'âge</u></html>");
		this.lblTitre.setBounds(180, 20, 150, 20);

		this.lblCode = new JLabel("Code : ");
		this.lblCode.setBounds(100, 100, 50, 20);
		
		this.txtCode = new JTextField();
		this.txtCode.setBounds(200, 100, 50, 20);
		
		this.lblAgeMin = new JLabel("Age minimum : ");
		this.lblAgeMin.setBounds(100, 120, 100, 20);
		
		this.txtAgeMin = new JTextField();
		this.txtAgeMin.setBounds(200, 120, 50, 20);	
		
		this.lblAgeMax = new JLabel("Age maximum : ");
		this.lblAgeMax.setBounds(100, 140, 100, 20);
		
		this.txtAgeMax = new JTextField();
		this.txtAgeMax.setBounds(200, 140, 50, 20);	
		
		this.btnAnnuler = new JButton("Annuler");
		this.btnAnnuler.setBounds(100, 200, 100, 20);
		this.btnAnnuler.addActionListener(this);
		
		this.btnValider = new JButton("Valider");
		this.btnValider.setBounds(300, 200, 100, 20);
		this.btnValider.addActionListener(this);
		
		this.contenu.add(this.lblTitre);
		this.contenu.add(this.lblCode);
		this.contenu.add(this.txtCode);
		this.contenu.add(this.lblAgeMin);
		this.contenu.add(this.txtAgeMin);
		this.contenu.add(this.lblAgeMax);
		this.contenu.add(this.txtAgeMax);
		this.contenu.add(this.btnAnnuler);
		this.contenu.add(this.btnValider);
		
		this.lesTranches = lesTranches;
	}
	
	public void actionPerformed(ActionEvent evt) 
	{
		TrancheAge laTranche;
		int nb;
		
		if (evt.getSource() == this.btnAnnuler)
			this.dispose();
		else
			if (evt.getSource() == this.btnValider)
			{
				if (this.txtCode.getText().isEmpty() || this.txtAgeMin.getText().isEmpty() || this.txtAgeMax.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires !");
				else
				{
					laTranche= new TrancheAge (this.txtCode.getText(),Integer.parseInt(this.txtAgeMin.getText()),Integer.parseInt(this.txtAgeMax.getText()));
					JOptionPane.showMessageDialog(null, "Tranche d'âge ajoutée.");
					this.lesTranches.add(laTranche);
				}
			}	
	}
}
