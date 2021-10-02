package ifCoders;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Exercício1048 {
    private static int p;
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            double salario = scanner.nextDouble();
            double aumentoSal = aumento( salario );
            
            System.out.printf( "Novo salario: %.2f\n", ( salario + aumentoSal ) );
            System.out.printf( "Reajuste ganho: %.2f\n", aumentoSal );
            System.out.println( "Em percentual: " + p + " %" );
        }
    }
    
    public static double aumento(double salario){
        double aumento = 0;
        
        if( salario > 0 && salario <= 400.00 ){
            aumento = salario * 0.15;
            p = 15;
        }else if( salario > 400.00 && salario <= 800.00 ){
            aumento = salario * 0.12;
            p = 12;
        }else if( salario > 800.00 && salario <= 1200.00 ){
            aumento = salario * 0.10;
            p = 10;
        }else if( salario > 1200.00 && salario <= 2000.00 ){
            aumento = salario * 0.07;
            p = 7;
        }else if( salario > 2000.00 ){
            aumento = salario * 0.04;
            p = 4;
        }
        
        return aumento;
    }
    
}
