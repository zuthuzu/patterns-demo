package ua.kpi.tef.zu.behaviour.command;

/**
 * Created by Anton Domin on 2020-03-19
 */
class CommandBricks extends ResourcePickUp {
	public CommandBricks(Warehouse warehouse, int amount) {
		super(warehouse, amount);
	}

	@Override
	public void execute() {
		warehouse.getBricks(amount);
	}
}

class CommandCement extends ResourcePickUp {
	public CommandCement(Warehouse warehouse, int amount) {
		super(warehouse, amount);
	}

	@Override
	public void execute() {
		warehouse.getCement(amount);
	}
}