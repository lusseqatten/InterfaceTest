package test.main.gaming;

import test.main.gaming.model.Gamer;
import test.main.gaming.model.Mouse;
import test.main.gaming.model.Team;
import test.main.performing.PerformUtils;

public class App {

	public static void main(String[] args) {
		Mouse razer = new Mouse("Razer", "Klickar fort som fan");
		Gamer fg = new Gamer("Froggen", razer);
		Team tk = new Team(fg);
		
		PerformUtils.perform(tk);
	}

}
