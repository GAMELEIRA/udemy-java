package application;

import java.util.Scanner;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 30/01/2020
 * HORA:20:28
 * FINALIDADE DO PROGRAMA: LER NUMEROS INTEIROS ATE QUE SEJA INFORMADO PELO USUARIO O NUMERO 0
 * E APRESENTAR O RESULTADO DA SOMA DOS VALORE INFORMADOS
 */

public class Main {
	
	public static void main(String[]args) {
		
		int valor, soma = 0;
		
		Scanner dados;
		
		dados = new Scanner(System.in);
		
		do {
		
		System.out.println("Informe um número inteiro:");
		
		valor = dados.nextInt();
		
		soma += valor;
		
		} while(valor != 0);
		
		System.out.println("Soma dos números: " + soma);
		
		dados.close();
		
		
	}

}
