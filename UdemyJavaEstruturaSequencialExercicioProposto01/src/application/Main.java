package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:16/01/20
 * HORA: 19:57 
 * FINALIDADE DO PROGRAMA: LER NUMEROS INFORMADOS PELO USUARIO E APRESENTAR NA TELA A SOMA DESSES VALORES
 */

public class Main {
	
	public static void main(String[]args) {
		
		int primeiroValor;
		
		int segundoValor;
		
		int resultado; //RESULTADO DA SOMA
		
		Scanner dados;
		
		dados = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		
		primeiroValor = dados.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		
		segundoValor = dados.nextInt();
		
		resultado = primeiroValor + segundoValor;
		
		System.out.printf("Entrada: %d, %d. %nSaida: %d" , primeiroValor, segundoValor, resultado);
		
		dados.nextInt();
		
		dados.close();
		
		
	}

}
