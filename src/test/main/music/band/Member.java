package test.main.music.band;

import test.main.music.instruments.MusicalInstrument;
import test.main.performing.AbstractPerformer;

public class Member extends AbstractPerformer<MusicalInstrument> {
	
	public Member(String name, MusicalInstrument instrument) {
		super(name, instrument);
	}

	public void printPresentation() {
		System.out.print(getIdentity() + " spelar på ");
		getPerformable().inspect();
	}

}
