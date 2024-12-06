//Kevin Perez
package packageThing;

import java.util.Scanner;

public class TriangleMaker {
    public static void main(String[] args) {
    	
        Scanner key = new Scanner(System.in);

        // Ask the user for the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int height = key.nextInt();

        // Print the first half of the triangle
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Print the second half of the triangle
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        System.out.println("End of program!");

        key.close();
    }
}
