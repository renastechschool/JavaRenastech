package day05_ifStatements;

public class c5_negativePositive {

    //create a java program that will check the given number =20
    //if number is positive print : 20 is positive
    //if number is negative print : 20 is negative
    //if number is zero print : 20 is zero

    public static void main(String [] args){
        int number=0;

        //if number is smaller then zero -- negative number
        //if number is bigger then zero -- positive number
        //if number is  zero -- number is zero

        if (number > 0){
            System.out.println(number + " is positive");
        }
        if (number < 0){
            System.out.println(number + " is negative");
        }
        if (number == 0){
            System.out.println(number + " is zero");
        }


    }
}
