package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS 
 * DATA: 16/01/2020
 * HORA: 16:22
 * FINALIDADE DO PROGRAMA: EXERCITAR A ENTRADA DE DADOS, FUNCOES MATEMATICAS E A SAIDA
 */

public class Main {

	public static void main(String[]args) { 
		
		Scanner sc; 
		
		String x;
		
		int a;
		
		double b;
		
		char c;
		
		String d;
		
		double e;
		
		double f;
		
		double g; 
		
		Locale.setDefault(Locale.US);
		
		//Instancia classe Scanner que permite a entrada de dados pelo teclado
		sc = new Scanner(System.in);
		
		x = sc.next();
		
		a = sc.nextInt();
		
		b = sc.nextDouble();
		
		c = sc.next().charAt(0);
		
		sc.nextLine();
		
		d = sc.nextLine();
		
		e = Math.sqrt(12);
		
		f = Math.pow(2, 2);

		g = Math.abs(-2);
				
		System.out.println("Voc� digitou "+ x);
		
		System.out.println("Voc� digitou um n�mero inteiro: " + a);
		
		System.out.println("Voc� digitou um n�mero flutuante: " + b);
		
		System.out.println("Voc� digitou um caracte: " + c);

		System.out.println("Voc� digitou uma cadeia de caracteres: " + d);
		
		System.out.println("A raiz quadrada de 12 � : " + e);
		
		System.out.println("A potencia de 2 elevado a 2 � : " +  f);
		
		System.out.println("O valor absoluto de -2 � :" + g);
		
		sc.close();

	}
}