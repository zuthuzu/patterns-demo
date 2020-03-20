package ua.kpi.tef.zu.behaviour.observer;

/**
 * Created by Anton Domin on 2020-03-21
 */
public class ObserverDemo {
	public static void main(String[] args) {
		FireAlarm fireAlarm = new FireAlarm();
		fireAlarm.addObserver(new Subscriber("office"));
		fireAlarm.addObserver(new Subscriber("coffee shop"));
		fireAlarm.addObserver(new Subscriber("cafe"));
		fireAlarm.addObserver(new Subscriber("arcade"));

		fireAlarm.notifyObservers();
		fireAlarm.setOnFire();
	}
}
