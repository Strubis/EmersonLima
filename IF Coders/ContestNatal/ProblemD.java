package ContestNatal;

import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            String[] data = scanner.nextLine().split(" " );
            double p = Double.parseDouble( data[0] );

            for (int i = 0; i < Integer.parseInt( data[1] ); i++) {
                p += Double.parseDouble( scanner.nextLine() );
            }

            System.out.printf( "%.2f\n", p );
            System.out.println( p < Double.parseDouble( data[2] ) ? "ho ho ho" : "papai noel precisa fazer exercicios" );
        }
    }
}
