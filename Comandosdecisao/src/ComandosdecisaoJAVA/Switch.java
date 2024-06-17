package ComandosdecisaoJAVA;

import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		
		String fruta;
		
		//Recebendo o nome da fruta e armazenando na variavel=
		fruta = JOptionPane.showInputDialog("Digite o nome de uma frurta");
		
		//Switch - avalia o valor de uma variavel e dependendo do resultado
		// ele entra em um caso e executa a ação
		//switch - selecione caso
		switch (fruta) {
		
		//case - caso
		case "Banana":	
			
			System.out.println("Você digitou banana!");
			
			//break- encerrar o programa
			break;
			
		case "Laranja":	
			
			System.out.println("Você digitou Laranja!");
			
			//break- encerrar o programa
			break;
			
		case "Uva":	
			
			System.out.println("Você digitou Uva!");
			
			//break- encerrar o programa
			break;
			
		default:
			System.out.println("Você não digitou uma fruta valida!");
			
			break;
		
		}
		
		
		
	}
}
