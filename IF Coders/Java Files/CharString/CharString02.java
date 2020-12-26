package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que leia duas strings. 
 * A seguir imprimir as 2 strings em ordem alfabética.
 * 
 * @author Emerson
 */
public class CharString02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        String[] strs = new String[2];
        
        for (int i = 0; i < 2; i++) {
            strs[i] = tec.nextLine();
        }
        
        int comp = strs[0].compareTo(strs[1]);
        
        if( comp < 0 ){
            System.out.println(strs[0] + " " + strs[1]);
        }else{
            System.out.println(strs[1] + " " + strs[0]);
        }
        
    }
}
