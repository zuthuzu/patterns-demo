package ua.kpi.tef.zu.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Domin on 2020-03-21
 */
public class FireAlarm implements Observable {
	boolean onFire = false;
	List<Observer> subscribers = new ArrayList<>();

	public void setOnFire() {
		this.onFire = true;
		notifyObservers();
	}

	@Override
	public void addObserver(Observer o) {
		if (!subscribers.contains(o)) {
			subscribers.add(o);
		}
	}

	@Override
	public void removeObserver(Observer o) {
		subscribers.remove(o);
	}

	@Override
	public void notifyObservers() {
		subscribers.forEach(s -> s.update(this, onFire ? "FIRE!" : "all is well"));
	}
}
