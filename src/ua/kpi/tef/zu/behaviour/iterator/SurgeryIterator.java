package ua.kpi.tef.zu.behaviour.iterator;

import java.util.Iterator;

/**
 * Created by Anton Domin on 2020-03-19
 */
public class SurgeryIterator implements Iterator<String> {
	int index;
	SurgeryChecklist checklist;

	public SurgeryIterator() {
		checklist = SurgeryChecklist.getInstance();
	}

	@Override
	public boolean hasNext() {
		return index < checklist.getChecklist().size();
	}

	@Override
	public String next() {
		return (index+1) + ". " + checklist.getChecklist().get(index++);
	}
}
