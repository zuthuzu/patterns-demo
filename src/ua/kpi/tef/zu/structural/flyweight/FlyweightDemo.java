package ua.kpi.tef.zu.structural.flyweight;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class FlyweightDemo {
	private final static int TOTAL_AMOUNT = 5000;

	public static void main(String[] args) {
		List<Flyweight> objects = new LinkedList<>();

		for (int i = 0; i < TOTAL_AMOUNT; i++) {
			objects.add(FlyweightFactory.getClassFromFactory(CarrierSources.LOREM));
		}
		System.out.println("Sample lorem flyweight: " + objects.get(objects.size()-1).getData());

		for (int i = 0; i < TOTAL_AMOUNT; i++) {
			objects.add(FlyweightFactory.getClassFromFactory(CarrierSources.JABBERWOCKY));
		}
		System.out.println("Sample jabberwocky flyweight: " + objects.get(objects.size()-1).getData());

		System.out.println("Total amount of flyweight objects: " + objects.size());
		System.out.println("Total amount of data carrier objects: " + FlyweightFactory.getCarrierSize());
	}
}
