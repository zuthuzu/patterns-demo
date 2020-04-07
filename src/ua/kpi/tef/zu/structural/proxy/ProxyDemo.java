package ua.kpi.tef.zu.structural.proxy;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class ProxyDemo {
	public static void main(String[] args) {
		CoreActions proxy = new ProxyActor(new SecureActor());
		proxy.doAction("run");
		proxy.doAction("run some more");
	}
}
