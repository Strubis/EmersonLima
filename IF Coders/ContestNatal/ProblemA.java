package ContestNatal;

import java.util.Scanner;

public class ProblemA {
    private static String desc[] = { "Brinquedos", "Alimentos", "Roupas", "Calcados", "Eletronicos",
                              "Livros", "Gadgets", "Smartphones", "Jogos", "Papelaria" };

    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            int gifts = scanner.nextInt();
            int totalGiftsPerDesc[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            scanner.nextLine();
            for(int i = 0; i < gifts; i++){
                String gift[] = scanner.nextLine().split( " " );
                totalGiftsPerDesc[ Integer.parseInt( gift[1] ) - 1 ]++;
            }

            showTotalGiftsPerDesc( totalGiftsPerDesc );
        }
    }

    private static void showTotalGiftsPerDesc(int totalGifts[]){
        int i = 0;

        for(String str : desc){
            System.out.println( "Total de " + str + ": " + totalGifts[i] );
            i++;
        }
    }
}
