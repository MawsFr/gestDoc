package vue.utilisateur;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AjoutModifUtilFrame extends JFrame {
	
	private Container conteneur;
	private JPanel pnlBoutons;
	private JButton btnOk;
	private JButton btnAnnuler;
	private JButton btnAppliquer;
	
	public AjoutModifUtilFrame() {
		super("Ajouter/Modifier utilisateur");
		
		conteneur = getContentPane();
		conteneur.setLayout(new BorderLayout());
		
		pnlBoutons = new JPanel();
		pnlBoutons.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnOk = new JButton("OK");
		btnAnnuler = new JButton("Annuler");
		btnAppliquer = new JButton("Appliquer");
		
		pnlBoutons.add(btnOk);
		pnlBoutons.add(btnAnnuler);
		pnlBoutons.add(btnAppliquer);
		
		conteneur.add(pnlBoutons, BorderLayout.SOUTH);
		
		setMinimumSize(new Dimension(400, 600));
		setPreferredSize(getMinimumSize());
		setSize(getPreferredSize());
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AjoutModifUtilFrame();
	}
	
	

}
