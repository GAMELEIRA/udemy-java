package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS DATA: 29/01/2020 HORA: 23:29 FINALIDADE
 * DO PROGRAMA: DETERMINAR O QUADRANTE AO QUAL PERTENCE UM PONTO, OU SE ESTA
 * SOBRE EIXOS CARTESIANOS OU NA ORIGEM.
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double x, y;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informe o valor do ponto X:");

		x = dados.nextDouble();

		System.out.println("Informe o valor de Y");

		y = dados.nextDouble();

		if (x > 0 && y > 0) {

			System.out.println("Esta no Q1.");

		} else if (x < 0 && y > 0) {

			System.out.println("Esta no Q2.");

		} else if (x < 0 && y < 0) {
			
			System.out.println("Esta no Q3.");
			
		} else if (x > 0 && y < 0) {
			
			System.out.println("Esta no Q4");
			
		} else {
			
			System.out.println("Esta na origem.");
			
		}

	}

}
