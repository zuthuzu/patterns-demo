package ua.kpi.tef.zu.behaviour.command;

/**
 * Created by Anton Domin on 2020-03-19
 */
abstract class ResourcePickUp {
	Warehouse warehouse;
	int amount;

	public ResourcePickUp(Warehouse warehouse, int amount) {
		this.warehouse = warehouse;
		this.amount = amount;
	}

	abstract void execute();
}
