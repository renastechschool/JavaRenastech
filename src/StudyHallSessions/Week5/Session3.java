package StudyHallSessions.Week5;

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



    }
}
