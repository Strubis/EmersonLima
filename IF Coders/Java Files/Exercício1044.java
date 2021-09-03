package ifCoders;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Exercício1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        
        if( num1 >= num2 ){
            multi( num1, num2 );
        }else{
            multi( num2, num1 );
        }
        
    }
    
    private static void multi(int value1, int value2){
        if( value1 % value2 == 0 ){
            System.out.println( "Sao Multiplos" );
        }else{
            System.out.println( "Nao sao Multiplos" );
        }
    }
}
