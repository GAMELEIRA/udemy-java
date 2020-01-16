package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 16:41
 * HORA:18:41
 * FINALIDADE DO PROGRAMA: REALIZAR O CALCULO DE METROS QUADRADOS DE UM TERRENO E SEU VALOR
 */

public class Main {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US); //CONFIGURA O PROGRAMA PARA O PADRAO USA
		
		Scanner dados; //PEGA VALORES DO USUARIO 
		
		float largura; //LARGURA DO TERRENO 
		
		float comprimento; //COMPRIMENTO DO TERRENO 
		
		float terreno; //TAMANHO DO TERRENO
		
		float metroQuadrado; //VALOR DO METRO QUADRADO
		
		double valorTerreno; //VALOR MONETARIO DO TERRENO
		
		dados = new Scanner(System.in);
		
		System.out.println("Informar a largura do terreno:");
		
		largura = dados.nextFloat();
		
		System.out.println("Informar o comprimento do terreno:");
		
		comprimento = dados.nextFloat();
		
		terreno = largura * comprimento;
		
		System.out.println("Informar valor do metro quadrado: ");
		
		metroQuadrado = dados.nextFloat();
		
		valorTerreno = terreno * metroQuadrado;
		
		System.out.printf("O terreno possui %.2f metros quadrados "
				+ "e o preço é de $ %.2f", terreno, valorTerreno);
		
		dados.close();
	}

}
