package arraysboletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Variable para solicitar al usuario el tamaño.
		int tamaño = 0;

		// Variable para solicitar el valor.
		int valor;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario el tamaño del array.
		System.out.println("Introduzca el tamaño de su array:");

		// Leemos del teclado.
		tamaño = sc.nextInt();

		// Variable para recoger paa recoger la tabla.
		int tabla[] = new int[tamaño];

		// Solicitamos al usuario el valor del array.
		System.out.println("Introduzca el valor de su array:");

		// Leemos del teclado.
		valor = sc.nextInt();

		// Bucle para recorrer la tabla.
		for (int i = 0; i < tabla.length; i++) {

			// Aplicamos los valores a la tabla.
			tabla[i] = valor;

		}

		// Ofecemos la tabla al usuario.
		System.out.println(Arrays.toString(tabla));

		// Cerramos el Scanner.
		sc.close();
	}

}
