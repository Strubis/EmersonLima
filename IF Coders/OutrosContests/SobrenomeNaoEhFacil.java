package OutrosContests;

import java.io.IOException;
import java.util.Scanner;

public class SobrenomeNaoEhFacil {
    public static void main(String[] args) throws IOException {
        try( Scanner scanner = new Scanner(System.in) ){
            int nomes = scanner.nextInt();

            scanner.nextLine();
            for (int i = 0; i < nomes; i++) {
                String nome = scanner.nextLine();

                System.out.println( nome + ( nomeEhDificil( nome ) ?
                        " nao eh facil" :
                        " eh facil" ) );
            }
        }
    }

    private static boolean nomeEhDificil(String nome){
        int encontrou = 0;

        for(char c : nome.toCharArray()){
            c = Character.toLowerCase( c );

            if( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' )
                encontrou++;
            else
                encontrou = 0;

            if( encontrou >= 3 )
                return true;
        }

        return false;
    }
}
