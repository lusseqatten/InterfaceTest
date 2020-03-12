package test.main.music.band;

import test.main.performing.AbstractPerformerContainer;

public class Band extends AbstractPerformerContainer<Member> {

	private String name;

	public Band(String name, Member... members) {
		super(members);
		this.name = name;
	}

	public void printBand() {
		System.out.println(name);
		for (Member member : getPerformers()) {
			member.printPresentation();
		}
	}
}
