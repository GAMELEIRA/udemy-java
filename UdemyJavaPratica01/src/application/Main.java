package application;

import java.util.Locale;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:11/01/2020
 * HORA:14:10
 * FINALIDADE DO PROGRAMA: EXIBIR UMA MENSAGEM NA TELA.
 */

public class Main {

	//METODO QUE EXECUTA A APLICACAO JAVA
	public static void main(String[] args) {
		
		//DECLARACAO DE VARIAVEIS E CONFIGURACOES ADICIONAIS
		//==========================================
	
		int y;
		
		double x;
		
		String nome;
		
		int idade;
		
		double renda;
		
		Locale.setDefault(Locale.US); //DEFINE CONFIGURACOES NACIONAIS SOBRE PADRONIZACOES 
		
		//==========================================
		
		//ATRIBUICAO
		//===================================
		y = 32;
		
		x = 10.35784;
		
		nome = "Maria";
		
		idade = 31;
		
		renda  = 4000.0;
		
		//===================================
		
		System.out.printf("%.2f", x); 
		
		//REMOVA O SOUT, COMPILE E EXECUTE. A LINHA DE CIMA NAO SERA EXIBIDA.
		System.out.println();
		
		System.out.println(y +"\n"+ x);
		
		System.out.print("Olá, Mundo!");
		
		System.out.println(" Bom dia!");
		
		System.out.println("Resultado = " + x + " metros.");
		
		System.out.printf("Resultado = %.2f metros. \n", x);
			
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	
	}
}
