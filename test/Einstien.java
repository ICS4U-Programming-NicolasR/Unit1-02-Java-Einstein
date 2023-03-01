package test;

import java.util.Scanner;
/**
* Calculates the energy from a given mass.
*
* @author  Mr. Riscalas
* @version 1.0
* @since   2023-02-17

*/

public final class Einstien {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Einstien() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     *
     */
    public static void main(final String[] args) {
        // Create the constants
        final double speedOfLight2 = Math.pow(299792458, 2);
        // Created a scanner object
        final Scanner inputScan = new Scanner(System.in);
        // Ask the user for the size of the logs
        System.out.println("What is the mass of your object?");
        final String massS = inputScan.nextLine();
        // Error catching
        try {
            // try to parse the string to a double type variable
            final double massD = Double.parseDouble(massS);
            // Check if their mass is positive
            if (massD >= 0) {
                final double energy = massD * speedOfLight2;
                System.out.format("The energy of the system is %.3eJ\n",
                    energy);
            } else {
                System.out.println("Although a negative mass is "
                        + "possible we will not be calculating energy for it.");
            }
        // catch the error
        } catch (NumberFormatException error) {
            System.out.println("You have entered a string "
                    + "You must enter a real number\n"
                    + error);
        }
        inputScan.close();
    }
}
