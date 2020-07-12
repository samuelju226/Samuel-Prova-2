package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	public static void main (String [] args) {
      Scanner leitura = new Scanner(System.in);
		
		
		float salario [] = new float [150];
		float media = 0; 
		float aumentosalario = 0;
		
		for(int i = 0; i < 150; i++ ) {
			
			salario[i] = leitura.nextFloat();
			
			if(media == 0) {
				
				media = salario[i];
				
			}else {
				media = salario[i] + media;
			}
				
				}	
			
			media = (media/150f);
			aumentosalario = (media * 1.15f);
			
			System.out.println("A média do salario é: " + media);
			System.out.println("A média do salário e aumento é: " + aumentosalario);
		leitura.close();
	}
	}

