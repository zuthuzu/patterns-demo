package ua.kpi.tef.zu.structural.composite;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Composite implements Component {
	private String name;
	private Set<Component> children = new HashSet<>();

	public Composite(String name) {
		this.name = name;
	}

	@Override
	public void execute() {
		System.out.println("Composite unit " + name + " has acknowledged the order, and passed it along.");
		children.forEach(Component::execute);
	}

	public void addChild(Component child) {
		children.add(child);
	}
	public void removeChild(Component child) {
		children.remove(child);
	}
}
