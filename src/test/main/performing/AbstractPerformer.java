package test.main.performing;

public abstract class AbstractPerformer<T extends Performable> implements Performer {

	private T perfble;
	private String id;

	public AbstractPerformer(String id, T perfble) {
		this.id = id;
		this.perfble = perfble;
	}
	
	@Override
	public T getPerformable() {
		return perfble;
	}

	@Override
	public String getIdentity() {
		return id;
	}

}
