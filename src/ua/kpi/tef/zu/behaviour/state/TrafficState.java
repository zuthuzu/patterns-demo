package ua.kpi.tef.zu.behaviour.state;

/**
 * Created by Anton Domin on 2020-03-21
 */
public interface TrafficState {
	void processState();
	TrafficState nextState();
}
