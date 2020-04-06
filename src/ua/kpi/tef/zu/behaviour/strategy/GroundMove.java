package ua.kpi.tef.zu.behaviour.strategy;

/**
 * Created by Anton Domin on 2020-04-06
 */
public class GroundMove implements Move {
	@Override
	public void move(Payload load, String where) {
		load.setLocation(where + ", got there by land.");
	}
}
