package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controlleur.QuitterAction;

public class BarreMenu extends JMenuBar {
	
	private JMenu menuFichier;
	private JMenuItem menuQuitter;
	
	public BarreMenu() {
		this.menuFichier = new JMenu("Fichier");
		this.menuQuitter = new JMenuItem(new QuitterAction());
		
		this.menuFichier.add(menuQuitter);
		this.add(menuFichier);
		
	}

}
