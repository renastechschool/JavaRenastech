package day13_WhileLoop;

public class c5_SumEvenNumbers {

      /*
Write a program using while loop  that calculates the sum of the even numbers between  0 and 30

 */

    public static void main(String[] args) {
        //starting point 0
        //ending point 30
        //iteration +1
        //if condition to check even number

        int sum1=0;

        //for loop
        for (int i=0 ; i <=30 ; i++){

            //if
            if (i%2==0){//even numbers
                System.out.println("adding " + i + " to sum1");
                sum1 += i;

            }


        }

        System.out.println("sum1 = " + sum1);

        System.out.println("*************************");

        int start2=0;
        int sum2=0;

        while (start2 <= 30){
            //if
            if (start2%2==0){//even numbers
                System.out.println("adding " + start2 + " to sum1");
                sum2 += start2;

            }
            start2++;

        }

        System.out.println("sum2 = " + sum2);

    }
}
