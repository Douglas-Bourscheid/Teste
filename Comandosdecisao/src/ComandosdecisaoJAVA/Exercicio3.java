package ComandosdecisaoJAVA;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
	
		int numero1, numero2;
		
		//RECEBE os numero e armazena nas variaveis
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		//IF SE
		if (numero1 > numero2) 
		{
			System.out.println(numero1 + "\n" + numero2);
			//else SE NÃO
		}else {
			System.out.println(numero2 + "\n" + numero1);
		}
	}
}
