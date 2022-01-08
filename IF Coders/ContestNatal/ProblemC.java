package ContestNatal;

import java.util.Scanner;

public class ProblemC {
    private static int cents[] = { 0, 0, 0, 0, 0 };

    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            double value = scanner.nextDouble();
            double cashSantaClaus = scanner.nextDouble();

            double cashback = cashSantaClaus - value;
            cashback -= Math.floor( cashback );

            defineCashbackSantaClaus( cashback );
            showCashback();
        }
    }

    private static void defineCashbackSantaClaus(double cashback){
        if( ( cashback / 0.5 ) > 0 ){
            cents[0] = (int) Math.floor( cashback / 0.5 );
            cashback -= ( cents[0] * 0.5 );
        }

        if( ( cashback / 0.25 ) > 0 ){
            cents[1] = (int) Math.floor( cashback / 0.25 );
            cashback -= ( cents[1] * 0.25 );
        }

        if( ( cashback / 0.1 ) > 0 ){
            cents[2] = (int) Math.floor( cashback / 0.1 );
            cashback -= ( cents[2] * 0.1 );
        }

        if( ( cashback / 0.05 ) > 0 ){
            cents[3] = (int) Math.floor( cashback / 0.05 );
            cashback -= ( cents[3] * 0.05 );
        }

        if( ( cashback / 0.01 ) > 0 ){
            cents[4] = (int) Math.floor( cashback / 0.01 );
        }
    }

    private static void showCashback(){
        System.out.println( cents[0] + " moeda(s) de 50" );
        System.out.println( cents[1] + " moeda(s) de 25" );
        System.out.println( cents[2] + " moeda(s) de 10" );
        System.out.println( cents[3] + " moeda(s) de 5" );
        System.out.println( cents[4] + " moeda(s) de 1" );
    }
}
