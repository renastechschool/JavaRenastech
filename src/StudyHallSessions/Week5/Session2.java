package StudyHallSessions.Week5;

import java.util.Scanner;

public class Session2 {

    public static void main(String[] args) {
        /**
         * //    Write a program that can print the numbers between 1 ~ 100
         * that can be divisible by 3, 5, and 15. Please use while loop
         *         //
         *         //  if the number can be divisible by 3, 5 and 15, then it
         *         should only be displayed in DivisibelBy15' section
         *         //
         *         // if the number can be divisible by 3 but cannot be divisible by 15,
         *         then it should only be displayed in DivisibelBy3' section
         *         //
         *         // if the number can be divisible by 5 but cannot be divisible by 15,
         *         then it should only be displayed in DivisibelBy5' section
         */

        //Step-1 Create variables

        String DivisibelBy15="";
        String DivisibelBy3="";
        String  DivisibelBy5="";

        //Step 2- Initilize logic
        // 1 ~ 100
        int number=1; // starting point

        while (number < 100){

            // step 3- if statements
            //if the number can be divisible by 3, 5 and 15,
            if ( number % 3==0  && number %5==0 && number %15==0){
                // should only be displayed in DivisibelBy15' section
                DivisibelBy15 += number + " ";
            }

            //// if the number can be divisible by 3 but cannot be divisible by 15,
            if( number %3 ==0 &&  number % 15 !=0 ){

                // then it should only be displayed in DivisibelBy3' section
                DivisibelBy3 +=number +" ";

            }

            //// if the number can be divisible by 5 but cannot be divisible by 15,
            if (number %5==0 && number %15 !=0){
                // then it should only be displayed in DivisibelBy5' section
                DivisibelBy5 += number+" ";

            }

            // last step increment

            number++; // number ++ > 2 ++ > 3++ 99++> 100




        }

        System.out.println("DivisibelBy15 = " + DivisibelBy15);
        System.out.println("DivisibelBy3 = " + DivisibelBy3);
        System.out.println("DivisibelBy5 = "+DivisibelBy5);

        System.out.println("***************************");
        /**
         * Task 2: Write a program that checks if a String is a Palindrome.
         *
         * Example: input : Java , output: java is not  palindrome
         * Example: input : kayak , output : kayak is a palindrome
         * Example: input level , ouput : level is a palindrome
         *
         * tip: A palindrome is a word, number, phrase, or other sequence of characters
         * which reads the same backward as forward, such as madam or racecar.
         */


        //We will use reverse to find how to read from ending point to starting point.

        String str="Madam";
        //          01234 ,, length = 5 => last index ==> length -1
        String reverse="";

        // lenght =5 -1=4
        for (int i =str.length()-1 ; i>=0  ; i--) {

            reverse+=str.charAt(i);

        }

        // Step2 - create logic:
        if(str.equalsIgnoreCase(reverse)){
            System.out.println(str +" is a Palindrome ");

        }else {
            System.out.println(str+ " is NOT a Palindrome");
        }


        /**
         * Task 3- Write a program that prints the multiplication table of the user-provided number.
         * with while loop
         */

        System.out.println("*****************");
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");

        int userInput=input.nextInt();

        int sPoint=1;
        int ePoint=9;

        while (sPoint < ePoint){


            System.out.println(sPoint + "*"+ userInput +" = "+ (sPoint*userInput));


            sPoint++; // 1++ > 2++ > 3..... 9++ > 10

        }



    }

}
