package dp.visitor.ecommerce;

public interface PanierVisitor {
	public int visit(Livre livre);

	public int visit(Fruit fruit);
}
