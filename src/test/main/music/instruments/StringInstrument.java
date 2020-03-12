package test.main.music.instruments;

public abstract class StringInstrument extends MusicalInstrument {

	public StringInstrument(String playDescription, String color, String brand) {
		super(playDescription, color, brand);
	}

	@Override
	public void perform() {
		System.out.println(getPerformDescription() + " på strängarna");
	}

}
