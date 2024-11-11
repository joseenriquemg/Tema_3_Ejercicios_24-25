package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int values;

		String option = "";

		int position = 0;

		boolean error = false;

		int table[] = new int[10];

		Scanner sc = new Scanner(System.in);

		do {

			do {

				error = false;

				try {
					System.out.println("Choose what do you want to do:");
					System.out.println("A. Show values");
					System.out.println("B. Introduce a value.");
					System.out.println("C. Exit.");

					option = sc.next();

					assert (option.equals("A") || option.equals("B") || option.equals("C"))
							: "You have to introduce a correct value (A, B or C).";

				} catch (AssertionError e) {

					System.out.println(e.getLocalizedMessage());

					error = true;

				}

			} while (error);

			switch (option) {

			case "A" -> {

				System.out.println("Your table.");

				System.out.println(Arrays.toString(table));

				System.out.println();

			}

			case "B" -> {

				System.out.println("Add a value:");

				values = sc.nextInt();

				System.out.println("Introduce the position:");

				position = sc.nextInt();

				table[position] = values;

				System.out.println(Arrays.toString(table));

				System.out.println();

			}

			case "C" -> {

				System.out.println("Exiting...");

			}

			default -> {

				System.out.println("You have to introduce a correct value (A, B or C).");

			}
			}

		} while (!option.equals("C"));

		sc.close();

	}

}
