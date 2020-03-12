package test.main.music.instruments;

import test.main.performing.Performable;

public abstract class MusicalInstrument implements Performable {
	
	private String color;

	private String playDescription;

	private String brand;
	
	public MusicalInstrument(String playDescription, String color, String brand) {
		this.color = color;
		this.playDescription = playDescription;
		this.brand = brand;
	}

	public String getPerformDescription() {
		return playDescription;
	}

	
	public String getColor() {
		return color;
	}
	
	public void inspect() {
		String type = getClass().getSimpleName();
		System.out.println(this.color + " " + this.brand + " " + type);
	}
	
}
