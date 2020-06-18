package dp.visitor.dessin;

public class Carre implements Figure {

	@Override
	public void accept(FigureVisitor figureVisitor) {
		figureVisitor.visit(this);
	}

}
