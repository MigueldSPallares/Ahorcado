package ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	
	//Método que comprueba que la partida se ha terminado
	//O pierdo las vidas o gano la partida
	public static boolean partidaTerminada(String vFallos[], String vHuecos[]) {
		boolean terminado=false;
		
		if(partidaPerdida(vFallos)) {
			System.out.println("Has perdido");
			terminado = true;
		}
		
		if(partidaGanada(vHuecos)) {
			System.out.println("Has ganado");
			terminado = true;
		}
		return terminado;
	}
	
	public static boolean partidaPerdida(String vFallos[]) {
		boolean terminado=true;
		for(int j = 0; j<vFallos.length; j++) {
			if(vFallos[j] == null) {
				terminado = false;
				break;
			}
		}
		return terminado;
	}
	
	public static boolean partidaGanada(String vHuecos[]) {
		boolean terminado=true;
		for(int i = 0; i<vHuecos.length; i++) {
			if(vHuecos[i].equalsIgnoreCase("_")) {
				terminado=false;
				break;
			}
		}
		return terminado;
	}
	
	public static void inicializarVectores(String vHuecos[], String vSolucion[], String palabra){
		for (int i=0; i<vHuecos.length; i++) {
			vHuecos[i] = "_";
			vSolucion[i] = palabra.substring(i, i+1);
		}
		
	}
	
	
	//Pregunta la letra y actualiza los vectores
	//Si se encuentra actualiza vHuecos
	//Si fallo actualiza vFallos
	public static void preguntarLetra(String vFallos[], String vHuecos[], String vSolucion[]) {
		Scanner leer = new Scanner(System.in);
		String letra;
		boolean acierto = false;
		System.out.println(" ");
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
	
	public static String damePalabra() {
		String[] vPalabras = {"Hola", "Juan", "Vaso", "Zapato", "Tienda"};
		String palabra = "";
		Random i = new Random();
		palabra = vPalabras[i.nextInt(5)];
		return palabra;
	}
	
	public static void main(String[] args) {
		String palabraSolucion = damePalabra();
		String vFallos[], vSolucion[], vHuecos[];
		
		vFallos = new String[6];
		vHuecos = new String[palabraSolucion.length()];
		vSolucion = new String[palabraSolucion.length()];
		
		inicializarVectores(vHuecos, vSolucion, palabraSolucion);
		
		do {
			System.out.println();
			System.out.println();
			for (int i = 0; i<vHuecos.length; i++) {
				System.out.print(vHuecos[i] + " ");
			}
			preguntarLetra(vFallos, vHuecos, vSolucion);
			Pintar.pintaMuñeco(vFallos, vHuecos);
			if(partidaGanada(vHuecos)) {
				for(int i=0; i<vHuecos.length; i++) {
					System.out.print(vHuecos[i]);
				}
				System.out.println("");
			}
		}while(!partidaTerminada(vFallos, vHuecos));
	}

}
