package ifCoders;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Exercício1036 {
    public static void main(String args[]){
        // Criação das variáveis.
        double a, b, c;
        
        // Criação do leitor
        Scanner tec = new Scanner(System.in);
        
        // Leitura dos valores.
        a = tec.nextDouble();
        b = tec.nextDouble();
        c = tec.nextDouble();
        
        // Resultado.
        formBhaskara( a, b, c );
        
    }
    
    private static void formBhaskara(double a, double b, double c){
        // Cálculo do Delta
        double delta = Math.pow(b, 2) - ( 4 * a * c );
        
        // Cálculo das raízes
        double xPos = ( -b + Math.sqrt( delta ) ) / (2 * a);
        double xNeg = ( -b - Math.sqrt( delta ) ) / (2 * a);
        
        // Valor negativo, logo não tem raíz
        if( ( 2 * a ) == 0 || delta < 0 ){
            System.out.println("Impossivel calcular");
            return;
        }
        
        // Raízes existentes
        System.out.printf( "R1 = %.5f\n", xPos );
        System.out.printf( "R2 = %.5f\n", xNeg );
        
    }
}
