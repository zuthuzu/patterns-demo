package ua.kpi.tef.zu.creation.factorymethod;

/**
 * Created by Anton Domin on 2020-03-17
 */
public class FactoryMethod {


	public static void main(String[] args) {
		Shape someShape;

		someShape = ShapeFactory.spawnShape("rectangle");
		someShape.draw();

		someShape = ShapeFactory.spawnShape("triangle");
		someShape.draw();

		someShape = ShapeFactory.spawnShape("circle");
		someShape.draw();

		someShape = ShapeFactory.spawnShape("STAR!");
		someShape.draw();
	}
}
