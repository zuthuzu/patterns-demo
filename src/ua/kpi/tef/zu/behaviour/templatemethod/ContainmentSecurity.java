package ua.kpi.tef.zu.behaviour.templatemethod;

/**
 * Created by Anton Domin on 2020-04-06
 */
public class ContainmentSecurity extends MachineSecurity {
	private String executive;

	public ContainmentSecurity(String executive) {
		this.executive = executive;
	}

	@Override
	public void announceShutOff() {
		System.out.println("To all personnel: ORANGE ALERT: containment field shutdown imminent. Seek shelter now.");
	}

	@Override
	public void identifyEnergySource() {
		System.out.println("To engineering personnel: containment powersources are prepped for stand down. " +
				"Orders by " + executive + ".");
	}

	@Override
	public void lockOutTagOutEnergySource() {
		System.out.println("To engineering personnel: CRITICAL: containment powersources are down.");
	}

	@Override
	public void proveEffectiveness() {
		System.out.println("To all personnel: containment field is down. Remain at your shelter until further notice.");
	}
}
