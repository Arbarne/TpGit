package nintendo.test;

import java.time.LocalDate;

import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salon gamecube = new Salon("Gamecube",100,LocalDate.parse("2018-08-15"));
		Salon wii = new Salon("wii", 75.5 ,LocalDate.now());
		Hybride switch2 = new Hybride("Switch2", 10000 ,LocalDate.now());
		Portable GBA= new Portable("Gébéa", 200 ,LocalDate.now());
		
		
		
		Boutique b1=new Boutique("Escromania","12","Paris","rue des escrocs","75000");
		Boutique b2=new Boutique("Micromafia","21","Brest","rue des mafieux","29200");
		Boutique boutique = new Boutique("Mario","14", "Paris", "Rue des Chammpignons", "75011");

		Jeu j1 = new Jeu("wii sport", wii,b1);
		Jeu j2 = new Jeu("supermariowii", wii,b1);
		Jeu j3 = new Jeu("mario sushine", gamecube,b2);
		Jeu j4 = new Jeu("f-zero", gamecube,b2);
		Jeu j5 = new Jeu("zelda twilight princess", wii,boutique);

			

	
		Client client1 = new Client("Toto", "Titi");
		Client client2 = new Client("Patate", "Frites");
	  
	}

}
