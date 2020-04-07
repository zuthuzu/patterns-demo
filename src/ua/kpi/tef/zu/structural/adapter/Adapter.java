package ua.kpi.tef.zu.structural.adapter;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class Adapter implements Target {
	private Performer performer;

	public Adapter(Performer performer) {
		this.performer = performer;
	}

	@Override
	public void getStuff(String stuff) {
		performer.obtainSpecifiedEntity(stuff);
	}
}
