package test.main.music.band;

import test.main.music.instruments.MusicalInstrument;
import test.main.performing.AbstractPerformer;
import test.main.performing.Performable;
import test.main.performing.Performer;

public class Member extends AbstractPerformer<MusicalInstrument> {
	
	public Member(String name, MusicalInstrument instrument) {
		super(name, instrument);
	}

	public void printPresentation() {
		System.out.print(getIdentity() + " spelar på ");
		getPerformable().inspect();
	}

}
