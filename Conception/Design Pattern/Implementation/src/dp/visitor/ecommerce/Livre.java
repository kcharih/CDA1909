package dp.visitor.ecommerce;

public class Livre implements Produit {
	private String titre;
	private int prix;

	/**
	 * @param titre
	 * @param prix
	 */
	public Livre(String titre, int prix) {
		this.titre = titre;
		this.prix = prix;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public int accept(PanierVisitor visitor) {
		return visitor.visit(this);
	}

}
