package tt.LabOne;

public class LoopDemo {

    public static void main (String[] args){

        //While loop: countdown
        System.out.println("Countdown: ") ;
        int count =5;
        while (count >0) {
            System.out.println(count);
            count --;
        }
        System.out.println("Blast off!");

        //For loop: print even numbers from 2 to 10
        for (int number= 2; number<=10; number = number+ 1){
            if (number%2==0) {
                System.out.println(number);
            }
            }

        System.out.println();

        }
    }

