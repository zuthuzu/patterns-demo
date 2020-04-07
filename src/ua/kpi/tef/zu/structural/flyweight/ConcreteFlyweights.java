package ua.kpi.tef.zu.structural.flyweight;

/**
 * Created by Anton Domin on 2020-04-07
 */
class LoremFlyweight implements Flyweight {
	DataCarrier carrier;
	int index;
	int length;

	public LoremFlyweight(DataCarrier carrier, int index, int length) {
		this.carrier = carrier;
		this.index = index;
		this.length = length;
	}

	@Override
	public String getData() {
		return carrier.getData().substring(index, index + length);
	}
}

class JabberwockyFlyweight implements Flyweight {
	DataCarrier carrier;
	int index;
	int length;

	public JabberwockyFlyweight(DataCarrier carrier, int index, int length) {
		this.carrier = carrier;
		this.index = index;
		this.length = length;
	}

	@Override
	public String getData() {
		return carrier.getData().substring(index, index + length);
	}
}