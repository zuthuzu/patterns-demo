package ua.kpi.tef.zu.structural.composite;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void execute() {
		System.out.println("Standalone unit " + name + " has acknowledged the order.");
	}
}
