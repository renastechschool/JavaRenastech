package StudyHallSessions.Week5;

import java.time.LocalDate;

public class Session1 {
    public static void main(String[] args) {
        //Reverse an int

        int myNumber=123;  // 001
        // expected answer = 25


        int answerofInt=0; // will store answer in this variable


        // as long as my my number is not 0 , while loop will run
        // 52 !=0 >> true
        // 5 != 0 >> true
        // 0! = 0 >> false
        while (myNumber!=0){
           //                 52 % 10 = 2
            //                  5 % 10 = 5
            int remainderOf10= myNumber %10;
            //            0 * 10= 0 + 2
            //           2 * 10 = 20 +5
            answerofInt =answerofInt * 10 + remainderOf10;   // answer= 2 at first time ,, answer = 25

            //52 / 10 = 5
            // 5 /10 = 0.5 ==> type is int and it will = 0
            myNumber /=10;


        }

        System.out.println(answerofInt);

        System.out.println("*************Prime Number****************");
        // Write a program that will check if the given number is a  prime number or not

        // 5 , 8 => 1 2 4 8
        // 6 =>  2 3  not
        // 13 => prime , 17 prime
        // 22  2 11 -- not prime

        // 9 ==>  3 , 9 is not a prime

        int number= 13; // expected? prime number

        int count=0; // created this for temporary

        if (number == 2 || number==3){

            System.out.println(number+ " is a prime number");
        }else {


            /// 2 .3 4 5 6 7 8 .. 12
            for (int i = 2; i<number ; i++) {
                // i= 2 , 3 4 5 6 ... my number

                //   8 % 2 == 0, 8%3==0? false ,  8 % 4==0 , 8% 5==0
                if ( number % i == 0 ){
                    count++; // 0++, 1++

                }
            }

            if (count==0){
                System.out.println(number+" is a Prime number");
            }else {
                System.out.println(number+ " is not a prime number");
            }

        }









    }
}
