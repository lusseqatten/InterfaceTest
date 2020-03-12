package test.main.gaming.model;

import test.main.performing.AbstractPerformer;
import test.main.performing.Performable;
import test.main.performing.Performer;

public class Gamer extends AbstractPerformer<GamingGear> {

	public Gamer(String id, GamingGear perfble) {
		super(id, perfble);
	}

}
