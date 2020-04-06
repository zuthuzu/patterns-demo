package ua.kpi.tef.zu.behaviour.visitor;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class VisitorDemo {
	private static Visitor cleaner = new Cleaner();
	private static Visitor courier = new Courier();

	public static void main(String[] args) {
		Place place;

		place = new Apartment();
		doWork(place);

		place = new House();
		doWork(place);

		place = new SleepingPod();
		doWork(place);

	}

	private static void doWork(Place place) {
		System.out.println(place);
		place.accept(cleaner);
		place.accept(courier);
		System.out.println(place);
	}
}
