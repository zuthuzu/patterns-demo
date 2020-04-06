package ua.kpi.tef.zu.behaviour.templatemethod;

/**
 * Created by Anton Domin on 2020-04-06
 */
public abstract class MachineSecurity {
	public void shutDown() {
		announceShutOff();
		identifyEnergySource();
		lockOutTagOutEnergySource();
		proveEffectiveness();
	}

	public abstract void announceShutOff();

	public abstract void identifyEnergySource();

	public abstract void lockOutTagOutEnergySource();

	public abstract void proveEffectiveness();
}
