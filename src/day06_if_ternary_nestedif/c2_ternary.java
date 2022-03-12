package day06_if_ternary_nestedif;

public class c2_ternary {
    //ternary is just another way of using if else block

    //create a java program that prints max number between 2 numbers

    public static void main(String[] args) {
        int number1=10;
        int number2=20;

        int max=0; //this variable will be used to store max number
        String message=""; //this variable will be used for storing result as a message

        System.out.println(max);
        System.out.println(message);

        if (number1 > number2){//10>20 false
            max = number1; // java wonr run this line since if statement is false
        }else {//true
            max = number2; //max = 20;
        }

        message = "Maximum number is : " + max;//20
        System.out.println(message);


        //ternary(another way of if else block)
        int number3=10;
        int number4=20;

        int max2;

        max2 = (number3 > number4) ? number3 : number4 ;
        //if present ?
        // : present else

        System.out.println(max2);

        String result ="";

        result = (false) ? "Java" : "Python" ;

        System.out.println(result);

        if (false){
            result = "Java";
        }else {
            result = "Python";
        }


    }
}
