package day07_switch_scanner;

import java.util.Scanner;

public class c5_scannerPractice {
    //        //check if input is even or odd number

    public static void main(String[] args) {

        Scanner userInput=new Scanner(System.in);
        //we just import scanner class (library) to in our class
        //we will be able to use all methods from scanner by calling userInput object

        System.out.println("Insert first number : ");


//        int number1=32;
        int number1=userInput.nextInt(); // we are asking user to enter number from console
        System.out.println("You have inserted number : " + number1);

        if (number1 %2==0){
            System.out.println(number1 + " is even number");
        }else {
            System.out.println(number1 + " is odd number");
        }


    }
}
