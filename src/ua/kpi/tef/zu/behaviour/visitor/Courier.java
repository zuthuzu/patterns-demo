package ua.kpi.tef.zu.behaviour.visitor;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Courier implements Visitor {
	@Override
	public void visit(Apartment place) {
		place.setFridge(80);
	}

	@Override
	public void visit(House place) {
		place.setCellar(place.getCellar() + 20);
	}

	@Override
	public void visit(SleepingPod place) {
		place.setSoylentTank(100);
	}
}
