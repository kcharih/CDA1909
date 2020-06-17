package dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant {

	private List<Composant> composants = new ArrayList<Composant>();

	public Composite(String nom) {
		super(nom);
	}

	@Override
	public void operation() {
		StringBuffer tab = new StringBuffer();
		for (int i = 0; i < niveau; i++) {
			tab.append("--");
		}
		System.out.println(tab + " Composite : " + nom);
		for (Composant c : composants) {
			c.operation();
		}
	}

	public void addComposant(Composant c) {
		c.niveau = this.niveau + 1;
		composants.add(c);
	}

	public void removeComposant(Composant c) {
		composants.remove(c);
	}

	public List<Composant> getChilds() {
		return composants;
	}

}
