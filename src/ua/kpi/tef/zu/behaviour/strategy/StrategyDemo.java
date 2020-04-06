package ua.kpi.tef.zu.behaviour.strategy;

/**
 * Created by Anton Domin on 2020-04-06
 */
public class StrategyDemo {
	public static void main(String[] args) {
		Payload load = new Payload("nexus");
		System.out.println(load);

		Move strategy = new WaterMove();
		strategy.move(load, "freight terminal");
		System.out.println(load);

		strategy = new GroundMove();
		strategy.move(load, "factory");
		System.out.println(load);
	}
}
