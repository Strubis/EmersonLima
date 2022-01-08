package ContestNatal;

import java.util.Scanner;

public class ProblemJ {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            int num = scanner.nextInt();

            System.out.println( testOfili( num ) );
        }
    }

    private static int testOfili(int num){
        int result = 1;
        int val = Math.floorDiv( num, 10 );
        int mul = ( num % 10 ) * 5;
        System.out.println(val);
        System.out.println(mul);
        if( val > 0 )
            mul += val;

        if( ( mul % 7 ) == 0 )
            result = 2;



        return result;
    }
}
