package ua.kpi.tef.zu.behaviour.delegate;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Leutenant implements Military {
	Military underling;
	public Leutenant(Military underling) {
		this.underling = underling;
	}

	@Override
	public void executeOrder(String order) {
		System.out.println("{Leutenant} Sergeant, please execute: " + order);
		underling.executeOrder(order);
	}
}
