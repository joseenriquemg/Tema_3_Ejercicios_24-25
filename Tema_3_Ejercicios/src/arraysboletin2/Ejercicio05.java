package arraysboletin2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable para crear la tabla de numeros Randoms
		int tabla[] = new int[1000];

		// Variable para recoger el numero del usuario
		int numero;

		// Variable para recoger el numero de eces que se encuentra un numero en la
		// tabla
		int contador = 0;
		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			// Tabla para crear los numeros Randoms
			tabla[i] = (int) (Math.random() * 100);
		}
		// Imprimimos la tabla de numeros aleatorios
		System.out.println("Tabla de numeros aleatorios: " + Arrays.toString(tabla));
		// Enviamos la pregunta al usuario
		System.out.println("Escribe un valor que quieras ver si existe en la tabla:");
		// Leemos su respuesta del teclado
		numero = sc.nextInt();

		for (int valores : tabla) {
			if (valores == numero) {
				contador++;
			}

		}
		// Condicion para ofrecer el resultado al usuario
		if (contador != 0) {
			System.out.println("Su numero se repite un total de " + contador + " veces.");
		} else {
			System.out.println("Su numero no se encuentra en la tabla.");
		}
		// Cerramos el Scanner
		sc.close();

	}

}
