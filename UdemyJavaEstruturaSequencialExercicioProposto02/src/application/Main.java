package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:17/01/2019
 * HORA:01:47
 * FINALIDADE DO PROGRAMA: APRESENTAR A ÁREA DE UM CIRCULO
 */


public class Main {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		double raio; //VALOR DO RAIO DO CIRCULO
		
		double area; //AREA DE UM CIRCULO
		
		Scanner dados;
		
		dados = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio do circulo: ");
		
		raio = dados.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("Entrada : %.2f %nSaida: Área = %.2f" , raio,area);
		
		dados.close();
		
		
	}

}
