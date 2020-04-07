package ua.kpi.tef.zu.structural.decorator;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Heater implements Heat {
	@Override
	public void heatOn() {
		System.out.println("Temperature is rising.");
	}

	@Override
	public void heatOff() {
		System.out.println("Temperature is dropping.");
	}
}
