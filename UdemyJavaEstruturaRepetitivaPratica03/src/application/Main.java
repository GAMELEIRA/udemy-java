package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:01/02/2020
 * HORA:21:12
 * FINALIDADE DO PROGRAMA: APRESENTA A SOMA DE VARIOS VALORES
 */

public class Main {

	public static void main(String[] args) {

		int quant, soma;
		
		Scanner dados;
		
		dados = new Scanner(System.in);
		
		soma = 0;
		
		System.out.println("Informe a quantidade de números que irá informar:");
		
		quant = dados.nextInt();
		
		for(int i = 0; i < quant; i++) {
			
			System.out.println("Informe um número:");
			
			soma += dados.nextInt(); 
			
		}
		
		System.out.println(soma);
		
		dados.close();
		
	}
}
