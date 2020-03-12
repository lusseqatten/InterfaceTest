package test.main.music.instruments;

public class PercussiveInstrument extends MusicalInstrument {

	private String surface;

	public PercussiveInstrument(String playDescription, String color, String brand, String surface) {
		super(playDescription, color, brand);
		this.surface = surface;
	}

	@Override
	public void perform() {
		System.out.println(getPerformDescription() + " på " + this.surface);
	}

}
