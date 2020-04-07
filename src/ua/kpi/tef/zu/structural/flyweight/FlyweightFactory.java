package ua.kpi.tef.zu.structural.flyweight;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anton Domin on 2020-04-07
 */
public class FlyweightFactory {
	private static Map<CarrierSources, DataCarrier> map = new HashMap<>();

	public static Flyweight getClassFromFactory(CarrierSources source) {
		DataCarrier carrier;

		if (map.containsKey(source)) {
			carrier = map.get(source);
		} else {
			carrier = new DataCarrier(source.getData());
			map.put(source, carrier);
		}

		int length = (int) (Math.random() * 10) + 5;
		int index = (int) (Math.random() * (carrier.getData().length() - length));

		switch (source) {
			case LOREM: return new LoremFlyweight(carrier, index, length);
			case JABBERWOCKY: return new JabberwockyFlyweight(carrier, index, length);
			default: throw new IllegalArgumentException("Unknown carrier type: " + source);
		}
	}

	public static int getCarrierSize() {
		return map.values().size();
	}
}
