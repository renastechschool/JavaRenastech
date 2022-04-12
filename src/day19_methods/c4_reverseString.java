package day19_methods;

import MyUtils.GenericUtils;

import java.util.Arrays;

public class c4_reverseString {

    public static void main(String[] args) {
        //Arrays.sort();
        c2_Methods.hello();
        c3_methodsWithParameters.ageCategory(3);

        GenericUtils.hello();

        reverseString("riham");
        reverseString("renastech");

    }

    //we will create our own librarry that will reverse any string
    //this method will accept a string so we can reverse it
    //as a result i should see reversed string
    public static void reverseString(String name){
        String reversedResult="";

        for (int i =name.length() -1 ; i >=0 ; i--){
            reversedResult += name.charAt(i);
        }

        System.out.println("reversedResult = " + reversedResult);
    }
}
