package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:17/01/2019 
 * HORA: 02:24
 * FINALIDADE DO PROGRAMA: APRESENTAR O SALARIO DE UM FUNCIONARIO BASEANDO-SE EM DADOS DISPONIBILIZADOS 
 */

public class Main {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner dados;
		
		int numeroFuncionario;
		
		double horasTrabalhadas;
		
		double valorRecebeHora;
		
		double salario;
		
		dados = new Scanner(System.in);
		
		System.out.println("Informe o numero do funcionario:");
		
		numeroFuncionario = dados.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas:");
		
		horasTrabalhadas = dados.nextDouble();
		
		System.out.println("Informe o valor que ele recebe por horas trabalhadas:");
		
		valorRecebeHora = dados.nextDouble();
		
		salario = horasTrabalhadas * valorRecebeHora; 
		
		System.out.printf("Entrada: %d, %.2f, %.2f. %nSaida: Number = %d, Salary = $ %.2f",
				numeroFuncionario, horasTrabalhadas, valorRecebeHora, numeroFuncionario, salario);
	
		dados.close();
		
	}

}
