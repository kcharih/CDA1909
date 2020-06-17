package dp.composite;

public class Element extends Composant {

	public Element(String nom) {
		super(nom);
	}

	@Override
	public void operation() {
		StringBuffer tab = new StringBuffer();
		for (int i = 0; i < niveau; i++) {
			tab.append("--");
		}
		System.out.println(tab + " Elément : " + nom);
	}

}
