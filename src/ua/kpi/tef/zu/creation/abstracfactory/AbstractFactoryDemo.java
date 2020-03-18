package ua.kpi.tef.zu.creation.abstracfactory;

/**
 * Created by Anton Domin on 2020-03-17
 */
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		Shaper factory;
		Shape flatShape;
		Shape3D volShape;

		factory = getFactory(4);
		flatShape = factory.getShape();
		volShape = factory.getShape3D();
		flatShape.draw();
		volShape.draw3D();

		factory = getFactory(3);
		flatShape = factory.getShape();
		volShape = factory.getShape3D();
		flatShape.draw();
		volShape.draw3D();

		factory = getFactory(0);
		flatShape = factory.getShape();
		volShape = factory.getShape3D();
		flatShape.draw();
		volShape.draw3D();

		factory = getFactory(1);
		flatShape = factory.getShape();
		volShape = factory.getShape3D();
		flatShape.draw();
		volShape.draw3D();
	}

	private static Shaper getFactory(int points) {
		switch (points) {
			case 4:
				return new FourPointsFactory();
			case 3:
				return new ThreePointsFactory();
			case 0:
				return new ZeroPointsFactory();
			default:
				throw new RuntimeException("unsupported number of points on side projection: " + points);
		}
	}
}
