package dp.visitor.dessin;

public class AffichageVisitor implements FigureVisitor {

	@Override
	public void visit(Carre carre) {
		System.out.println("Je suis le carré");

	}

	@Override
	public void visit(Triangle triangle) {
		System.out.println("Je suis le triangle");
	}

}
