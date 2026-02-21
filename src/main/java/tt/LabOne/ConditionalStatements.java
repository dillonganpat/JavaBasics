package tt.LabOne;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();

        // Check if positive, negative, or zero
        if (number > 0) {
            System.out.println("This number is positive.");
        } else if (number < 0) {
            System.out.println("This number is negative.");
        } else {
            System.out.println("This number is 0.");
        }

        // Check if even or odd
        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }

        keyboard.close();
    }
}
