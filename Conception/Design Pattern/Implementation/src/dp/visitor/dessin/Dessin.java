package dp.visitor.dessin;

public class Dessin {
	private Carre carre;

	private Triangle triangle;

	/**
	 * @param carre
	 * @param triangle
	 */
	public Dessin(Carre carre, Triangle triangle) {
		super();
		this.carre = carre;
		this.triangle = triangle;
	}

	/**
	 * @return the carre
	 */
	public Carre getCarre() {
		return carre;
	}

	/**
	 * @param carre the carre to set
	 */
	public void setCarre(Carre carre) {
		this.carre = carre;
	}

	/**
	 * @return the triangle
	 */
	public Triangle getTriangle() {
		return triangle;
	}

	/**
	 * @param triangle the triangle to set
	 */
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
