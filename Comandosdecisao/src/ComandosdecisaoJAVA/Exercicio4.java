package ComandosdecisaoJAVA;

import java.security.SecureRandom;

public class Exercicio4 {
    
    private static final String CARACTERES_PERMITIDOS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
    private static final int TAMANHO_SENHA = 12; // Tamanho da senha desejada
    
    public static void main(String[] args) {
        String senhaGerada = gerarSenha();
        System.out.println("Senha gerada: " + senhaGerada);
    }
    
    public static String gerarSenha() {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder();
        
        // Gera a senha com base nos caracteres permitidos
        for (int i = 0; i < TAMANHO_SENHA; i++) {
            int indice = random.nextInt(CARACTERES_PERMITIDOS.length());
            senha.append(CARACTERES_PERMITIDOS.charAt(indice));
        }
        
        return senha.toString();
    }
}
