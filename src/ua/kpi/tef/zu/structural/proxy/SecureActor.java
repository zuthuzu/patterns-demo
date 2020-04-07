package ua.kpi.tef.zu.structural.proxy;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class SecureActor implements CoreActions {
	@Override
	public void doAction(String action) {
		System.out.println("Peforming action: " + action);
	}
}
