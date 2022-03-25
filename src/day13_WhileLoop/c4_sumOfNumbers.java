package day13_WhileLoop;

import java.util.Scanner;

public class c4_sumOfNumbers {

    //create a java logic that will sum the given numbers
    //ex if input is 5 ;
    //output will be 1 + 2 +3 + 4 +5 == 15

    //input is 3
    //output 1 + 2 +3  =6
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number= input.nextInt();

        //ex if input is 5 ;
        //output will be 1 + 2 +3 + 4 +5 == 15
        int start=0;
        //you need to have a summary variable
        int sum=0;

        while (start <= number ){ //lets assume number is 5  0<=5 1<=5 2<=5
            System.out.println("sum is in the while loop " + sum);
            sum += start; //sum =sum +start --- 0+0 =0  --- 0 + 1 =1 ---- 1 +2 =3+3+3+4+5
            System.out.println("sum is after += " +sum);
            start++;//1 2 3

        }
        System.out.println("sum = " + sum);


    }
}
