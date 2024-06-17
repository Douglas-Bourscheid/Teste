package ComandosdecisaoJAVA;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
	Scanner objetoNumero = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Digite o numero Inteiro");
	numero = objetoNumero.nextInt();
	
	if (numero % 2 == 0) {
	
	System.out.println("Numero" + numero + ", PAR");}
	
	else {
		System.out.println("Numero" + numero + ", IMPAR");
	}
	
		
	
	
	}
                     

}
