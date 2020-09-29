//chapter 1; 1.11
package Week1;

public class PopulationProjection {
    public static void main(String[] args) {
        double population = 312_032_486;
        final int SECONDS_PER_YEAR = 31_536_000;

        //creates larger pop.
        double birthsPerYear = SECONDS_PER_YEAR / 7.0;
        //creates smaller pop.
        double deathsPerYear = SECONDS_PER_YEAR / 13.0;
        //creates larger pop.
        double immigrantsPerYear = SECONDS_PER_YEAR / 45.0;

        for(int i = 1; i <= 5; i++) {
            population = population + birthsPerYear - deathsPerYear + immigrantsPerYear;
            System.out.printf("Year " + i + " population: %.0f\n", population);
        }
    }
}
