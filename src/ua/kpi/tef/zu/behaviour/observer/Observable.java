package ua.kpi.tef.zu.behaviour.observer;

/**
 * Created by Anton Domin on 2020-03-21
 */
public interface Observable {
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
