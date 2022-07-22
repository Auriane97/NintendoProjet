package test;


import java.time.LocalDate;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c1= new Console ("switch");
		Console c2= new Console ("xbox");
		Console c3= new Console ("playstation");
		Console c4= new Console ("gamecube");
		Console c5= new Console ("supernintendo");
		
		Jeu j1= new Jeu ("zelda",c1);
		Jeu j2= new Jeu ("mario",c2);
		Jeu j3= new Jeu ("siperman",c3);
		Jeu j4= new Jeu ("wii sport",c4);
		Jeu j5= new Jeu ("pokemon",c5);
		
		Achat achat1= new Achat(j1,LocalDate.now(),40.0);
		
		
		
		
		Adresse a1 = new Adresse ("12","rue dubonneau","Paris");
		
		Boutique b1 = new Boutique("la maison du jeu",a1);

		Client client1 = new Client ("Doe","Joe");
		Client client2 = new Client ("DANE","Jane");
	
		client1.getAchats().add(achat1);
	}
	

}
