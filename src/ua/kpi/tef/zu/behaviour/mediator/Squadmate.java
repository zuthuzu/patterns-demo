package ua.kpi.tef.zu.behaviour.mediator;

import ua.kpi.tef.zu.behaviour.chain_of_responsibility.Specialties;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Domin on 2020-03-19
 */
class Squadmate {
	private String name;

	public Squadmate(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void processOrder(String order) {
		System.out.println("Comrade " + name + " executing: " + order);
	}
}
