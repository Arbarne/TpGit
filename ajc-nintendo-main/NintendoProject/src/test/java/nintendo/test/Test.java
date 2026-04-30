package nintendo.test;

import nintendo.model.Boutique;

import nintendo.model.Client;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console gamecube = new Console("Gamecube");
		Console wii = new Console("wii");
		Boutique b1=new Boutique("Escromania","12","Paris","rue des escrocs","75000");
		Boutique b2=new Boutique("Micromafia","21","Brest","rue des mafieux","29200");

		Jeu j1 = new Jeu("wii sport", wii);
		Jeu j2 = new Jeu("supermariowii", wii);
		Jeu j3 = new Jeu("mario sushine", gamecube);
		Jeu j4 = new Jeu("f-zero", gamecube);
		Jeu j5 = new Jeu("zelda twilight princess", wii);

		
		Boutique boutique = new Boutique("Mario","14", "Paris", "Rue des Chammpignons", "75011");
		

	
		Client client1 = new Client("Toto", "Titi");
		Client client2 = new Client("Patate", "Frites");
	  Boutique boutique = new Boutique("Mario","14", "Paris", "Rue des Chammpignons", "75011");
	}

}
