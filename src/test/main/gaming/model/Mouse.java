package test.main.gaming.model;

public class Mouse extends GamingGear {

	private String identity;

	public Mouse(String id, String pd) {
		super(pd);
		this.identity = id;
	}

	@Override
	public void perform() {
		System.out.println(getPerformDescription() + " med " + identity);
	}

}
