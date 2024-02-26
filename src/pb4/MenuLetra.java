package pb4;

import java.util.Scanner;

public class MenuLetra {
	private static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		char letraIngresada;

		Letra letra = new Letra();
		do {
			letraIngresada = ingresarCharConMensaje("Ingrese una letra vocal");
			letra.setLetra(letraIngresada);
		} while (!letra.esVocal());
	}

	public static final void mostrarMensajePorConsola(String mensaje) {
		System.out.println(mensaje);
	}

	public static char ingresarCharConMensaje(String mensaje) {
		mostrarMensajePorConsola(mensaje);
		return teclado.next().charAt(0);
	}

}
