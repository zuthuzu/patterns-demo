package ua.kpi.tef.zu.behaviour.iterator;

import ua.kpi.tef.zu.creation.singleton.Singleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class SurgeryChecklist {
	private static volatile SurgeryChecklist instance;
	private List<String> checklist = new ArrayList<>();

	private SurgeryChecklist() {
		checklist.add("Подтвердил ли пациент свое имя, место операции, процедуру и согласие?");
		checklist.add("Маркировано ли место операции?");
		checklist.add("Проведена ли проверка оборудования и лекарственных средств для анестезии?");
		checklist.add("Пульсоксиметр зафиксирован на пациенте и функционирует?");
		checklist.add("Имеется ли у пациента: известная аллергия?");
		checklist.add("Имеется ли у пациента: проблемы дыхательных путей или риск аспирации?");
		checklist.add("Имеется ли у пациента: риск кровопотери >500мл (7мл/кг у детей)??");
	}

	public List<String> getChecklist() {
		return checklist;
	}

	public static Iterator<String> iterator() {
		return new SurgeryIterator();
	}

	public static SurgeryChecklist getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new SurgeryChecklist();
				}
			}
		}
		return instance;
	}
}
