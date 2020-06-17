package dp.composite;

public abstract class Composant {
	protected String nom;
	protected int niveau;

	/**
	 * @param nom
	 */
	public Composant(String nom) {
		this.nom = nom;
	}

	public abstract void operation();

}
