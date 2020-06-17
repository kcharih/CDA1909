package dp.singleton;

public class Singleton {
	private static final Singleton INSTANCE;

	private int compteur;

	static {
		INSTANCE = new Singleton();
	}

	private Singleton() {
		System.out.println("Instanciation du singleton");
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void operation(String name) {
		System.out.println("Lancement de l'opération : " + name);
		for (int i = 0; i < 5; i++) {
			++compteur;
		}
		System.out.println("Fin de l'opération : compteur = " + compteur);
	}

	/**
	 * @return the compteur
	 */
	public int getCompteur() {
		return compteur;
	}

	/**
	 * @param compteur the compteur to set
	 */
	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}

}
