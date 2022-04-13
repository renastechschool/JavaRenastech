package day20_ReturnMethods;

import java.util.Arrays;

public class c1_UniqueLetterFromArray {
    //Write a program that can print out the unique values from a String Array
    //            Ex:
    //                if arr -> {"A", "A", "B", "C", "C","C"}
    //                output: B
    //
    //                if arr -> {"A", "B", "B", "C"}
    //                output:  A
    //                         C
    // */
    public static void main(String[] args) {

        //if the variable is in the list for only one time that measn this is a unique value
        //I should only print strings that has count == 1
        //to check letter count  you will need to compare with all letters and when it equals you increase the count
        //the ones that has count == 1 are unique
        //count 0 , 2 3 4 5 6 .. wont be unique

        String [] letters={"A", "A", "B", "C", "C","C","D","E","D"};


        for (String eachLetter : letters){ //A //A //B //C ..... E
            int count=0;
            // to reset count for each letter we have count inside of our loop

            for (String eachLetter2 : letters){//={"A", "A", "B", "C", "C","C","D","E","D"};
                if (eachLetter2.equals(eachLetter)){
                    count++;//1
                }

            }

            if (count==1){//1=1
                System.out.println(eachLetter + " is unique"); //B  // E
            }


        }


        System.out.println("************");
        String [] arr={"A","C","B","C"};
        uniquesFromArray(arr);



    }

    public static void uniquesFromArray(String [] exampleLetters){
        //String [] letters={"A", "A", "B", "C", "C","C","D","E","D"};
        //no need for this line . Because we are getting our arrays from method parameters


        for (String eachLetter : exampleLetters){ //A //A //B //C ..... E
            int count=0;
            // to reset count for each letter we have count inside of our loop

            for (String eachLetter2 : exampleLetters){//={"A", "A", "B", "C", "C","C","D","E","D"};
                if (eachLetter2.equals(eachLetter)){
                    count++;//1
                }

            }

            if (count==1){//1=1
                System.out.println(eachLetter + " is unique"); //B  // E
            }


        }

        //A count :2
        //A count :2
        //B count :1 ;; 5

    }

    public static void uniquesFromArray2(String [] letters){

        //String [] letters = {"A", "A", "B",  "C","D","D"};
        //no need this one because we want make sure to run this method for different String arrays

        //System.out.println(Arrays.toString(letters));

        for (int i=0 ; i < letters.length ; i++){//A

            int count=0;
            for (int i1 =0 ; i1 < letters.length ; i1++){//{"A", "A", "B",  "C","D","D"};

                if (letters[i1].equals(letters[i])){
                    count++;
                }
            }


            if (count==1){
                System.out.println(letters[i]);
            }
        }

    }



}
