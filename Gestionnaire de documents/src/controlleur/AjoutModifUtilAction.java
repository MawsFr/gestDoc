package controlleur;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import vue.utilisateur.AjoutModifUtilFrame;

public class AjoutModifUtilAction extends AbstractAction {
	
	public AjoutModifUtilAction() {
		super("Gérer les utilisateurs");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new AjoutModifUtilFrame();
	}

}
