package day12_Loops;

import java.util.Scanner;

public class c1_ReverseString {
    //how can you reverse a string
    //input   hello
    //output  olleh

    //input  Java
    //output avaj

    //you print your reverse string from last index to first index
    public static void main(String[] args) {

        String word="Hello";
        //indexof(o) ==4
        String reverseString= "" + word.charAt(4) + word.charAt(3) + word.charAt(2) +
                word.charAt(1) + word.charAt(0);

        System.out.println("reverseString = " + reverseString);


        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word : ");

        String word2=input.nextLine();
        int lastIndex=word2.length() -1 ;

        String reverseWord2=""; // i need to store word2 from last index to first index

        //last index ==  length -1
        //first index 0
        //i need to go from last to first one by one
        //iteration -1

        //besiktas  total legth 8 last index 7
        //reverse = char7 + char6 + char5 ....... char0
        for (int i = lastIndex ; i >=0 ; i--){
            System.out.println("i = " + i); //prints index from last to first
            System.out.println("reverseWord2 = " + reverseWord2); //prints reverseword
            System.out.println("word2.charAt(i) = " + word2.charAt(i)); //prints what you add to reverse
            reverseWord2 += word2.charAt(i); // reverseword2 = reverseword2  + letter
            System.out.println(" after adding charAt reverseWord2 = " + reverseWord2);

        }

        System.out.println(reverseWord2);





    }
}
