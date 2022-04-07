package day17_Arrays;

import java.util.Arrays;

public class c3_reverseSentence {

    public static void main(String[] args) {

        ////create a condition that will reverse given sentence
            //        //ex: Java is fun
            //        //output should be fun is java
        ////create a condition that will reverse given string
             //        //ex: Java is fun
             //output should be nuf si avaJ

        String sentence="Java is Fun";
        //Fun is Java
        //1 store my sentence in words (string array) [Java, is, Fun]
        //have last word printed at begining
        // move to the first one

        String []splitSentence=sentence.split(" ");
        System.out.println(Arrays.toString(splitSentence));

        String reverseSentence=""; //to store reversed sentence

        for (int i = splitSentence.length -1; i >=0 ; i--){
            reverseSentence += splitSentence[i] + " " ;

        }


        System.out.println(reverseSentence);


        //////create a condition that will reverse given string
        //             //        //ex: Java is fun
        //             //output should be nuf si avaJ

        String sentence2="Java is fun";
        String [] split2=sentence2.split(""); // we will split from each letter abd store into string array

        String reverse2="";

        for (int i = split2.length-1 ; i >=0 ; i--){

            reverse2 += split2[i] ;
        }

        System.out.println(reverse2);
    }
}
