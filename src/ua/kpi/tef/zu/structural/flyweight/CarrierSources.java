package ua.kpi.tef.zu.structural.flyweight;

/**
 * Created by Anton Domin on 2020-04-07
 */
public enum CarrierSources {
	LOREM ("Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
			" sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
	JABBERWOCKY ("’Twas brillig, and the slithy toves\n" +
			"Did gyre and gimble in the wabe:\n" +
			"All mimsy were the borogoves,\n" +
			"And the mome raths outgrabe.");

	private String data;

	CarrierSources(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}
}
