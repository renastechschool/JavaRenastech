package day05_ifStatements;

public class c6_ifElseStatements {
    // 2 number
    // please create a java program to check if this 2 number equal or not
    // if it is equal print : numbers are equal
    // if it is not  print : numbers are not equal
    public static void main(String [] args){
        int num1=20;
        int num2=30;

        if (num1 == num2){
            System.out.println(num1 + " Equal " +num2);
        }

        if (num1 !=num2){
            System.out.println(num1 + " Not Equal " +num2);
        }

        System.out.println("******************");

        if (num1 == num2){
            System.out.println(num1 + " Equal " +num2);
        }else { //this else will present what ever left from if condition
            System.out.println(num1 + " Not Equal " +num2);
        }

        // even numbers  -- if is number can be divided by 2 (if remeinder is 0) then we call this number even number
        // odd numbers   -- if is number cant be divided by 2 (if remeinder is not 0) this will be odd number

        //please create a java program that will check if number is even or odd number
        //if it is even print : number is even number
        //if it is odd number print: number is odd number
        //example output:
        //20 is even number
        //25 is odd number



    }
}
