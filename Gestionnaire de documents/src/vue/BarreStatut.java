package vue;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class BarreStatut extends JPanel{

	private JLabel statut;
	
	public BarreStatut() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.statut = new JLabel("Bienvenue !");
		this.add(statut);
	}
	
	public void afficher(String message) {
		this.statut.setText(message);
	}
	
	public void effacer() {
		this.statut.setText("");
	}
	
}
