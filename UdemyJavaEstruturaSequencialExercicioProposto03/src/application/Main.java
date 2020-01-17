package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:17/01/2019
 * HORA: 02:04
 * FINALIDADE DO PROGRAMA: LER QUATRO VALORES E MOSTRAR A DIFERENCA.
 */


public class Main {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);

		Scanner dados;
		
		int a,b,c,d,diferenca; //VALORES INFORMADO PELOS USUARIOS
		
		dados = new Scanner(System.in);

		System.out.println("Informe o valor de a: ");
		
		a = dados.nextInt();
		
		System.out.println("Informe o valor de b: ");
		
		b = dados.nextInt();
		
		System.out.println("Informe o valor de c: ");

		c = dados.nextInt();
		
		System.out.println("Informe o valor de d: ");
		
		d = dados.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.printf("Entrada: %d,%d,%d,%d. %nSaida: %d", a,b,c,d,diferenca);
		
		
	}

}
