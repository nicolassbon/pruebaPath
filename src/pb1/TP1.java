package pb1;

import java.util.Scanner;

public class TP1 {
	private static final boolean INICIAL = false;
	private static final Scanner teclado = new Scanner(System.in);
	private static int notaUno = 0;
	private static int notaDos = 0;
	private static boolean ingresoCorrectoNota1 = INICIAL;
	private static boolean ingresoCorrectoNota2 = INICIAL;
	private static boolean promociono = INICIAL;
	private static boolean aprobo = INICIAL;
	private static boolean desaprobo = INICIAL;
	
	public static void main(String[] args) {

		ingresarCorrectamenteNota1();
		
		ingresarCorrectamenteNota2();
		
		evaluarNotas();

		mostrarMensajePorConsola("promociono " + promociono + " aprobo " + aprobo + " desaprobo " + desaprobo);
	}
	
	private static void mostrarMensajePorConsola(String mensaje) {
		System.out.println(mensaje);
	}
	
	private static void mostrarErrorPorConsola(String mensaje) {
		System.err.println("\n" + mensaje);
	}
	
	private static int ingresarEnteroConMensaje(String mensaje) {
		mostrarMensajePorConsola(mensaje);
		return teclado.nextInt();
	}
	
	private static void ingresarCorrectamenteNota1() {
		do {
			notaUno = ingresarEnteroConMensaje("Ingrese la primer nota del alumno");
			if (notaUno < 0 || notaUno > 10) {
				mostrarErrorPorConsola("Ingrese una nota valida");
			} else {
				ingresoCorrectoNota1 = true;
			}
			
		} while (!ingresoCorrectoNota1);
	}
	
	private static void ingresarCorrectamenteNota2() {
		do {
			notaDos = ingresarEnteroConMensaje("Ingrese la segunda nota del alumno");
			if (notaDos < 0 || notaDos > 10) {
				mostrarErrorPorConsola("Ingrese una nota valida");
			} else {
				 ingresoCorrectoNota2 = true;
			}
			
		} while (!ingresoCorrectoNota2);
	}
	
	private static void evaluarNotas() {
		if (notaUno >= 7 && notaDos >= 7) {
			promociono = true;
		} else if ((notaUno >= 4 && notaDos >= 4) && (notaUno < 7 || notaDos < 7)) {
			aprobo = true;
		} else if (notaUno < 4 || notaDos < 4) {
			desaprobo = true;
		}
	}

}
