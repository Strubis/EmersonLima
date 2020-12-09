package array;

import java.util.Scanner;

/**
 * Partindo dos conceitos de array de uma dimensão, peça ao usuário o tamanho do 
 * array e dois valores do tipo “float”, atribua a soma desses dois valores em 
 * todas as posições do array. Após isso, imprimir o array com todos os valores.
 *
 * @since 09/12/2020
 * @see classe
 * @author Emerson
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Tamanho do array: ");
        int tamanho = tec.nextInt();
        double[] array = new double[tamanho];
        
        double valor1, valor2;
        System.out.print("Valor 1: ");
        valor1 = tec.nextDouble();
        System.out.print("Valor 2: ");
        valor2 = tec.nextDouble();
        
        for (int i = 0; i < tamanho; i++) {
            array[i] = valor1 + valor2;
        }
        
        for(Double d : array){
            System.out.print(d + " ");
        }
        
        System.out.println();
    }
}
