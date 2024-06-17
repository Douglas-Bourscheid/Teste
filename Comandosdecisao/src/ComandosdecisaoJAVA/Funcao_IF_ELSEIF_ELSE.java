package ComandosdecisaoJAVA;

import java.util.Scanner;

public class Funcao_IF_ELSEIF_ELSE {
	
	public static void main(String[] args) {
		
		/*
		// Scanner objeto da classe "java.util.
		//System-in Le as informações do teclado
		Scanner objetoIdade = new Scanner(System.in);
		
		int idade;
		
		System.out.println("digite sua idade");
		
		//nextINT - le e retornar um numero inteiro
		idade = objetoIdade.nextInt();
		
		//if - SE
		if(idade >= 18 ) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("MMenor de idade");
		}
		 Exemplo media de ALUNO
		 
		 */
		// EXEMPLO MEDIA DE ALUNO
		
		Scanner objetoNota = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a nota 1");
		nota1 = objetoNota.nextDouble();  
		
		System.out.println("Digite a nota 2");
		nota2 = objetoNota.nextDouble(); 
		
		System.out.println("Digite a nota 3");
		nota3 = objetoNota.nextDouble(); 
		
		System.out.println("Digite a nota 4");
		nota4 = objetoNota.nextDouble(); 
		
		// calcula a media
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//if -se
		if (media >= 7 ) {
			System.out.println("Média: " + media + " - Sitauação: Aprovado(a)");
		
			//else if - senão se
		}else if (media >= 2) {
			System.out.println("Média: " + media + " - Sitauação: Recuperação");
		//else - se não
		}else {
			System.out.println("Média: " + media + " - Sitauação: Reprovado(a)");
			
		}
	}		
	}
