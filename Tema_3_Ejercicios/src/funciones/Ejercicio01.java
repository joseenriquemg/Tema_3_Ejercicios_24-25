package funciones;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int numeros;
		
		int tabla[];
		
		int longitud;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Defina la longitud del array:");
		
		longitud = sc.nextInt();
		
		tabla = new int[longitud];
		
		for (int i = 0; i < tabla.length; i++) {
			
			System.out.println("Introduzca los valores:");
			
			numeros = sc.nextInt();
			
			tabla[i] = numeros;
		}
		
		System.out.println(suma(tabla));

	}

	static int suma(int[] tabla) {

		int sumaTotal = 0;

		for (int i = 0; i < tabla.length; i++) {
			
			sumaTotal += tabla[i];
		
		}
		
		return sumaTotal;

	}

}
