package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS 
 * DATA:01/02/2020 
 * HORA:19:30 
 * FINALIDADE DO PROGRAMA:APRESENTAR AO USUARIO AS PREFERENCIAS DE COMPRA DE TIPOS DE GASOLINA
 */

public class Main {

	public static void main(String[] args) {

		Scanner dados;

		dados = new Scanner(System.in);

		byte combustivel;

		int alcool = 0, gasolina = 0, diesel = 0;

		do {

			System.out.println("Informe o tipo de combustivel que deseja abastecer: ");

			combustivel = dados.nextByte();

			if (combustivel == 1) {

				alcool++;
				
				System.out.println("Alcool:"+alcool);

			} else if (combustivel == 2) {

				gasolina++;

				System.out.println("Gasolina:"+gasolina);
				
			} else if (combustivel == 3) {

				diesel++;
				
				System.out.println("Diesel:"+diesel);

			} else if (combustivel == 4) {

				System.out.println("Muito obrigado!");
				
				System.out.println("Alcool:"+alcool);
				
				System.out.println("Gasolina:"+gasolina);
				
				System.out.println("Diesel:"+diesel);

				break;
			}

		} while (combustivel != 4);

		dados.close();

	}

}
