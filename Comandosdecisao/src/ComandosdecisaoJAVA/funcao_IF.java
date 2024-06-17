//package - pasta do projeto
package ComandosdecisaoJAVA;

//todo o programa java e uma classe
//o nome da classe é o mesmo nome do arquivo
//public - publico
//class - classe
public class funcao_IF {

	public static void main(String[] args) {
		
		int numero = 20;
		String nome = "Amanda";
		
		/*
		  == -igual- equals
		  != Diferente
		  > - maior
		  < - menor 
		  >= maior ou igual
		  <= menor ou igual
		 */
		
		//if - se - Ele condiciona um comando a uma condição qualquer, executando-o apenas se ela for verdadeira.
		if(numero >= 10) {
			
			System.out.println("O número é igual a 10");
		//else - Senão - permite ao programa avaliar uma expressão como sendo verdadeira ou falsa e, de acordo com o resultado dessa verificação, executar uma ou outra rotina.
			
		}else {
		
			System.out.println("O número é diferente  10");
			
	}
		if(nome.equals("Ana")) {
	
			System.out.println("O Nome é :" + nome  );
		//else - Senão
			
		}else {
		
			System.out.println("O Nome é invalido");}}}
	
	
