package Voorbeeld;

public enum Weekdays {
	MAANDAG,
	DINSDAG,
	WOENSDAG,
	DONDERDAG,
	VRIJDAG,
	ZATERDAG,
	ZONDAG;
	
Weekdays weekdays = Weekdays.DONDERDAG;

switch(weekdays) {
case MAANDAG 	: System.out.println("Brr het is maandag");
case DINSDAG 	: System.out.println("Het is al dinsdag");
case WOENSDAG 	: System.out.println("De week is doormidden");
case DONDERDAG 	: System.out.println("Nog 2 dagen!");
case VRIJDAG 	: System.out.println("De laatste dag voor het weekend!");
case ZATERDAG 	: System.out.println("WEEKEND!!!");
case ZONDAG 	: System.out.println("De week begint weer bijna");
}
}
