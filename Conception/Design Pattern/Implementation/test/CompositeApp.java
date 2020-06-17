import dp.composite.Composite;
import dp.composite.Element;

public class CompositeApp {

	public static void main(String[] args) {
		Composite composite1 = new Composite("C1");
		Composite composite2 = new Composite("C2");
		composite1.addComposant(composite2);
		composite1.addComposant(new Element("E11"));
		composite1.addComposant(new Element("E12"));
		composite2.addComposant(new Element("E22"));

		composite1.operation();
	}

}
