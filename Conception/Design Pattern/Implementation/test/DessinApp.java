import dp.visitor.dessin.AffichageVisitor;
import dp.visitor.dessin.Carre;
import dp.visitor.dessin.Dessin;
import dp.visitor.dessin.DessinVisitor;
import dp.visitor.dessin.Triangle;

public class DessinApp {

	public static void main(String[] args) {
		Carre carre = new Carre();
		Triangle triangle = new Triangle();
		Dessin monDessin = new Dessin(carre, triangle);

		AffichageVisitor av = new AffichageVisitor();
		DessinVisitor dv = new DessinVisitor();

		monDessin.getTriangle().accept(av);
		monDessin.getCarre().accept(dv);
	}

}
