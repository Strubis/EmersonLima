package array;

import java.util.Scanner;

/**
 * Partindo agora do conceito de arrays multidimensionais, dado um array de duas
 * dimensões (3x3), do tipo inteiro, peça para o usuário escrever os valores em 
 * cada posição da matriz. Depois imprima cada elemento da matriz.
 * 
 * @since 09/12/2020
 * @see classe
 * @author Emerson
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = tec.nextInt();
            }
        }
        
        System.out.println("\nValores da matriz:");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "] = " + 
                        matriz[i][j]);
            }
        }
        
    }
}
