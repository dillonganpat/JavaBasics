package tt.LabOne;

import java.util.Scanner;

public class SimpleChat {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // 1. Ask name
        System.out.println("Hi, what is your name?");
        String name = keyboard.nextLine();

        // 2. Greet user
        System.out.println("Nice to meet you, " + name + "!");

        // 3. Chat loop
        while (true) {
            System.out.println("What would you like to talk about?");
            String topic = keyboard.nextLine();

            // stop if user types exit
            if (topic.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            // echo response
            System.out.println("Interesting! Tell me more about " + topic);
        }

        keyboard.close();
    }
}