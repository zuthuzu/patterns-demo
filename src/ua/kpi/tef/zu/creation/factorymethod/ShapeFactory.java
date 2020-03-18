package ua.kpi.tef.zu.creation.factorymethod;

/**
 * Created by Anton Domin on 2020-03-17
 */
public class ShapeFactory {
	public static Shape spawnShape(String shapeType) {
		String shapeTypeLC = shapeType.toLowerCase();
		switch (shapeTypeLC) {
			case "rectangle":
				return new Rectangle();
			case "triangle":
				return new Triangle();
			case "circle":
				return new Circle();
			default:
				throw new RuntimeException("unsupported shape type: " + shapeTypeLC);
		}
	}
}
