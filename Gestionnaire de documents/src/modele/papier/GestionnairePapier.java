package modele.papier;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class GestionnairePapier extends Observable {
	
	protected List<PapierModele> listePapiers;
	
	public GestionnairePapier() {
		this.listePapiers = new ArrayList<>();
	}
	
	public void ajouter(PapierModele papier) {
		this.listePapiers.add(papier);
		notifier();
	}
	
	public void supprimer(PapierModele papier) {
		this.listePapiers.remove(papier);
		notifier();
	}
	
	public int getNbPapiers() {
		return this.listePapiers.size();
	}
	
	public PapierModele getPapierAt(int index) {
		return this.listePapiers.get(index);
	}
	
	private void notifier() {
		notifier(null);
	}
	
	private void notifier(Object o) {
		setChanged();
		notifyObservers(o);
	}

}
