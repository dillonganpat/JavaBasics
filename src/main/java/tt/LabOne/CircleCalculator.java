package tt.LabOne;

import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Ask the user for radius
        System.out.println("Please enter the radius of a circle:");

        double radius = keyboard.nextDouble();
        double area = Math.PI * radius * radius;

        // Print the area with 2 decimal places
        System.out.printf("Area of the circle: %.2f%n", area);

        keyboard.close();
    }
}