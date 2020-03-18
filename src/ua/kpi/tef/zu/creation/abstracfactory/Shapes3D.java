package ua.kpi.tef.zu.creation.abstracfactory;

/**
 * Created by Anton Domin on 2020-03-18
 */
class Cylinder implements Shape3D {
	@Override
	public void draw3D() {
		System.out.println("drawing IN THREEDEE: a cylinder");
	}
}

class Cone implements Shape3D {
	@Override
	public void draw3D() {
		System.out.println("drawing IN THREEDEE: a cone");
	}
}

class Sphere implements Shape3D {
	@Override
	public void draw3D() {
		System.out.println("drawing IN THREEDEE: a sphere");
	}
}
