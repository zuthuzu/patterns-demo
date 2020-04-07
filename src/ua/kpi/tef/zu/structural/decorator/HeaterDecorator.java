package ua.kpi.tef.zu.structural.decorator;

/**
 * Created by Anton Domin on 2020-04-07
 */
public abstract class HeaterDecorator implements Heat {
	private Heater core;
	public HeaterDecorator(Heater core) {
		this.core = core;
	}

	@Override
	public void heatOn() {
		core.heatOn();
	}
	@Override
	public void heatOff() {
		core.heatOff();
	}
}
