package ua.kpi.tef.zu.structural.decorator;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class DecoratorDemo {
	public static void main(String[] args) {
		Heater heater = new Heater();
		HeaterDecorator fancyHeater;

		fancyHeater = new ComputerFarm(heater);
		fancyHeater.heatOn();
		fancyHeater.heatOff();

		fancyHeater = new Spotlight(heater);
		fancyHeater.heatOn();
		fancyHeater.heatOff();
	}
}
