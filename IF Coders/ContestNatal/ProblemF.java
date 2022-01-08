package ContestNatal;

import java.util.Scanner;

public class ProblemF {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            int cpfs = scanner.nextInt();

            scanner.nextLine();
            for (int i = 0; i < cpfs; i++) {
                String[] cpf = scanner.nextLine().split( "-" );

                System.out.println( cpfIsValid( cpf ) ? "HoHoHoHo!" : "Muahahaha!" );
            }

        }
    }

    private static boolean cpfIsValid(String[] cpf){
        String leftNums = cpf[0];
        double over1, over2;
        int sum1 = 0, sum2 = 0;

        if( leftNums.charAt(0) == leftNums.charAt(1) && leftNums.charAt(1) == leftNums.charAt(2) &&
                leftNums.charAt(2) == leftNums.charAt(3) && leftNums.charAt(3) == leftNums.charAt(4) &&
                leftNums.charAt(4) == leftNums.charAt(5) && leftNums.charAt(5) == leftNums.charAt(6) &&
                leftNums.charAt(6) == leftNums.charAt(7) && leftNums.charAt(7) == leftNums.charAt(8) &&
                leftNums.charAt(8) == cpf[1].charAt(0) && cpf[1].charAt(0) == cpf[1].charAt(1) )
            return false;

        for(int i = 10, j = 0; i >= 2 && j <= 8; i--, j++){
            sum1 += ( leftNums.charAt( j ) - 48 ) * i;
        }

        over1 = ( sum1 * 10 ) % 11;
        if( over1 == 10 )
            over1 = 0;

        for(int i = 11, j = 0; i >= 3 && j <= 8; i--, j++){
            sum2 += ( leftNums.charAt( j ) - 48 ) * i;
        }
        sum2 += ( cpf[1].charAt(0) - 48 ) * 2;

        over2 = ( sum2 * 10 ) % 11;
        if( over2 == 10 )
            over2 = 0;

        if( ( (int) over1 ) == ( cpf[1].charAt(0) - 48 ) && ( (int) over2 ) == ( cpf[1].charAt(1) - 48 ) )
            return true;

        return false;
    }
}
