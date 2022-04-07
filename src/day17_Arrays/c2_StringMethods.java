package day17_Arrays;

import java.util.Arrays;

public class c2_StringMethods {

    public static void main(String[] args) {
        //Another String method
        //toCharArray()

        //Method	              Description                                                     	Return Type
        //toCharArray()             this will take a string and return you a char array	             char[]

        String str="?@#$Hello 12312world java is fun 12312";

        char [] letters=str.toCharArray();
        System.out.println(Arrays.toString(letters));// char []letters=[?, @, #, $, H, e, l, l, o,  , 1, 2, 3, 1, 2, w, o, r, l, d,  , j, a, v, a,  , i, s,  , f, u, n,  , 1, 2, 3, 1, 2]

        System.out.println(letters[3]);
        System.out.println(letters[7]);



        //string method
        //split()
        //this will split given string from specific condition in the string     Return Type
        //      	                                                                string[]

        String myString="Java is very fun hello world";
        //task
        //to split given sentence from spaces
        String [] splitedSentence=myString.split(" "); //to split from spaces
        System.out.println( Arrays.toString(splitedSentence) );
        System.out.println("splitedSentence[1] = " + splitedSentence[1]);

        String []splitedSentence2=myString.split("a");
        System.out.println(Arrays.toString(splitedSentence2));


        String [] split3=myString.split("");//to split from each letter
        System.out.println(Arrays.toString(split3));

        //tochararray vs split
        //split is more specific to split anywhere you want to
        //split returns string array tochararray returns char array

    }
}
