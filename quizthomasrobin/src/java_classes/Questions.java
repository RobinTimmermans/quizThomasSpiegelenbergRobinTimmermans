package java_classes;

public class Questions {

	private static Questions QUESTIONS = null;
	public static int number = 0;
	
	public static String getQuestion() {
		initialize();
		QUESTIONS.number++;
		return getQuestion(number);
	}
	
	private static String getQuestion(int number) {	
		switch (number) {
		case 1: return "Waarvoor staat de afkorting 'SQL'?";
		case 2: return "Clojure is een vorm van?";
		case 3: return "Een LAN netwerk is?";
		case 4: return "Het hexadecimale talstelsel beschikt over ... mogelijkheden om een cijfer te noteren:";
		case 5: return "Wat is een 'container' object in GUI programmeren?";
		case 6: return "Een byte bestaat uit ... bits:";
		case 7: return "Een XOF-schakeling geeft 1 terug als beide schakelaars in een verschillende stand staan.";
		case 8: return "Is het mogelijk een batch te runnen vanuit een batch?";
		case 9: return "In welke van de onderstaande taal wordt er multiple inheritance toegestaan";
		case 10: return "5 wordt in het talstelsel dat de computer gebruikt geschreven als:";
		default: return "A";
	}
	}
	
	public static String getCorrectAnswer() {
		initialize();
		switch (number) {
			case 1: return "1";
			case 2: return "3";
			case 3: return "2";
			case 4: return "4";
			case 5: return "4";
			case 6: return "1";
			case 7: return "2";
			case 8: return "1";
			case 9: return "3";
			case 10: return "4";
			default: return "X";
		}
	}
	

	private static void initialize() {
		if (QUESTIONS == null) {
			QUESTIONS = new Questions();
		}
	}
	
	public static String generateOptions() {
		initialize();
		switch (QUESTIONS.number) {
			case 1: return QUESTIONS.optionsQuestion1();
			case 2: return QUESTIONS.optionsQuestion2();
			case 3: return QUESTIONS.optionsQuestion3();
			case 4: return QUESTIONS.optionsQuestion4();
			case 5: return QUESTIONS.optionsQuestion5();
			case 6: return QUESTIONS.optionsQuestion6();
			case 7: return QUESTIONS.optionsQuestion7();
			case 8: return QUESTIONS.optionsQuestion8();
			case 9: return QUESTIONS.optionsQuestion9();
			case 10: return QUESTIONS.optionsQuestion10();			
			default: return "";
		}
	}

	private String optionsQuestion7() {
		return "Waar/Niet waar";
	}

	private String optionsQuestion9() {
		return "Java"
				+ "C-Sharp"
				+ "C++"
				+ "Clojure";
	}

	private String optionsQuestion10() {
		return "1/10/11/101";
	}

	private String optionsQuestion8() {
		return "Ja / Nee";
	}

	private String optionsQuestion6() {
		return "8/4/2/1";
	}

	private String optionsQuestion5() {
		return "Een soort voor een ArrayList"
				+ "Een klasse die bestaat uit andere klassen"
				+ "een primitieve die data bevat"
				+ "een object zoals waarop andere GUI componenten geplaatst kunnen worden";
	}

	private String optionsQuestion4() {
		return "4/8/12/16";
	}

	private String optionsQuestion3() {
		return "Een draadloos netwerk"
				+ "Een lokaal netwerk vaak binnen een gebouw of complex"
				+ "Een groot netwerk dat zich niet beperkt tot een gebouw of complex"
				+ "Geen van bovenstaande";
	}

	private String optionsQuestion2() {
		return "Object geörienteerd programmeren"
				+ "test gedreven programmeren"
				+ "Functioneel programmeren"
				+ "Lineair programmeren";
	}

	private String optionsQuestion1() {
		return "Structured Query Language /"
				+ "Static Query Language /"
				+ "Structured Quack Langauge /"
				+ "Super Query Langauge";
	}
}
