package ua.kpi.tef.zu.behaviour.observer;

/**
 * Created by Anton Domin on 2020-03-21
 */
public class Subscriber implements Observer {
	String name;

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, String event) {
		if (event.equals("FIRE!")) {
			System.out.println(name + ": acknowledged fire, started panicking.");
		} else {
			System.out.println(name + ": nothing's happening.");
		}
	}
}
