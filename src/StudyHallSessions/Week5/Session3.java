package StudyHallSessions.Week5;

import java.util.Random;
import java.util.Scanner;

public class Session3 {
    public static void main(String[] args) {

//Write a program to display the multiplication table from 1 to 10. Please use nested for loop:

        for (int i = 1; i <=10 ; i++) { // i=2, 2 4. .. 10 . 10++
            System.out.println("-------------------");
            System.out.println("Table of "+i); // i=1
            System.out.println("--------------------");

            for (int k = 1; k <=10 ; k++) { // k=1 , k++ = 2, ... k=10 , 10++ > 11 false

                System.out.println(i+ " * " +k +" = "+( i * k) );
                //               1 * 1 = 1
                //              1 * 2 =  2

                //              1 * 10 = 10


            }

        }

        //// Write a  program to create a Right Triangle Star Pattern Program
        ////Please use nested for loop, and height is 7

        /*

        Expected output:

*
**
***
****
*****
******
*******

         */

        System.out.println("============================");

        for (int i =1 ; i<=7; i++){ // i=1 , i=2 ,i=3

            //              1<=3
            for (int k = 1; k <=i ; k++) { // k++ , k=2 ... k=1.. k=2 .. k=3, k=1
                // i =1 k=1
                // i=1
                System.out.print("*");

            }
            System.out.println();



        }

        /**
         *
         * // Guessing game
         * //Please follow the step in the below
         *
         * // Step 1-  Create 2 int variables with name of randomNumber , userInput;
         *
         * //Step 2- Create a program will generate random a number between 1 to 10
         *
         * to generate a random number use >>
         *
         *  Random random=new Random();
         *  int randomNumber = random.nextInt(10) + 1;
         *
         *
         * // Step 2- Ask user to enter a number to enter a number between 1-10
         *
         * //Step 3-  Create a logic with do while loop that will ask user
         * to enter a number as long as random number and userInput are not matching.
         */

        System.out.println("+++++++++++++++++++++++++++++");

        // Step 1-  Create 2 int variables with name of randomNumber , userInput;

        int randomNumber, userInput ;





        do {
            //Step 2- Create a program will generate random a number between 1 to 10
            Random random=new Random();

            randomNumber = random.nextInt(10) + 1; // 0.999  +1
            //// Step 3- Ask user to enter a number to enter a number between 1-10

            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number between 1 -10");

            userInput=input.nextInt();
            System.out.println("random was .."+ randomNumber);

        }while (randomNumber !=userInput);
        ////Step 3-  Create a logic with do while loop that will ask user
        //  to enter a number as long as random number and userInput are not matching.

        System.out.println("Congrats ... ");
        System.out.println("");







    }
}
