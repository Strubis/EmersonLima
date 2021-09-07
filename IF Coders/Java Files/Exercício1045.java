package ifCoders;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Exercício1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Double[] sides = new Double[3];
        
        for (int i = 0; i < sides.length; i++) {
            sides[i] = scanner.nextDouble();
        }
        
        Arrays.sort( sides, new Comparator<Double>(){
            @Override
            public int compare(Double d1, Double d2){
                return d2.compareTo( d1 );
            }
        });
        
        if( isTriangle(sides) ){
            powSides( sides );
            whatTriangle( sides );
            sidesEquals( sides );
        }else{
            System.out.println( "NAO FORMA TRIANGULO" );
        }
        
    }
    
    private static boolean isTriangle(Double[] d){
        if( d[0] >= d[1] + d[2] ){
            return false;
        }
        
        return true;
    }
    
    private static void powSides(Double[] d){
        for (int i = 0; i < d.length; i++) {
            d[i] = Math.pow( d[i], 2 );
        }
    }
    
    private static void whatTriangle(Double[] d){
        if( d[0] == d[1] + d[2] ){
            System.out.println( "TRIANGULO RETANGULO" );
        }else if( d[0] > d[1] + d[2] ){
            System.out.println( "TRIANGULO OBTUSANGULO" );
        }else if( d[0] < d[1] + d[2] ){
            System.out.println( "TRIANGULO ACUTANGULO" );
        }
    }
    
    private static void sidesEquals(Double[] d){
        if( Objects.equals(d[0], d[1]) ){
            if( Objects.equals(d[0], d[2]) ){
                System.out.println( "TRIANGULO EQUILATERO" );
            }else{
                System.out.println( "TRIANGULO ISOSCELES" );
            }
        }else if( Objects.equals(d[0], d[2]) ){
            if( Objects.equals(d[0], d[1]) ){
                System.out.println( "TRIANGULO EQUILATERO" );
            }else{
                System.out.println( "TRIANGULO ISOSCELES" );
            }
        }else if( Objects.equals(d[1], d[2]) ){
            if( Objects.equals(d[1], d[0]) ){
                System.out.println( "TRIANGULO EQUILATERO" );
            }else{
                System.out.println( "TRIANGULO ISOSCELES" );
            }
        }
    }
}
