package ua.kpi.tef.zu.behaviour.mediator;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class MediatorDemo {
	public static void main(String[] args) {
		SquadMediator nco = new Sergeant();
		nco.addSquadMember(new Squadmate("Chung"));
		nco.addSquadMember(new Squadmate("Li"));
		nco.addSquadMember(new Squadmate("Xen"));
		nco.addSquadMember(new Squadmate("Lao"));
		nco.addSquadMember(new Squadmate("Zheng"));
		nco.dig();
		nco.eat();
		nco.rest();
	}
}
