package arraysboletin1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Variable para recoger los numeros del usuario.
		double numeros;
		
		// Variable para recoger la tabla.
		double tabla [] = new double [5];
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner ( System.in);
		
		// Bucle para pedir al usuario los 5 numeros;
		for (int i = 0; i < tabla.length; i++ ) {
			
			// Solicitamos los numeros al usuario.
			System.out.println("Introduzca un valor a la tabla:");
			
			// Leemos del teclado.
			numeros = sc.nextDouble();
			
			// Introducimos los numeros a la tabla.
			tabla[i] = numeros;
		}
		
		// Bucle para mostrar la tabla.
		for (double valores : tabla) {
			
			numeros = valores; 
			
			// Imprimimos dichos valores en orden.
			System.out.println(valores);
			
		}

	}

}
