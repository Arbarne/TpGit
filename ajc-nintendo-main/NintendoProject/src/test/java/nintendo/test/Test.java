package nintendo.test;

import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console gamecube = new Console("Gamecube");
		Console wii = new Console("wii");
		Jeu j1 = new Jeu("wii sport", wii);
		Jeu j2 = new Jeu("supermariowii", wii);
		Jeu j3 = new Jeu("mario sushine", gamecube);
		Jeu j4 = new Jeu("f-zero", gamecube);
		Jeu j5 = new Jeu("zelda twilight princess", wii);
	
		Client client1 = new Client("Toto", "Titi");
		Client client2 = new Client("Patate", "Frites");
	
	}

}
