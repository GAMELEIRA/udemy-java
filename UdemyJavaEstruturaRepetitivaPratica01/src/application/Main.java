package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:01/02/2020
 * HORA:17:06
 * FINALIDADE DO PROGRAMA: APRESENTAR AO USUARIO SE OS VALORES FORAM INFORMADOS DE FORMA CRESCENTE OU DECRESCENTE
 */

public class Main {

	public static void main(String[] args) {

		long x, y;

		Scanner dados;

		dados = new Scanner(System.in);

		do {

			System.out.println("Informe o valor de x");

			x = dados.nextLong();

			System.out.println("Informe o valor de y");

			y = dados.nextLong();

			if (x > y) {

				System.out.println("Ordem decrescente!");

			} else if (y < x) {

				System.out.println("Ordem crescente!");

			}

		} while (x != y);

	}

}
