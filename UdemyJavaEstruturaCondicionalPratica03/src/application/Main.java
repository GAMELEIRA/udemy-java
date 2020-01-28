package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS DATA:28/01/2020 HORA: 14:53 FINALIDADE:
 * LER TRES NUMEROS E IDENTIFICAR ENTRE ELES QUAL O MENOR.
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner dados;

		int num1, num2, num3;

		dados = new Scanner(System.in);

		System.out.println("Informe o primeiro numero:");

		num1 = dados.nextInt();

		System.out.println("Informe o segundo numero:");

		num2 = dados.nextInt();

		System.out.println("Informe o terceiro numero:");

		num3 = dados.nextInt();

		if (num1 < num2 && num1 < num3) {

			System.out.println("MENOR = " + num1);

		} else {

			if (num2 < num3 && num2 < num1) {

				System.out.println("MENOR = " + num2);

			} else if (num3 < num1 && num3 < num1) {

				System.out.println("MENOR = " + num3);

			} else {
				
				System.out.println("MENOR = " + num1);

			}
		}

		dados.close();

	}

}
