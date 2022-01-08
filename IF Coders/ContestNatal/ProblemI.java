package ContestNatal;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemI {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            String[][] matriz = new String[8][8];

            for (int i = 0; i < 8; i++) {
                int j = 0;
                String line = scanner.nextLine();

                for( char c : line.toCharArray() ){
                    matriz[i][j] = String.valueOf( c );
                    j++;
                }
            }

            verifyMatriz(matriz);
            showMatriz(matriz);
        }
    }

    private static void verifyMatriz(String[][] matriz){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int cont = 0;

                if( matriz[i][j].equals( "." ) ){
                    // Right
                    if( j+2 < 8 ){
                        if( i-1 >= 0 && matriz[i-1][j+2].equals( "*" ) )
                            cont++;

                        if( i+1 < 8 && matriz[i+1][j+2].equals( "*" ) )
                            cont++;
                    }

                    if( j+1 < 8 ){
                        if( i-2 >= 0 && matriz[i-2][j+1].equals( "*" ) )
                            cont++;

                        if( i+2 < 8 && matriz[i+2][j+1].equals( "*" ) )
                            cont++;
                    }

                    // Left
                    if( j-2 >= 0 ){
                        if( i-1 >= 0 && matriz[i-1][j-2].equals( "*" ) )
                            cont++;

                        if( i+1 < 8 && matriz[i+1][j-2].equals( "*" ) )
                            cont++;
                    }

                    if( j-1 >= 0 ){
                        if( i-2 >= 0 && matriz[i-2][j-1].equals( "*" ) )
                            cont++;

                        if( i+2 < 8 && matriz[i+2][j-1].equals( "*" ) )
                            cont++;
                    }

                    matriz[i][j] = String.valueOf( cont );
                }

            }
        }
    }

    private static void showMatriz(String[][] matriz){
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                System.out.print( matriz[i][j] );
            }
            System.out.println();
        }
    }
}
