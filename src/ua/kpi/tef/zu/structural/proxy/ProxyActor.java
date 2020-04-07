package ua.kpi.tef.zu.structural.proxy;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class ProxyActor implements CoreActions {
	CoreActions actor;

	public ProxyActor(CoreActions actor) {
		this.actor = actor;
	}

	@Override
	public void doAction(String action) {
		if (action.length() <= 5) {
			actor.doAction(action);
		} else {
			System.out.println("Requested action is too long, sorry.");
		}
	}
}
