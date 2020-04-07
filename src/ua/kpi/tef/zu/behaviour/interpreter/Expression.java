package ua.kpi.tef.zu.behaviour.interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anton Domin on 2020-04-07
 */
public interface Expression {
	Set<String> WIN_TERMS = new HashSet<>(Arrays.asList("killed", "murdered", "vanquished"));
	Set<String> LOSS_TERMS = new HashSet<>(Arrays.asList("died to", "conceded to", "was killed by"));
	Set<String> BRO_TERMS = new HashSet<>(Arrays.asList("united with", "allied with", "befriended"));

	String interpret();
}
