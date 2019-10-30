package ahorcado;

public class Pintar {
	public static void pintaMuñeco(String vFallos[], String vHuecos[]) {
		int fallos = 0;
		
		for (int i = 0; i<vFallos.length; i++) {
			if (vFallos[i] != null) {
				fallos = fallos + 1;
			}
		}
		switch (fallos) {
		case 1:
			System.out.println("_________________");
			break;
		case 2:
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_________________");
			break;
		case 3:
			System.out.println("__________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_________________");
			break;
		case 4:
			System.out.println("__________");
			System.out.println("|         |");
			System.out.println("|         |");
			System.out.println("|        <0>");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_________________");
			break;
		case 5:
			System.out.println("__________");
			System.out.println("|         |");
			System.out.println("|         |");
			System.out.println("|        <0>");
			System.out.println("|         |");
			System.out.println("|         |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_________________");
			break;
		case 6:
			System.out.println("__________");
			System.out.println("|         |");
			System.out.println("|         |");
			System.out.println("|        <0>");
			System.out.println("|        /|\\");
			System.out.println("|         |");
			System.out.println("|        / \\");
			System.out.println("|");
			System.out.println("|_________________");
			break;
		}
		
		System.out.println();
		System.out.println("Fallos:");
		for (int i = 0; i<vFallos.length; i++) {
			if (vFallos[i] != null) {
				System.out.println(vFallos[i] + " ");
			}
		}
		System.out.println("");
	}
	
}
