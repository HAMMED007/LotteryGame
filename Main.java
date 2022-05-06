package Lottery;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int total_spent = 0;
        int hint = 0;
        int hint_counter = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println(number);
        System.out.println("Want to win a million dollars?");


        while (true) {
            System.out.println("Insert $1.00 and enter your number or 'q' to quit:");
            int money = scanner.nextInt();
            if (money == 1) {
                System.out.println("guess the number");
                int play = scanner.nextInt();
                total_spent++;
                if (play != number) {
                    System.out.println("Sorry, good guess, but not quite right.");
                   //---------------------------------------------------------------
                    System.out.println("do you want a hint? type 1 for yes and 0 for no (each hint costs $3");
                    int hints =scanner.nextInt();


                    if(hints ==1)
                    {
                        hint_counter = hint_counter + 3;
                        if (play<number)
                            System.out.println("number is higher than this");
                        if (play>number)
                            System.out.println("number is lower than this");
                    }
                    if (hints==0){
                        System.out.println("okay");

                    }
                    System.out.println();
                }
//--------------------------------------------------------------------------------------------
                if (play == number) {
                    System.out.println("you win");
                    break;
                }

            }


            if (money == 0) {

                System.out.println("you quit");
                break;
            }


        }
        System.out.println("total money spent is $" + ( total_spent + hint_counter));
    }
}
