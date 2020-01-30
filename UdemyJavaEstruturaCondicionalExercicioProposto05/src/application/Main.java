package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS 
 * DATA:29/01/2020 
 * HORA:20:28
 * FINALIDADE DO PROGRAMA: LER O COD DE UM PRODUTO E A QUANTIDADE DESTE ITEM E APRESENTAR A QUANTIDADE A SER PAGA.
 */

public class Main {

	public static void main(String[] args) {

		byte cod;

		int quantItem;

		float resultado = 0;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informe o cod:");

		cod = dados.nextByte();

		System.out.println("Informe a quantidade de itens:");

		quantItem = dados.nextInt();

		switch (cod) {

		case 1:
			resultado = quantItem * 4.00f;
			break;

		case 2:
			resultado = quantItem * 4.50f;
			break;

		case 3:
			resultado = quantItem * 5.00f;
			break;

		case 4:
			resultado = quantItem * 2.00f;
			break;

		case 5:
			resultado = quantItem * 1.50f;
			break;

		}
		
		System.out.println("Você deverá pagar " + resultado);

	}

}
