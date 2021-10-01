package ifCoders;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Exercício1046 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int val1 = scanner.nextInt();
            int val2 = scanner.nextInt();
            
            if( val1 == val2 ){
                System.out.println( "O JOGO DUROU 24 HORA(S)" );
            }else if( val1 > val2 ){
                int hour = ( 24 - val1 ) + val2;
                
                System.out.println( "O JOGO DUROU " + hour + " HORA(S)" );
            }else{
                int hour = val2 - val1;
                
                System.out.println( "O JOGO DUROU " + hour + " HORA(S)" );
            }
            
        }
    }
}
