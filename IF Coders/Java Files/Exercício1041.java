package ifCoders;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Exercício1041 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double x = tec.nextDouble();
        double y = tec.nextDouble();
        
        quadrante( x, y );
        
    }
    
    private static void quadrante(double x, double y){
        
        if( x == 0 && y == 0 ){
            System.out.println( "Origem" );
        }else if( x > 0 ){
            if( y < 0 ){
                System.out.println( "Q4" );
            }else if( y == 0){
                System.out.println( "Eixo X" );
            }else{
                System.out.println( "Q1" );
            }
        }else if( y > 0 ){
            if( x < 0 ){
                System.out.println( "Q2" );
            }else if( x == 0){
                System.out.println( "Eixo Y" );
            }else{
                System.out.println( "Q1" );
            }
        }else if( x < 0 ){
            if( y < 0 ){
                System.out.println( "Q3" );
            }else if( y == 0){
                System.out.println( "Eixo X" );
            }else{
                System.out.println( "Q4" );
            }
        }else{
            if( x < 0 ){
                System.out.println( "Q3" );
            }else if( x == 0){
                System.out.println( "Eixo Y" );
            }else{
                System.out.println( "Q4" );
            }
        }
        
    }
}
