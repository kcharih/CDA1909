package dp.visitor.dessin;

public interface Figure {
	public void accept(FigureVisitor figureVisitor);
}
