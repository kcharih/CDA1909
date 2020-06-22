import dp.visitor.ecommerce.Fruit;
import dp.visitor.ecommerce.Livre;
import dp.visitor.ecommerce.PanierVisitor;
import dp.visitor.ecommerce.PanierVisitorImpl;
import dp.visitor.ecommerce.Produit;

public class EcommerceApp {

	public static void main(String[] args) {
		Produit[] maListe = { new Livre("Les misérables", 35), new Livre("Les fables de La Fontaine", 15),
				new Fruit("Pomme", 2, 2), new Fruit("Banane", 1, 3) };

		PanierVisitor pv = new PanierVisitorImpl();
		int total = 0;
		for (Produit p : maListe) {
			total = total + p.accept(pv);
		}

		System.out.println("Total : " + total);
	}
}
