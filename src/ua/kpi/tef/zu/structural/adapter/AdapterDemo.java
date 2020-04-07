package ua.kpi.tef.zu.structural.adapter;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class AdapterDemo {
	public static void main(String[] args) {
		Target face = new Adapter(new Performer());
		face.getStuff("stick");
	}
}
