package ua.kpi.tef.zu.behaviour.delegate;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class DelegateDemo {
	public static void main(String[] args) {
		Military leutenant = new Leutenant(new Sergeant());
		leutenant.executeOrder("dig a trench");
	}
}
