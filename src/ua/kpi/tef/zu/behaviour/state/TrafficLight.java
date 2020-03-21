package ua.kpi.tef.zu.behaviour.state;

/**
 * Created by Anton Domin on 2020-03-21
 */
public class TrafficLight {
	TrafficState state;

	public TrafficLight() {
		this.state = new GreenLight();
	}

	public void switchLight() {
		this.state = state.nextState();
	}

	public void processState() {
		state.processState();
	}
}
