package ifCoders;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Emerson
 */
public class Exercício1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] originalArray = new Integer[3];
        Integer[] arrayCopy;
        
        // Read
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = scanner.nextInt();
        }
        
        arrayCopy = Arrays.copyOf( originalArray, originalArray.length );
        Arrays.sort( arrayCopy, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo( num2 );
            }
        } );
        
        // Print
        showNumbers( arrayCopy );
        System.out.println();
        showNumbers( originalArray );
    }
    
    private static void showNumbers(Integer[] array){
        for(Integer i : array){
            System.out.println( i );
        }
    }
}
