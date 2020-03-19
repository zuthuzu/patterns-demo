package ua.kpi.tef.zu.behaviour.memento;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class Face {
	private String skin = "fresh";
	private String eyes = "sleepy";
	private String makeup = "none";

	public String getMakeup() {
		return makeup;
	}

	public void setMakeup(String makeup) {
		this.makeup = makeup;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	@Override
	public String toString() {
		return "Face{" +
				"skin='" + skin + '\'' +
				", eyes='" + eyes + '\'' +
				", makeup='" + makeup + '\'' +
				'}';
	}

	public Reflection createMemento() {
		return new Reflection(skin, eyes, makeup);
	}

	public void setMemento(Reflection memento) {
		skin = memento.getSkin();
		eyes = memento.getEyes();
		makeup = memento.getMakeup();
	}
}
