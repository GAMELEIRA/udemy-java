package application;

import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:29/01/2020
 * HORA:19:22
 * FINALIDADE DO PROGRAMA:LER O INICIO E FIM DE UM JOGO E SABER SEU TEMPO DE DURACAO
 */

public class Main {
	
		public static void main(String[]args) {
			
			int horaInicial, horaFinal, duracao = 0;
			
			int duracaoMin;
			
			int duracaoMax;
			
			Scanner dados;
			
			dados = new Scanner(System.in);
			
			duracaoMin = 1;
			
			duracaoMax = 24;
			
			System.out.println("Informar a hora inicial do jogo:");
			
			horaInicial = dados.nextInt();
			
			System.out.println("Informar a hora final do jogo:");
			
			horaFinal = dados.nextInt();
			
			if(horaFinal > horaInicial) {
				
				duracao = horaFinal - horaInicial;
				
			} else {
				
				duracao =  24 - horaInicial; 
				
				duracao += horaFinal; 
				
			}
			
			if(duracao > duracaoMin && duracao <= duracaoMax) {
				
				System.out.println("O jogo durou:" + duracao +  " horas.");
				
			} else {
				
				System.out.println("Não é possivel calcular pois os momentos não respeitaram o min e max de duração de um jogo.");
				
			}
			
		}

}
