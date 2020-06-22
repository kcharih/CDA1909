package dp.visitor.ecommerce;

public interface Produit {
	public int accept(PanierVisitor visitor);
}
