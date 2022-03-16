package StudyHallSessions.Week3;

import java.util.Scanner;

public class Session2 {

    public static void main(String[] args) {
        /**
         * *Write A Program To Calculate The Monthly Telephone Bills As Per The Following Rule:
         *          * Minimum Rs. 200 For Upto 100 Calls.
         *          * Plus Rs. 0.60 Per Call For Next 50 Calls.
         *          * Plus Rs. 0.50 Per Call For Next 50 Calls.
         *          * Plus Rs. 0.40 Per Call For Any Call Beyond 200 Calls.
         *          */

        // Variables
        double bill=0;
        double callCount=450;

        //Minimum Rs. 200 For Upto 100 Calls.
        if (callCount<=100){
            bill=200;
            System.out.println("Call Count="+ callCount);
            System.out.println("bill = " + bill);

            //Plus Rs. 0.60 Per Call For Next 50 Calls.
        }else if(callCount>100 && callCount<=150){
            // firstt 100 call will =200
            // 130-100= 30
            // 30 * 0.60 = 18;  total 218;

            bill= 200 +((callCount - 100)*0.60);
            System.out.println("Call Count = "+callCount);
            System.out.println("Bill = "+bill);

        //* Plus Rs. 0.50 Per Call For Next 50 Calls.
        }else if (callCount> 150 && callCount<=200){
            bill =200 +(50* 0.60) + ((callCount -150)* 0.50);

            System.out.println("Call count = "+callCount);
            System.out.println("bill = " + bill);

            //Plus Rs. 0.40 Per Call For Any Call Beyond 200 Calls.

        }else {
            bill= 200+ (50 *0.60)+ (50*0.50)+ ((callCount-200) *0.40 );
            System.out.println("Call Count = "+ callCount);
            System.out.println("Bill = "+bill);

        }

        /**
         * /**
         *       * //Absolute value
         *      * //Write a program that asks the user to enter a number and displays the absolute value of that number.
         *        */


        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a number");

        int userInput=input.nextInt();
        int absoluteValue=0;

        if (userInput < 0){
            // -10      ==> - (-90)
            absoluteValue= - userInput;
            System.out.println("userInput = " + userInput);
            System.out.println("absoluteValue = " + absoluteValue);
        }else {
            absoluteValue = userInput;
            System.out.println("User input = "+userInput);
            System.out.println("absoluteValue = " + absoluteValue);


        }

        /**
         * Jane wants to build a very simple tip calculator for whenever he goes eating in a restaurant.
         * In his country, it's usual to tip 15% if the bill value is between 99 and 280.
         * If the value is different, the tip is 20%.
         */












    }
}
