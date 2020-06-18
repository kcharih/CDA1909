package dp.visitor.dessin;

public class Triangle implements Figure {

	@Override
	public void accept(FigureVisitor figureVisitor) {
		figureVisitor.visit(this);
	}
}
