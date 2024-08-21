
import java.sql.Savepoint;

public class somadetresnumeros{

    public static int soma(int a , int b , int c){
        return a + b + c;
    
}

public static void main(String[]args){
    
    int num1 = 5; 
    int num2 = 10;
    int num3 = 15;

    int resultado = soma(num1 ,num2 ,num3 );

    System.out.println("a soma dos números é : " + resultado);
   }    
}
