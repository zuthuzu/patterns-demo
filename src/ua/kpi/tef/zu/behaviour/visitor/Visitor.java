package ua.kpi.tef.zu.behaviour.visitor;

/**
 * Created by Anton Domin on 2020-04-07
 */
public interface Visitor {
	void visit(Apartment place);
	void visit(House place);
	void visit(SleepingPod place);
}
