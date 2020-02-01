package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS DATA:01/02/2020 HORA:17:41 FINALIDADE DO
 * PROGRAMA:
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		byte idade, somaIdades = 0;
		
		long cont = 0;
		
		float idadeMedia = 0;

		Scanner dados;

		dados = new Scanner(System.in);

		do {

			System.out.println("Informe sua idade: ");

			idade = dados.nextByte();

			if (idade >= 0) {

				somaIdades += idade;
				
				cont++;
				
			} else if(idade < 0 && cont == 0) {
				
				System.out.println("Impossivel calcular.");
				
				break;
				
			} else {
				
				idadeMedia = (float)somaIdades / (float)cont;  
				
				System.out.printf("Idade media %.2f. " , idadeMedia);
				
			}
			
			
		} while (idade >= 0);

		dados.close();
	}
}