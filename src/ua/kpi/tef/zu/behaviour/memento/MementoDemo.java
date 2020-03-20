package ua.kpi.tef.zu.behaviour.memento;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class MementoDemo {
	public static void main(String[] args) {
		Face face = new Face();
		System.out.println("Just woke up: " + face);

		face.setEyes("bright");
		face.setMakeup("smokey");
		System.out.println("Got dressed up: " + face);

		MagicMirror mirror = new MagicMirror();
		mirror.setReflection(face.createMemento());

		relax(face);
		System.out.println("After party: " + face);

		face.setMemento(mirror.getReflection());
		System.out.println("It's magic time: " + face);
	}

	private static void relax(Face face) {
		face.setEyes("drunk");
		face.setSkin("flushed");
		face.setMakeup("panda");
	}
}
