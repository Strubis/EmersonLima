package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler uma sentença e apresentar:
 *      • O primeiro caractere da sentença;
 *      • O último caractere da sentença;
 *      • O número de caracteres existente na sentença.
 * 
 * 
 * @author Emerson
 */
public class CharString01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        String sentenca = tec.nextLine();
        
        System.out.println( sentenca.charAt(0) );
        System.out.println( sentenca.charAt( sentenca.length() - 1 ) );
        System.out.println( sentenca.length() );
        
    }
}
