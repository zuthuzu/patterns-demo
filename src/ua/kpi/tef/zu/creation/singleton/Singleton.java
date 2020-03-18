package ua.kpi.tef.zu.creation.singleton;

/**
 * Created by Anton Domin on 2020-03-18
 */
public class Singleton {
	private static volatile Singleton instance = null; //new Singleton();
	private static int counter = 0;

	private Singleton() {
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
