package ua.kpi.tef.zu.behaviour.chain_of_responsibility;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class ChainDemo {
	public static void main(String[] args) {
		Squadmate p1 = new Squadmate("Chung", Specialties.MEDIC);
		Squadmate p2 = new Squadmate("Li", Specialties.EOT);
		Squadmate p3 = new Squadmate("Xen", Specialties.SNIPER);
		Squadmate p4 = new Squadmate("Lao", Specialties.RIFLEMAN);
		p1.setNextMate(p2);
		p2.setNextMate(p3);
		p3.setNextMate(p4);

		p1.processOrder("Clear the minefield", Specialties.EOT);
		p1.processOrder("Dispence the uppers", Specialties.MEDIC);
		p1.processOrder("Suppress the enemy", Specialties.RIFLEMAN);
		p1.processOrder("Take the HVT down", Specialties.SNIPER);
		p1.processOrder("Patch up the squad", Specialties.MEDIC);
	}
}
