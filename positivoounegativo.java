public class positivoounegativo {
    
// Função que recebe um argumento e retorna 'P' ou 'N'
    
public static char verificaNumero(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
    
// Exemplo de uso da função verificaNumero
        
        int num = -1; 
        
        char resultado = verificaNumero(num);
        
        System.out.println("O resultado é: " + resultado);
    }
}
