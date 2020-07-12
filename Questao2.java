package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	public static void main (String [] args) {
		Scanner leitura = new Scanner (System.in);
	
		System.out.println("Digite um número de 1 a 7:");
        int n = leitura.nextInt();
    
	int nota[] = new int[7]; 
	while (n != 0)  {
		for (int i = 0; i < 7; i++) {
			if (n == 1) {
				System.out.println("DO");
			} else if ( n == 2) {
				System.out.println("RE");
			} else if (n == 3) {
				System.out.println("MI");
			} else if (n == 4) {
				System.out.println("FA");
			} else if (n == 5) {
				System.out.println("SOL");
			} else if (n == 6) {
				System.out.println("LA");
			} else if (n == 7) {
				System.out.println("SI");
			}
		}
	}
	 leitura.close();
	}
}
