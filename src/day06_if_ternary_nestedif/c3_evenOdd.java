package day06_if_ternary_nestedif;

public class c3_evenOdd {

    //create a java program that will check if number is even or odd
    //examples :
    //if number is 20 print : 20 is even number
    //if number is 33 print : 33 is odd number

    public static void main(String[] args) {

        int number ;

        number =30;
        String result="";

        //lets try first with if else
        if (number % 2 ==0){
            result = number + " is even number ";
        }else {
            result = number + " is odd number ";
        }

        System.out.println(result);

        //ternary
        //if == ?
        //else == :

        String result2= (number % 2==0) ? number + " is even number " : number + " is odd number ";

        System.out.println(result2);

    }
}
