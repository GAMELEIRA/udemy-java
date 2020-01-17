package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 17/01/2019
 * HORA: 02:44  
 * FINALIDADE DO PROGRAMA: CALCULAR O VALOR A SER PAGO NA COMPRA DE PECAS DE ROUPAS
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner dados;

		int codPeca1, codPeca2;

		int quantPeca1, quantPeca2;

		double valorPeca1, valorPeca2;

		double valorTotalPagar;

		dados = new Scanner(System.in);

		System.out.println("Informe o codigo da peça 1: ");

		codPeca1 = dados.nextInt();

		System.out.println("Informe a quantidade de peças que irá comprar: ");

		quantPeca1 = dados.nextInt();

		System.out.println("Informe o valor unitário da peça: ");

		valorPeca1 = dados.nextDouble();

		System.out.println("Informe o codigo da peça 2: ");

		codPeca2 = dados.nextInt();

		System.out.println("Informe a quantidade de peças que irá comprar: ");

		quantPeca2 = dados.nextInt();

		System.out.println("Informe o valor unitário de cada peça: ");

		valorPeca2 = dados.nextDouble();
		
		valorTotalPagar = quantPeca1 * valorPeca1 + quantPeca2 * valorPeca2;
		
		System.out.printf("Entrada : %d,%d,%.2f,%d,%d,%.2f. %nSaida: Valor a pagar = %.2f",
				codPeca1,quantPeca1, valorPeca1,codPeca2,quantPeca2, valorPeca2,valorTotalPagar);

		dados.close();

	}

}
