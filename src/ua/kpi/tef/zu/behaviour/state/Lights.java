package ua.kpi.tef.zu.behaviour.state;

/**
 * Created by Anton Domin on 2020-03-21
 */
class GreenLight implements TrafficState {

	@Override
	public void processState() {
		System.out.println("Green light: traffic flow permitted.");
	}

	@Override
	public TrafficState nextState() {
		return new YellowLight(this);
	}
}

class YellowLight implements TrafficState {
	TrafficState previousState;

	public YellowLight(TrafficState previousState) {
		this.previousState = previousState;
	}

	@Override
	public void processState() {
		System.out.println("Yellow light: prepare for the mode switch.");
	}

	@Override
	public TrafficState nextState() {
		if (previousState instanceof GreenLight) {
			return new RedLight();
		} else if (previousState instanceof RedLight) {
			return new GreenLight();
		} else {
			return new YellowLight(this); //implied blinking, i.e. out of order
		}
	}
}

class RedLight implements TrafficState {

	@Override
	public void processState() {
		System.out.println("Red light: traffic flow denied.");
	}

	@Override
	public TrafficState nextState() {
		return new YellowLight(this);
	}
}
