package test.main.music;

import test.main.music.band.Band;
import test.main.music.band.Member;
import test.main.music.instruments.Bass;
import test.main.music.instruments.Drums;
import test.main.music.instruments.Guitar;
import test.main.performing.PerformUtils;

public class App {

	public static void main(String[] args) {
		Guitar davidsInstrument = new Guitar("Sweepar", "Röd", "Ibanez");
		Guitar lussesInstrument = new Guitar("Rockar durarara introt", "Blå maple flame", "Mayones");
		Bass kimsInstrument = new Bass("Fingrar snabbt och med precision", "Svart", "Warwick");
		Drums tobiasInstrument = new Drums("Blastar loss", "Blue sparkly", "Roland");
		
		Member david = new Member("David", davidsInstrument);
		Member lusse = new Member("Lusse", lussesInstrument);
		Member kim = new Member("Kim", kimsInstrument);
		Member tobias = new Member("Tobias", tobiasInstrument);
		
		Band nazgul = new Band("Nazghül", david,lusse,kim,tobias);
		nazgul.printBand();
		
		PerformUtils.perform(nazgul);
	}

}
