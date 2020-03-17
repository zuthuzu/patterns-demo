package ua.kpi.tef.zu.creation.factorymethod;

/**
 * Created by Anton Domin on 2020-03-17
 */
public class FactoryMethod {


	public static void main(String[] args) {
		Shape someShape;

		someShape = Shaper.spawnShape("rectangle");
		someShape.draw();

		someShape = Shaper.spawnShape("triangle");
		someShape.draw();

		someShape = Shaper.spawnShape("circle");
		someShape.draw();

		someShape = Shaper.spawnShape("STAR!");
		someShape.draw();
	}
}
