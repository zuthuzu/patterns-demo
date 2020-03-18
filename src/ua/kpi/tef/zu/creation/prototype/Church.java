package ua.kpi.tef.zu.creation.prototype;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class Church {
	private Relic relic;

	public Church(String sanctum) {
		this.relic = new Relic(sanctum);
	}

	public Church(Relic relic) {
		this.relic = relic;
	}

	public void setRelic(Relic relic) {
		this.relic = relic;
	}

	public Prototype getRelic() {
		return relic.clonePrototype();
	}
}
