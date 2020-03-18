package ua.kpi.tef.zu.creation.abstracfactory;

/**
 * Created by Anton Domin on 2020-03-17
 */
interface Shape {
	void draw();
}

interface Shape3D {
	void draw3D();
}

interface Shaper {
	Shape getShape();
	Shape3D getShape3D();
}