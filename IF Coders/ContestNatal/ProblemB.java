package ContestNatal;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            int tricks = scanner.nextInt();

            System.out.println( tricks <= 25 ? "Recebe Presente, Feliz Natal!" : "Recebe Carvao" );
        }
    }
}
