package ua.kpi.tef.zu.behaviour.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class Sergeant implements SquadMediator {
	Set<Squadmate> squad = new HashSet<>();

	@Override
	public void addSquadMember(Squadmate person) {
		squad.add(person);
	}

	@Override
	public void removeSquadMember(Squadmate person) {
		squad.remove(person);
	}

	@Override
	public void dig() {
		squad.forEach(i -> i.processOrder("digging"));
	}

	@Override
	public void eat() {
		squad.forEach(i -> i.processOrder("eating"));
	}

	@Override
	public void rest() {
		squad.forEach(i -> i.processOrder("resting"));
	}
}
