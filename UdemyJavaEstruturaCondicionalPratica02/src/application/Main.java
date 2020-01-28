package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS DATA:28/01/2020 HORA:13:56 FINALIDADE DO
 * PROGRAMA: CALCULAR AS RAIZES DE BASKARA
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double a, b, c, raizX, raizY,delta;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Iremos calcular as raizes da equacao de Baskara.");

		System.out.println("Informe o valor de A:");

		a = dados.nextFloat();

		System.out.println("Informe o valor de B:");

		b = dados.nextFloat();

		System.out.println("Informe o valor de C:");

		c = dados.nextFloat();

		if (a == 0.0) {
			
			System.out.println("Impossivel calcular, pois o coeficiente a não pode ser igual a 0.");
			
			return;

		}
		
		delta = Math.pow(b, 2) - 4.0 * a * c;
	
		if(delta < 0.0) {
			
			System.out.println("Impossivel calcular, pois o coeficiente a não pode ser igual a 0.");
			
		} else {
			
			raizX = (-b + Math.sqrt(delta)) / (2.0 * a);
			
			raizY = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("Primeira raiz: %.5f%nSegunda raiz: %.5f%n", raizX,raizY);
		
			
		}
		
		
		dados.close();

	}

}
