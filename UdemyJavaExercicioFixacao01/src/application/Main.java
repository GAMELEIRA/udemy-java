package application;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS DATA 11/01/2020 HORA: 17:28 FINALIDADE DO
 * PROGRAMA: MOSTRAR VALORES NO CONSOLE
 */

public class Main {

	public static void main(String[] args) {

		String product1;

		String product2;

		int age;

		int code;

		int gender;

		double price1;

		double price2;

		double measure;

		product1 = "Computer";

		product2 = "Office desk";

		age = 30;
		
		code = 5290;
		
		gender = 'F';
		
		price1 = 2100.0;
		
		price2 = 650.50;
		
		measure = 53.234567;
		
		System.out.println("Products:");
		
		System.out.printf("%s, which price is $ %.2f %n"
				+ "%s, which price is $ %.2f %n",
				product1, price1, product2, price2);
		
		System.out.println();
		
		System.out.printf("Record: %d years old, code %d and gender: %s",
				age, code, gender);
		
		System.out.println("\n");
		
		System.out.printf("Measue with eigth decimal places: %f %n"
				+ "Rouded (theree decimal places): %.3f %n"
				+ "US decimal point: %.3f",  measure, measure, measure);
	}

}
