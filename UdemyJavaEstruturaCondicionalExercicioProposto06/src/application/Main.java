package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 29/01/2020 
 * HORA:22:43
 *  FINALIDADE DO PROGRAMA: LER UM NUMERO E APRESENTAR EM UM INTERVALO DE NUM
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		double valorInformado;
		
		Scanner dados;
		
		dados = new Scanner(System.in);
		
		System.out.println("Informe um valor.");
		
		valorInformado = dados.nextDouble();
		
		if (valorInformado <= 25 && valorInformado >= 0) {
			
			System.out.println("Intervalor [0, 25]");
			
		} else if(valorInformado >=25 && valorInformado <=50) {
			
			System.out.println("Intervalo [25, 50]");
			
		} else if(valorInformado >= 50 && valorInformado <=75) {
			
			System.out.println("Intervalo [50, 75]");
			
		} else if(valorInformado >= 75 && valorInformado <=100) {
			
			System.out.println("Intervalo [75, 100]");
			
		} else {
			
			System.out.println("Fora do intervalo.");
			
		}
		
		dados.close();
	
	}

}
