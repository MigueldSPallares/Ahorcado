package ahorcado;

import java.util.Scanner;

public class Ahorcado {

	
	//Método que comprueba que la partida se ha terminado
	//O pierdo las vidas o gano la partida
	public static boolean partidaTerminada() {
		boolean terminado=false;
		
		return terminado;
	}
	
	public static void inicializarVectores(String vHuecos[], String vSolucion[], String palabra){
		for (int i=0; i<vHuecos.length; i++) {
			vHuecos[i] = "_";
			vSolucion[i] = palabra.substring(i, i+1);
		}
		
	}
	
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
		System.out.println();
		for (int i = 0; i<vHuecos.length; i++) {
			System.out.print(vHuecos[i] + " ");
		}
		
		System.out.println();
		System.out.println("Fallos:");
		for (int i = 0; i<vFallos.length; i++) {
			if (vFallos[i] != null) {
				System.out.println(vFallos[i] + " ");
			}
		}
	}
	//Pregunta la letra y actualiza los vectores
	//Si se encuentra actualiza vHuecos
	//Si fallo actualiza vFallos
	public static void preguntarLetra(String vFallos[], String vHuecos[], String vSolucion[]) {
		Scanner leer = new Scanner(System.in);
		String letra;
		boolean acierto = false;
		System.out.println("Pon una letra");
		letra = leer.nextLine();
		for(int i = 0; i<vSolucion.length; i++) {
			if(vSolucion[i].equalsIgnoreCase(letra)) {
				vHuecos[i] = vSolucion[i];
				acierto = true;
			}
		}
		for(int i = 0; i<vFallos.length; i++) {
			if((!acierto) && (vFallos[i] == null)) {
				vFallos[i] = letra;
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		String palabraSolucion = "HOLA";
		String vFallos[], vSolucion[], vHuecos[];
		
		vFallos = new String[6];
		vHuecos = new String[palabraSolucion.length()];
		vSolucion = new String[palabraSolucion.length()];
		
		inicializarVectores(vHuecos, vSolucion, palabraSolucion);
		
		do {
			pintaMuñeco(vFallos, vHuecos);
			preguntarLetra(vFallos, vHuecos, vSolucion);
		}while(partidaTerminada());
	}

}
