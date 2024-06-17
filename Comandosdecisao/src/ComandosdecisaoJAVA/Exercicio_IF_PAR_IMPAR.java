/*
 Crie um algoritimo que leia um numero e verifique se ele é PAR ou Ímpar
 */

package ComandosdecisaoJAVA;

import java.util.Scanner;

public class Exercicio_IF_PAR_IMPAR {

	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		int numero;
		
		//Imprime a mensagem na tela
		System.out.println("Digite um numero inteiro");
		
		//nextInt - lê o texto e retorna como inteiro na variavel 
		numero = objetoNumero.nextInt();
		
		//IF - se
		// % ele divide com sinal == 0
		if(numero % 2 ==0 ) {
			
			System.out.println("Numero" + numero + ", PAR");
		}
		else {
			System.out.println("Numero" + numero + ", IMPAR");
		}
	}
	
}
