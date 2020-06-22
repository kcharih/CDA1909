package dp.visitor.ecommerce;

public class Fruit implements Produit {
	private String nom;
	private int poids;
	private int prixAuKilo;

	/**
	 * @param nom
	 * @param poids
	 * @param poidsAuKilo
	 */
	public Fruit(String name, int poids, int prixAuKilo) {
		this.nom = name;
		this.poids = poids;
		this.prixAuKilo = prixAuKilo;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String name) {
		this.nom = name;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	/**
	 * @return the prixAuKilo
	 */
	public int getPrixAuKilo() {
		return prixAuKilo;
	}

	/**
	 * @param prixAuKilo the prixAuKilo to set
	 */
	public void setPrixAuKilo(int prixAuKilo) {
		this.prixAuKilo = prixAuKilo;
	}

	@Override
	public int accept(PanierVisitor visitor) {
		return visitor.visit(this);
	}

}
