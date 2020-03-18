package ua.kpi.tef.zu.creation.abstracfactory;

/**
 * Created by Anton Domin on 2020-03-17
 */

class FourPointsFactory implements Shaper {

	@Override
	public Shape getShape() {
		return new Rectangle();
	}

	@Override
	public Shape3D getShape3D() {
		return new Cylinder();
	}
}

class ThreePointsFactory implements Shaper {

	@Override
	public Shape getShape() {
		return new Triangle();
	}

	@Override
	public Shape3D getShape3D() {
		return new Cone();
	}
}

class ZeroPointsFactory implements Shaper {

	@Override
	public Shape getShape() {
		return new Circle();
	}

	@Override
	public Shape3D getShape3D() {
		return new Sphere();
	}
}