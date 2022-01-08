package ContestNatal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemE {
    private static final Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            String[] data;

            while( true ){
                data = scanner.nextLine().split( " " );

                if( data[0].equals( "--" ) )
                    break;

                map.put( data[0], data[1] );
            }

            while( true ){
                String name = scanner.nextLine();

                if( name.isEmpty() )
                    break;

                System.out.println( map.containsKey( name ) ?
                        "Child: " + name + "\nGift " + map.get( name ) :
                        "404 not found" );
                System.out.println();
            }
        }
    }

}
