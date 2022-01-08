package ContestNatal;

import java.util.*;

public class ProblemH {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            scanner.nextInt();
            int ways = scanner.nextInt();

            scanner.nextLine();
            String[] data = scanner.nextLine().split(" " );

            List<String> citiesToVisit = new ArrayList<>( Arrays.asList(data) );

            for (int i = 0; i < ways; i++) {
                String[] way = scanner.nextLine().split(" ");

                citiesToVisit.remove( way[1] );
            }

            System.out.println( citiesToVisit.size() == 0 ?
                    "merry christmas" :
                    "no gifts today" );
        }
    }
}
