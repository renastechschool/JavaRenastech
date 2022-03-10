package day05_ifStatements;

public class c4_practice {
    //Write a Java program to compare two numbers.
    ////Input first integer: 25
    ////Input second integer: 39
    ////Expected Output
    ////
    ////25 != 39
    ////25 < 39
    ////25 <= 39

    ///20 ; 20
    //20==20
    //20>=20
    //20<=20

    //11;22
    //11 != 22
    //11 <= 22
    //11 < 22

    //21 -23
    //21 != -23
    //21 >= -23
    //21 > -23



    //==
    //!=
    //<=
    //>=
    //<
    //>

    public static void main(String [ ] args){


        int number1=30;
        int number2=30;
        //35!=30
        //35>=30
        //35>30

        //==
        //!=
        //<=
        //>=
        //<
        //>

        if (number1==number2){
            System.out.println(number1 + " == "+number2);
        }

        if (number1!=number2){
            System.out.println(number1 + " != "+number2);
        }

        if (number1 >= number2){
            System.out.println(number1 + " >= "+number2);
        }

        if (number1 <= number2){
            System.out.println(number1 + " <= "+number2);
        }

        if (number1 > number2){
            System.out.println(number1 +" > " +number2);
        }
        if (number1 < number2){
            System.out.println(number1+ " < "+number2 );
        }

    }
}
