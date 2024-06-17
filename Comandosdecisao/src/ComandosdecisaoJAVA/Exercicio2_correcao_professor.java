/*
  
CRIE UM ALGORITIMO QUE LEIA DOIIS NUMEROS 
E APRESENTE A DIFERENÇA ENTRE ELES
 */

package ComandosdecisaoJAVA;

import javax.swing.JOptionPane;

public class Exercicio2_correcao_professor {

	public static void main(String[] args) {
		
		int numero1, numero2, diferenca;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero: "));
		
		//if SE
		if(numero1 >= numero2) {
			
			diferenca = numero1 - numero2;
			//else - SE NAO
		}else {
			
			diferenca = numero2 - numero1;
		}
		
		System.out.println("--------------Resposta Exercicio--------------");
		System.out.println("\n\nNumero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);
		System.out.println("diferenca: " + diferenca);
	}
}
