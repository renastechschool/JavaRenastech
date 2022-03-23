package day12_Loops;

import java.util.Scanner;

public class c2_removeCharacters {

    //Task : Create a java program that will check given string and
    //    if string starts or ends with 'a' or 'A' remove it from string.
    //    if it is not leave it as it is :
    //    examples :
    //    if string is Hello  output should be Hello
    //    if string is JavA  output should be jav
    //    if string is Ajavaa  output should be java
    //    .....
    //    Hint : Try with different cases to make sure your code is working correctly .
    //    if you want to try with multiple words to you can create scanner and try multiple times with different words


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scan.nextLine();
        System.out.println("word = " + word);

        //i need to look what is my first and last index
        //first index = 0
        //last index = length -1

        //first lets check first letter
        //if letter small a or capital A remove from string
        if (word.substring(0,1).equalsIgnoreCase("a")){
            word = word.substring(1);
        }
        System.out.println("New word after first if " + word);

        //check last index to see if letter is equal to a or A
        //if yes remove it

        int length= word.length();
        int lastIndex=length -1;
        if (word.substring(lastIndex).equalsIgnoreCase("A")){

            word = word.substring(0,lastIndex); //last index is not inculeded;

        }

        System.out.println("New word after second if " + word);


        //only first letter a
                //small or capital
        //only last letter a
                //small or capita
        //first and last letters are not a or A   : super
        //firs and last a or A   : america  meric


    }
}
