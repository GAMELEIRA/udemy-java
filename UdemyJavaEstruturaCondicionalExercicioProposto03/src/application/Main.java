package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:29/01/2020
 * HORA:18:33
 * FINALIDADE DO PROGRAMA: INDICAR SE DOIS NUMEROS S�O OU N�O MULTIPLOS
 */

public class Main {

	public static void main(String[] args) {

		int num1, num2, resultado;

		boolean multiplos = false;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero:");

		num1 = dados.nextInt();

		System.out.println("Informe o segundo n�mero:");

		num2 = dados.nextInt();

		if (num1 < num2) {

			resultado = num2 % num1;
			
			multiplos = resultado == 0;

		} else {

			resultado = num1 % num2;
			
			multiplos = resultado == 0;

		}

		if (multiplos) {

			System.out.println("S�o multiplos.");

		} else {

			System.out.println("N�o s�o multiplos.");

		}

	}

}
