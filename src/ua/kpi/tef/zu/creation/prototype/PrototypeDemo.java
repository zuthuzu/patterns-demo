package ua.kpi.tef.zu.creation.prototype;

/**
 * Created by Anton Domin on 2020-03-18
 */
public class PrototypeDemo {
	public static void main(String[] args) {
		Relic relic = new Relic("holy flame");
		Church church = new Church(relic);
		System.out.println(church.getRelic());
	}
}
