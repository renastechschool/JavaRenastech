package day19_methods;

import java.util.Arrays;
import java.util.Scanner;

public class c1_FirstLastLetter {

    //create a java program that will ask for 5 string  name to store in the array
    //and print first and last letter from each string

    //example
    //input : berkan , firas ,merve ..
    //output : bn , fs ,me

    public static void main(String[] args) {
        // Scanner : to store numbers
        // Array string : to store 5 names
        // loop to store 5 names (for loop while loop)
        // charAt : to get each letter from each name
        // foreach  : to store initials from each name to new string

        Scanner input=new Scanner(System.in);

        String [] nameList=new String[5]; // to store 5 names
//        nameList[0]="hello";
//        nameList[1]="hello";
//        nameList[2]="hello";
//        nameList[3]="hello";
//        nameList[4]="hello";

        for (int i=0 ; i< nameList.length ; i++){
            System.out.println("Enter a name for index : " +i);
            nameList[i]=input.next();
        }

        //to print all names
        System.out.println(Arrays.toString(nameList));

        String firstLAstLEtters="";

        for (String eachName: nameList) {

            firstLAstLEtters += " " +eachName.charAt(0) + eachName.charAt(eachName.length() -1);
        }

        System.out.println(firstLAstLEtters);



    }

}
