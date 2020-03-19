package ua.kpi.tef.zu.behaviour.memento;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class Reflection {
	private final String skin;
	private final String eyes;
	private final String makeup;

	public Reflection(String skin, String eyes, String makeup) {
		this.skin = skin;
		this.eyes = eyes;
		this.makeup = makeup;
	}

	public String getSkin() {
		return skin;
	}

	public String getEyes() {
		return eyes;
	}

	public String getMakeup() {
		return makeup;
	}
}
