package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:17/01/2020 
 * HORA:13:13
 * FINALIDADE DO PROGRAMA: LER VALORES E EXIBIR A AREA DE VARIAS FORMAS GEOMETRICAS
 */

public class Main {

	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		double valorA;
		
		double valorB;
		
		double valorC;
		
		double areaTriangulo;
		
		double areaCirculo;
		
		double areaTrapezio;
		
		double areaQuadrado;
		
		double areaRetangulo;
		
		Scanner dados;
	
		dados = new Scanner(System.in);
		
		System.out.println("Informe o valor A:");
		
		valorA = dados.nextDouble();
		
		System.out.println("Informe o valor B:");
		
		valorB = dados.nextDouble();
		
		System.out.println("Informe o valor C:");

		valorC = dados.nextDouble();
		
		areaTriangulo = valorA * valorC / 2 ;
		
		areaCirculo = Math.PI * Math.pow(valorC, 2);
		
		areaTrapezio = (valorA + valorB) * valorC / 2 ;
		
		areaQuadrado = Math.pow(valorB, 2);
		
		areaRetangulo = valorA * valorB;
		
		System.out.printf("Entrada: %.2f, %.2f, %.2f %nSaida: Triangulo: %.2f, Circulo: %.2f, Trapezio: %.2f, Quadrado: %.2f, Retangulo %.2f ",
				valorA,valorB,valorC,areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo);
		
		
		
	}
	
}
