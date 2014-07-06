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
		case 2: return "Uit 4 van deze keuze, is er een fout als het gaat om de term LAN. Welke is dat?";
		case 3: return "welke cache staat te om lookup cache te delen over meerdere transacties?";
		case 4: return "Het hexadecimale talstelsel beschikt over ... mogelijkheden om een cijfer te noteren:";
		case 5: return "Wat betekent de afkorting 'GUI'?";
		case 6: return "Een byte bestaat uit ... bits:";
		case 7: return "Een XOF-schakeling geeft 1 terug als beide schakelaars in een verschillende stand staan.";
		case 8: return "kan je een batch starten vanuit een batch?";
		case 9: return "welke lookup cache is read-only?";
		case 10: return "5 wordt in het talstelsel dat de computer gebruikt geschreven als:";
		default: return "A";
	}
	}
	
	public static String getCorrectAnswer() {
		initialize();
		switch (number) {
			case 1: return "1";
			case 2: return "/";
			case 3: return "/";
			case 4: return "4";
			case 5: return "/";
			case 6: return "/";
			case 7: return "2";
			case 8: return "1";
			case 9: return "/";
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
		// TODO Auto-generated method stub
		return "";
	}

	private String optionsQuestion10() {
		return "1/10/11/101";
	}

	private String optionsQuestion8() {
		// TODO Auto-generated method stub
		return "";
	}

	private String optionsQuestion6() {
		return "8/4/2/1";
	}

	private String optionsQuestion5() {
		// TODO Auto-generated method stub
		return "";
	}

	private String optionsQuestion4() {
		return "4/8/12/16";
	}

	private String optionsQuestion3() {
		// TODO Auto-generated method stub
		return "";
	}

	private String optionsQuestion2() {
		// TODO Auto-generated method stub
		return "";
	}

	private String optionsQuestion1() {
		return "Structured Query Language /"
				+ "Static Query Language /"
				+ "Structured Quack Langauge /"
				+ "Super Query Langauge";
	}
}
