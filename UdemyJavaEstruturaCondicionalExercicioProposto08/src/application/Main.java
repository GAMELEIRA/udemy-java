package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:30/01/2020 
 * HORA:00:31
 * FINALIDADE DO PROGRAMA: CALCULAR O IMPOSTO DE RENDA 
 */

public class Main {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		double salario, imposto;
		
		Scanner dados;
		
		dados = new Scanner(System.in);
		
		System.out.println("Informe o salario:");
		
		salario = dados.nextDouble();
		
		dados.close();
		
		if (salario <= 2000.00) {
			
			imposto = 0.0;
			
		} else if (salario <= 3000.00) {
			
			imposto = (salario - 2000.0) * 0.8;
			
			System.out.println(imposto);
			
		} else if (salario <= 4500.00) {
			
			imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08; 
			
			System.out.println(imposto);
			
			
		} else {
			
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			
			System.out.println(imposto);
			
		}
	
	}

}
