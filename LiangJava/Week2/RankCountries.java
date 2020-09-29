//ch. 4; 4.24
package Week2;

import java.util.*;

public class RankCountries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numberOfCountries = 3;

        String[] countries = new String[numberOfCountries];
        for(int i = 0; i < numberOfCountries; i++) {
            System.out.print("Enter a string: ");
            countries[i] = input.nextLine();
        }

       Arrays.sort(countries, Collections.reverseOrder());

        System.out.println("The three countries are ");
        for (String a: countries) {
            System.out.println(a);
        }

    }
}
