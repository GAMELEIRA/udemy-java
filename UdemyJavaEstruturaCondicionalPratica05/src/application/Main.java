package application;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 30/01/2020
 * HORA: 18:41
 * FINALIDADE DO PROGRAMA: APRESENTAR UM DIA DA SEMANA CONFORME O VALOR INFORMADO PELO USUARIO
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner dados;

		byte dia;

		dados = new Scanner(System.in);

		System.out.println("Informe um valor de um a sete: ");

		dia = dados.nextByte();

		switch (dia) {

		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda-feira");
			break;

		case 3:
			System.out.println("Terça-feira");
			break;

		case 4:
			System.out.println("Quarta-feira");
			break;

		case 5:
			System.out.println("Quinta-feira");
			break;

		case 6:
			System.out.println("Sexta-feira");
			break;

		case 7:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Valor inválido");

		}

		dados.close();

	}

}
