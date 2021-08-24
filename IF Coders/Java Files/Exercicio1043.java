package ifCoders;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Exercicio1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // A, B and C
        double[] numbers = new double[3];
        
        // Read
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
        
        // Is it a triangle? Yes: shows the perimeter, No: shows the trapeze area
        if( isTriangle(numbers) ){
            double per = numbers[0] + numbers[1] + numbers[2];
            System.out.printf( "Perimetro = %.1f\n", per );
        }else{
            double area = ( ( numbers[0] + numbers[1] ) * numbers[2] ) / 2;
            System.out.printf( "Area = %.1f\n", area );
        }
        
    }
    
    private static boolean isTriangle(double[] numbers){
        return ( numbers[0] + numbers[1] ) > numbers[2] && 
                ( numbers[0] + numbers[2] ) > numbers[1] &&
                ( numbers[1] + numbers[2] ) > numbers[0];
    }
}
