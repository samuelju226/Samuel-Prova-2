package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
     public static void main (String [] args) {
    	 

 		Scanner leitura = new Scanner(System.in);
 		
 		int[] apart1 = new int[12];
 		int menor = 0;
 		int maior = 0;
 		
 		for (int i = 0; i < 12; i++) {
 			System.out.println("Digite o valor das contas do ["+ i +"]1 apartamento:");
 			int conta = leitura.nextInt();
 			apart1[i] = conta;
 			
 			if (i == 0) {
 				menor = conta;
 				maior = conta;
 			} else if (conta < menor) {
 				menor = conta;
 			} else if (conta > maior) {
 				maior = conta;
 			}
 		}
 		
 		int soma = 0;
 		int cont = 0;
 		for (int i = 0; i < 12; i++) {
 			if (apart1[i] == menor || apart1[i] == maior) {
 				continue;
 			}
 			soma += apart1[i];
 			cont++;
 		}

 	
 		  
 		int[] apart2 = new int[12];
 		int menor2 = 0;
 		int maior2 = 0;
 		
 		for (int i = 0; i < 12; i++) {
 			System.out.println("Digite o valor das contas do ["+ i +"] 2 apartamento:");
 			int conta = leitura.nextInt();
 			apart2[i] = conta;
 			
 			if (i == 0) {
 				menor2 = conta;
 				maior2 = conta;
 			} else if (conta < menor2) {
 				menor2 = conta;
 			} else if (conta > maior2) {
 				maior2 = conta;
 			}
 		}
 		
 		int soma2 = 0;
 		int cont2 = 0;
 		for (int i = 0; i < 12; i++) {
 			if (apart2[i] == menor || apart2[i] == maior) {
 				continue;
 			}
 			soma2 += apart2[i];
 			cont2++;
 		}
 			int media = soma / cont;
 		
 		System.out.println("A menor conta 1 apartamento  é: "+ menor);
 		System.out.println("A maior conta 1 apartamentoé: "+ maior);
 		System.out.println("A média 1 apartamento é: " + media);
 		
 		int media2 = soma2 / cont2;
 		System.out.println("A menor conta 2 apartamento é: "+ menor2);
 		System.out.println("A maior conta 2 apartamento é: "+ maior2);
 		System.out.println("A média 2 apartamento é: " + media2);
 	
     
     leitura.close();
     
     }
 } 
