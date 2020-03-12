package test.main.gaming.model;

import test.main.performing.Performable;

public abstract class GamingGear implements Performable {
	
	private String performDescription;

	public GamingGear(String pd) {
		this.performDescription = pd;
	}

	@Override
	public String getPerformDescription() {
		return performDescription;
	}

}
