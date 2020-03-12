package test.main.performing;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPerformerContainer<T extends Performer> implements PerformerContainer {

	private List<T> perfList = new ArrayList<>();

	public AbstractPerformerContainer(@SuppressWarnings("unchecked") T ...performers ) {
		if (null != performers) {
			for (T performer : performers) {
				perfList .add(performer);
			}
		}
	}
	
	@Override
	public List<T> getPerformers() {
		return perfList;
	}
}
