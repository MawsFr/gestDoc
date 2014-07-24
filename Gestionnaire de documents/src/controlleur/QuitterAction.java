package controlleur;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class QuitterAction extends AbstractAction{
	
	public QuitterAction() {
		super("Quitter");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	

}
