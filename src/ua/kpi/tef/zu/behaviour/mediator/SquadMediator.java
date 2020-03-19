package ua.kpi.tef.zu.behaviour.mediator;

/**
 * Created by Anton Domin on 2020-03-19
 */
public interface SquadMediator {
	void addSquadMember(Squadmate person);
	void removeSquadMember(Squadmate person);
	void dig();
	void eat();
	void rest();
}
