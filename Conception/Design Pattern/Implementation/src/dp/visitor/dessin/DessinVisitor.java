package dp.visitor.dessin;

public class DessinVisitor implements FigureVisitor {

	@Override
	public void visit(Carre carre) {
		System.out.println("Je dessine un carré");

	}

	@Override
	public void visit(Triangle triangle) {
		System.out.println("Je dessine un triangle");
	}

}
