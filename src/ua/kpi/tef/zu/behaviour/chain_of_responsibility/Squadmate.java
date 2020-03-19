package ua.kpi.tef.zu.behaviour.chain_of_responsibility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Domin on 2020-03-19
 */
class Squadmate {
	private String name;
	private Set<Specialties> specSet = new HashSet<>();
	private Squadmate nextMate;

	public Squadmate(String name, Specialties specialty) {
		this.name = name;
		this.specSet.add(specialty);
	}

	public void addSpecialty(Specialties mos) {
		specSet.add(mos);
	}

	public void setNextMate(Squadmate nextMate) {
		this.nextMate = nextMate;
	}

	public String getName() {
		return name;
	}

	public void processOrder(String order, Specialties toWhom) {
		if (specSet.contains(toWhom)) {
			System.out.println("Comrade " + name + " executing: " + order);
		} else {
			nextMate.processOrder(order, toWhom);
		}
	}
}
