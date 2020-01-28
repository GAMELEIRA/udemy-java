package application;

import java.util.Scanner;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA:28/01/2019
 * HORA:15:51
 * FINALIDADE DO PROGRAMA: INDICAR SE O NUMERO E OU NAO NEGATIVO
 */


public class Main {

	public static void main(String[]args) {
		
		int numero;
		
		Scanner dados;
		
		dados = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		
		numero = dados.nextInt();
		
		if(numero < 0) {
			
			System.out.println("NUMERO NEGATIVO.");
			
		} else {
			
			System.out.println("NAO NEGATIVO.");
			
		}
	}
	
	
}
