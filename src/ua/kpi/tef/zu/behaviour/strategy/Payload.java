package ua.kpi.tef.zu.behaviour.strategy;

/**
 * Created by Anton Domin on 2020-04-06
 */
public class Payload {
	private String location;

	public Payload(String location) {
		this.location = location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Payload{" +
				"location='" + location + '\'' +
				'}';
	}
}
