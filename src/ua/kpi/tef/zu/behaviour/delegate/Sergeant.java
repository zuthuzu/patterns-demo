package ua.kpi.tef.zu.behaviour.delegate;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Sergeant implements Military {
	@Override
	public void executeOrder(String order) {
		System.out.println("{Sergeant} Received order: " + order);
		System.out.println("{Sergeant} Order executed successfully.");
	}
}
