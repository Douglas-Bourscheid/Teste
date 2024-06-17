package ComandosdecisaoJAVA;

import javax.swing.JOptionPane;

public class Switch_exemplo_2 {
	
	public static void main(String[] args) {
		
		int mes = 5;
		
		//Recebendo o nome da fruta e armazenando na variavel=
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês entre 1 e 12"));
				
		//Switch - avalia o valor de uma variavel e dependendo do resultado
		// ele entra em um caso e executa a ação
		//switch - selecione caso
		switch(mes) {
		
		//caso
		case 1: case 2:case 3: case 4: case 5:
			
			System.out.println("O mês esta entre 1 e 5");
		
			//break - encerrar programa
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("O mês esta entre 6 e 10");
			
			//break - encerrar programa
			break;
			
			
		case 11:
		case 12:
			System.out.println("Mês 11 ou 12");
			
			//break - encerrar programa
			break;
			
			//Outro caso
			default:
			System.out.println("Mês invalido");
		}
		
	}

}
