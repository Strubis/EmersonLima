package ContestNatal;

import java.util.*;

public class ProblemG {
    public static class Person{
        private String name, gift;
        private int dist;

        Person(String name, String gift, int dist){
            this.name = name;
            this.gift = gift;
            this.dist = dist;
        }

        public String toString(){
            return name + " " + gift + " " + dist;
        }
    }

    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in) ){
            int qtd = scanner.nextInt();
            List<Person> people = new ArrayList<>();

            scanner.nextLine();
            for (int i = 0; i < qtd; i++) {
                String[] data = scanner.nextLine().split( " " );
                Person person = new Person( data[0], data[1], Integer.parseInt( data[2] ) );

                people.add( person );
            }

            Collections.sort( people, Comparator.comparingInt(p -> p.dist));

            showPeopleAsc( people );
        }
    }

    private static void showPeopleAsc(List<Person> people){
        for(Person person : people){
            System.out.println( person.toString() );
        }
    }
}
