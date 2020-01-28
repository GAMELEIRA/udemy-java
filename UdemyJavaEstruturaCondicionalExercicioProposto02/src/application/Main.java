package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS DATA:28/01/2019 HORA:16:11 FINALIDADE DO
 * PROGRAMA: INDICAR SE UM NUMERO E IMPAR OU PAR
 */

public class Main {

	public static void main(String[] args) {

		int numero;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		
		numero = dados.nextInt();
		
		if(numero % 2 == 0) {
			
			System.out.println("Numero par.");
			
		} else {
			
			System.out.println("Numero impar.");
		}
		
		
		dados.close();

	}
}
