package exercicios;

import java.util.Scanner;

/**
 * De acordo com o raio, dê a área e a circunferência.
 * 
 * @author Emerson
 */
public class AreaCirc {
    public static double pi = 3.1415;
    
    public static void main(String[] args) {
        try( Scanner tec = new Scanner( System.in ) ){
            double raio = tec.nextDouble(); //Pegando o raio
            
			//Imprimindo o valor com a chamada da função
            System.out.printf("Area: %.3f\n", area( raio ) ); 
            System.out.printf("Circunferencia: %.3f\n",
                    circunferencia( raio ) );
        }
    }
    
	//Cálculo da função da área
    public static double area(double raio){
        return (raio * raio) * pi;
    }
    
	//Cálculo da função da circunferência
    public static double circunferencia(double raio){
        return 2 * pi * raio;
    }
}
