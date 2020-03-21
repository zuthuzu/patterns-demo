package ua.kpi.tef.zu.behaviour.state;

/**
 * Created by Anton Domin on 2020-03-21
 */
public class StateDemo {
	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();

		for (int i = 0; i < 20; i++) {
			light.processState();
			light.switchLight();
		}
	}
}
