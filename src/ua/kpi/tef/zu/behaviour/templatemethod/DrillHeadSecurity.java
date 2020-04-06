package ua.kpi.tef.zu.behaviour.templatemethod;

/**
 * Created by Anton Domin on 2020-04-06
 */
public class DrillHeadSecurity extends MachineSecurity {
	private final static String POWERSOURCE = "fuel cell block XN10";
	private String foreman;

	public DrillHeadSecurity(String foreman) {
		this.foreman = foreman;
	}

	@Override
	public void announceShutOff() {
		System.out.println("To all personnel: drillhead is shutting down now.");
	}

	@Override
	public void identifyEnergySource() {
		System.out.println("To engineering personnel: drillhead powersource is " + POWERSOURCE + ".");
	}

	@Override
	public void lockOutTagOutEnergySource() {
		System.out.println("To engineering personnel: drillhead powersource is down.");
	}

	@Override
	public void proveEffectiveness() {
		System.out.println("To engineering personnel: drillhead is immobile and tagged out as per orders of " + foreman);
	}
}
