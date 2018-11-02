package Voorbeeld;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		
		
		System.out.println("Welke leeftijd heb je?");
		Scanner scanner = new Scanner(System.in);
		int leeftijd = scanner.nextInt();
		System.out.println("Hoe heet je?");
		String deNaam = scanner.next();
		System.out.println("Hallo, " + deNaam);
	

		if(leeftijd >= 18) {
			System.out.println("Neem maar alvast lessen");
		}
		else {
			System.out.println("Je bent nog te jong!");
		}
		
		System.out.println("Wat wilt u nu doen?");
		System.out.println("1 dobbelsteen gooien, q stoppen");
		
		int positie = 0; 
		
		for(;;) {

			
			String invoer = scanner.next();
			
			if(invoer.equals("q")) {
				System.out.println("Bedankt voor het spelen!");
				break;
			}
			if(invoer.equals("1")) {
				Random random = new Random();
				int getal = random.nextInt(6) + 1;
				positie = positie + getal;
				System.out.println("Ik zet " + getal + " stapjes");
				System.out.println("Je staat nu op positie: " + positie);
			}
			
		}
		
			
		

	}

}
