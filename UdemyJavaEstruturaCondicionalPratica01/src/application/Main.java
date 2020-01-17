package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS DATA: 17/01/2020 HORA:17:08 FINALIDADE DO
 * PROGRAMA: LER AS NOTAS DO ALUNO, APRESENTAR A MEDIA E O SE SERA OU NÃO
 * APROVADO
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		float nota1, nota2, media;

		boolean resultado;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informar a primeira nota:");

		nota1 = dados.nextFloat();

		System.out.println("Informar a segunda nota:");

		nota2 = dados.nextFloat();

		media = nota1 + nota2 ;

		resultado = (media > 60);

		if (resultado) {

			System.out.printf("Aprovado(a).%nNota: %s", media);

		} else {
			
			System.out.printf("Reprovado(a).%nNota: %s", media);
			
		}

		dados.close();

	}

}
