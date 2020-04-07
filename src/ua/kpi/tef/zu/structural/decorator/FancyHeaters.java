package ua.kpi.tef.zu.structural.decorator;

/**
 * Created by Anton Domin on 2020-04-07
 */
class ComputerFarm extends HeaterDecorator {
	public ComputerFarm(Heater core) {
		super(core);
	}

	@Override
	public void heatOn() {
		System.out.println("Bitcoins are farming now.");
		super.heatOn();
	}

	@Override
	public void heatOff() {
		System.out.println("Bitcoins are no longer farming.");
		super.heatOff();
	}
}

class Spotlight extends HeaterDecorator {
	public Spotlight(Heater core) {
		super(core);
	}

	@Override
	public void heatOn() {
		System.out.println("Bright light floods the area.");
		super.heatOn();
	}

	@Override
	public void heatOff() {
		System.out.println("Area is dark.");
		super.heatOff();
	}
}
