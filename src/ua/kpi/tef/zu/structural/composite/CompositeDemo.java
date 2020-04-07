package ua.kpi.tef.zu.structural.composite;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class CompositeDemo {
	public static void main(String[] args) {
		Composite headNode = new Composite("Head");
		Composite secondTierNode;

		secondTierNode = new Composite("Second tier #1");
		headNode.addChild(secondTierNode);
		secondTierNode.addChild(new Composite("Third tier #1"));
		secondTierNode.addChild(new Leaf("Leaf #1"));

		secondTierNode = new Composite("Second tier #2");
		headNode.addChild(secondTierNode);
		secondTierNode.addChild(new Composite("Third tier #2"));

		secondTierNode = new Composite("Second tier #3");
		headNode.addChild(secondTierNode);
		secondTierNode.addChild(new Leaf("Leaf #2"));
		secondTierNode.addChild(new Leaf("Leaf #3"));

		headNode.execute();
	}
}
