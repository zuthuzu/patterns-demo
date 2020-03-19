package ua.kpi.tef.zu.behaviour.command;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class Warehouse {
	public void getBricks(int pallets) {
		System.out.println("Brick pallets prepared for pick up: " + pallets);
	}

	public void getCement(int bags) {
		System.out.println("Cement bags prepared for pick up: " + bags);
	}
}
