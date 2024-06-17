


package ComandosdecisaoJAVA;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		
		System.out.println("Digite o numero 1");
		numero1 = objetoNumero.nextInt();
		
		System.out.println("Digite o numero 2");
		numero2 = objetoNumero.nextInt();
		
		resultado= (numero1 - numero2);
		
		System.out.println("Valor final "  + resultado );
		
	
	}
}
