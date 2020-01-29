package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:29/01/2019 
 * HORA:18:33
 * FINALIDADE DO PROGRAMA: INDICAR SE DOIS NUMEROS SÃO OU NÃO MULTIPLOS
 */

public class Main {

	public static void main(String[] args) {

		int num1, num2, resultado;

		boolean multiplos = false;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informe o primeiro número:");

		num1 = dados.nextInt();

		System.out.println("Informe o segundo número:");

		num2 = dados.nextInt();

		if (num1 < num2) {

			resultado = num2 % num1;
			
			multiplos = resultado == 0;

		} else {

			resultado = num1 % num2;
			
			multiplos = resultado == 0;

		}

		if (multiplos) {

			System.out.println("São multiplos.");

		} else {

			System.out.println("Não são multiplos.");

		}

	}

}
