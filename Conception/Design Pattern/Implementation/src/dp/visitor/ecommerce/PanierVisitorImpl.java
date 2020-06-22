package dp.visitor.ecommerce;

public class PanierVisitorImpl implements PanierVisitor {

	@Override
	public int visit(Livre livre) {
		int cout = 0;
		if (livre.getPrix() > 30) {
			cout = livre.getPrix() - 5;
		} else {
			cout = livre.getPrix();
		}
		System.out.println("Livre : " + livre.getTitre() + " prix = " + cout);
		return cout;
	}

	@Override
	public int visit(Fruit fruit) {
		int cout = fruit.getPrixAuKilo() * fruit.getPoids();
		System.out.println("Fruit : " + fruit.getNom() + " prix = " + cout);
		return cout;
	}
}
