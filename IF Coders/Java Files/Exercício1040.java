package ifCoders;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Exercício1040 {
    public static void main(String[] args) {
        Scanner tec = new Scanner( System.in );
        
        double[] values = new double[4];
        double[] w = { 0.2, 0.3, 0.4, 0.1 };
        
        double avg = 0.0;
        
        for( int i = 0; i < values.length; i++ ){
            values[i] = tec.nextDouble();
            avg += ( values[i] * w[i] );
        }
        
        System.out.printf( "Media: %.1f\n", avg );
        
        result( avg, tec );
        
    }
    
    public static void result(double avg, Scanner tec){
        
        if( avg >= 7.0 ){
            System.out.println( "Aluno aprovado." );
        }else if( avg < 7.0 && avg >= 5.0 ){
            System.out.println( "Aluno em exame." );
            
            double exam = tec.nextDouble();
            System.out.printf( "Nota do exame: %.1f\n", exam );
            
            avg = ( avg + exam ) / 2;
            
            if( avg >= 5.0 ){
                System.out.println( "Aluno aprovado." );
            }else{
                System.out.println( "Aluno reprovado." );
            }
            
            System.out.printf( "Media final: %.1f\n", avg );
        }else{
            System.out.println( "Aluno reprovado." );
        }
        
        
    }
}
