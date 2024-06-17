package ComandosdecisaoJAVA;

import javax.swing.JOptionPane;

public class Funcao_IF_ELSEIF_ELSE_OU_E {
	
	public static void main(String[] args) {
		
		/*
		 || = OU
		 && - E
		 */
		
		/*
		String fruta;
		
		//Ctrl + Barra de Espaço
		fruta = JOptionPane.showInputDialog("Digite o nome da fruta:");
		
		//if - SE
		if(fruta.equals("Maçã") || fruta.equals("Banana")) {
		
			JOptionPane.showMessageDialog(null, "A fruta é " + fruta);
			
	}else {
		JOptionPane.showMessageDialog(null, "Fruta invalida");
	}
}
*/
		//&& - E
		
		String fruta_1, fruta_2;
		
		//Recebendo os nomes das frutas e armazenando nas variaveis
		fruta_1 = JOptionPane.showInputDialog("Digite o nome da primeira fruta");
		fruta_2 = JOptionPane.showInputDialog("Digite o nome da segunda fruta");
		
		//if - SE
		if(fruta_1.equals("Maçã") && fruta_2.equals("Banana")) {
			/*JOptionPane.showMessageDialog(null, "fruta 1: " + fruta_1);
			JOptionPane.showMessageDialog(null, "fruta 2: " + fruta_2);
			*/
			System.out.println("A fruta 1 é Maçã e a Fruta 2 é Banana");
		}else {
		
			//JOptionPane.showMessageDialog(null, "Não é Maçã ou Banana: ");
			System.out.println("Você não digitou as duas frutas corretamente.");
			
		}
		
		
}}