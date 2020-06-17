import dp.singleton.Singleton;

public class SingletonApp {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Singleton sg = Singleton.getInstance();
			sg.operation("Op-" + i);
		}
	}
}
