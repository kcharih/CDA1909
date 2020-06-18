package dp.visitor.dessin;

public interface FigureVisitor {
	public void visit(Carre carre);

	public void visit(Triangle triangle);
}
