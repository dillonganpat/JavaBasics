package tt.LabOne;


import java.util.Scanner;

public class EvenNumberPrinter {
    public static void main (String[] args){

        Scanner keyboard= new Scanner(System.in);

        System.out.println("Please enter a positive integer: ");
        int num= keyboard.nextInt();

        for (int i=2; i<=num;i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }


        keyboard.close();
    }
}
