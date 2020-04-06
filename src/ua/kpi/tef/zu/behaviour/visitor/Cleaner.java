package ua.kpi.tef.zu.behaviour.visitor;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Cleaner implements Visitor {
	@Override
	public void visit(Apartment place) {
		place.setPurity("Spotless");
	}

	@Override
	public void visit(House place) {
		place.setLawn("Tidy");
	}

	@Override
	public void visit(SleepingPod place) {
		place.setPurity("Decontaminated");
	}
}
