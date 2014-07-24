package vue;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import controlleur.AjoutModifUtilAction;
import controlleur.QuitterAction;

public class MainFrame extends JFrame {

	private Container conteneur;
	private BarreMenu menuBar;
	private BarreStatut statutBar;
	
	private JPanel pnlCentre;
	
	private JButton btnCreerListe;
	private JButton btnGestPapiers;
	private JButton btnGestUtilisateur;
	private JButton btnQuitter;
	
	public MainFrame() {
		super("Gestionnaire de documents");
		
		conteneur = getContentPane();
		conteneur.setLayout(new BorderLayout());
		
		//Barre de menu
		menuBar = new BarreMenu();
		this.setJMenuBar(menuBar);
		
		pnlCentre = new JPanel();
		pnlCentre.setLayout(new GridLayout(2,2));
		btnCreerListe = new JButton("Créer liste à imprimer");
		btnGestPapiers = new JButton("Gérer les papiers");
		btnGestUtilisateur = new JButton(new AjoutModifUtilAction());
		btnQuitter = new JButton(new QuitterAction());
		
		pnlCentre.add(btnCreerListe);
		pnlCentre.add(btnGestUtilisateur);
		pnlCentre.add(btnGestPapiers);
		pnlCentre.add(btnQuitter);
		
		conteneur.add(pnlCentre, BorderLayout.CENTER);
		
		//Barre de statut
		statutBar = new BarreStatut();
		this.conteneur.add(statutBar, BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(640, 480));
		setPreferredSize(getMinimumSize());
		setSize(getPreferredSize());
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {}
		new MainFrame();
		
	}

}
