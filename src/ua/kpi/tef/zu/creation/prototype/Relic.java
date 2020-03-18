package ua.kpi.tef.zu.creation.prototype;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class Relic implements Prototype, Cloneable {
	String sanctum;

	public Relic(String sanctum) {
		this.sanctum = sanctum;
	}

	@Override
	public Prototype clonePrototype() {
		try {
			return (Prototype) this.clone();
		} catch (CloneNotSupportedException | ClassCastException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return "Relic{" +
				"sanctum='" + sanctum + '\'' +
				'}';
	}
}
