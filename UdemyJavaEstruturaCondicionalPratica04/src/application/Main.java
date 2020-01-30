package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS 
 * DATA:30/01/2020
 * HORA:17:34
 * FINALIDADE DO PROGRAMA: APRESENTAR O VALOR A SER PAGO POR UM USUARIO CONFORME O QUE FOR GASTO NO TELEFONE
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner dados;
		
		int minutosGastos;
		
		double valorPagar = 50.00;
		
		dados = new Scanner(System.in);
		
		System.out.println("Quantos minutos foram gastos no telefone?");

		minutosGastos = dados.nextInt();
		
		if(minutosGastos <= 100) {
			
			System.out.println("Valor a pagar é de " + valorPagar);
			
		} else {
			
			valorPagar += (minutosGastos - 100) * 2.00;
	
			System.out.println("Valor a pagar " + valorPagar);
			
		}
		
		dados.close();
		
	}

}
