package Voorbeeld;

import java.util.Scanner;

public class Landencodes {

	public static void main(String[] args) {
		System.out.println("Geef een landencode op");
		Scanner scanner = new Scanner(System.in);
		
		String landcode = scanner.next();
		
		while (landcode != "stop") {

		 
		switch(landcode) {
		case "NL" : System.out.println("Nederland");
		break;
		case "DE" : System.out.println("Duitsland");
		break;
		case "GB" : System.out.println("Groot-Brittanië");
		break;
		case "BE" : System.out.println("België");
		break;
		case "IT" : System.out.println("Italië");
		break;
		case "SP" : System.out.println("Spanje");
		break;
		case "STOP" : break;
		}
	}

	}
}
