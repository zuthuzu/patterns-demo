package ua.kpi.tef.zu.creation.factorymethod;

/**
 * Created by Anton Domin on 2020-03-17
 */
class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("drawing: a rectangle");
	}
}

class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("drawing: a triangle");
	}
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("drawing: a circle");
	}
}
