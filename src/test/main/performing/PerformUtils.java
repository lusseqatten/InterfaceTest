package test.main.performing;

public class PerformUtils {
	
	public static void perform(PerformerContainer pc) {
		for (Performer p : pc.getPerformers()) {
			System.out.print(p.getIdentity() + " ");
			p.getPerformable().perform();
		}
	}

}
