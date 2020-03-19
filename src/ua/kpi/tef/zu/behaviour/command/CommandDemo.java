package ua.kpi.tef.zu.behaviour.command;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class CommandDemo {
	public static void main(String[] args) {
		Warehouse primary = new Warehouse();
		ResourcePickUp pickUpOrder;

		pickUpOrder = new CommandBricks(primary, 10);
		pickUpOrder.execute();

		pickUpOrder = new CommandCement(primary, 22);
		pickUpOrder.execute();
	}
}
