package StudyHallSessions.Week6;

import java.util.Arrays;

public class Session2 {
    public static void main(String[] args) {

        ////   (String) Find the unique
        ////    Write a program   that can find the unique characters from the String
        ////
        ////    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

        String unique="AAABBBCCCDEF"; // DEF

        String answer=""; // will be used to store my answer

        for (int i = 0; i < unique.length() ; i++) { // i=0 , i=1
            int count=0;

            for (int j = 0; j <unique.length() ; j++) { // j=0 ; j=1 , j=2...  j=last index.

                if (unique.charAt(i)==unique.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                answer+=unique.charAt(i);
            }
        }

        System.out.println("answer = " + answer); // answer = DEF

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        ////    Write a program that check if a string is build out of the same letters as another string.
        ////
        ////    Ex:  same("abc",  "cab"); -> true
        ////
        ////    same("abc",  "abb"); -> false:

        String s1="abc";
        String s2="cab";

        char [] ch1=s1.toCharArray(); //[a, b, c]
        System.out.println(Arrays.toString(ch1)); // [a, b, c]

        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1)); // [a, b, c]


        char [] ch2=s2.toCharArray(); // [c, a, b]
        System.out.println(Arrays.toString(ch2)); //[c, a, b]

        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch2)); //[ a, b, c]

        System.out.println("s1 and s2 have characthers = " + Arrays.equals(ch1,ch2));
        //s1 and s2 have characthers = true

        System.out.println("*******************************");
        String s3="abc";
        String s4="abb";

        char [] ch3=s3.toCharArray();
        char[] ch4=s4.toCharArray();

        Arrays.sort(ch3);
        Arrays.sort(ch4);

        boolean s3andS4=Arrays.equals(ch3,ch4);

        System.out.println("S3 and S4 have characthers "+s3andS4);
//      S3 and S4 have characthers false

        System.out.println("**************************");

        ////    (Array) Find Maximum
      //    Write a program that can find the maximum number from an multi dimension int Array
     //
        int [][] list2={{38,-90,0},{5,800,4},{9000000}}; // expected: max=800
//                       0            1          2
        //              0 1 2       ,   0 1 2 3  ,   0
        long max=list2[0][2]; // assuming that this index is max, we will use this variable to store answer
        System.out.println(list2.length);// 2

        for (int i = 0; i < list2.length ; i++) {// i=0  , i=1

            for (int j = 0; j <list2[i].length ; j++) { //j=0 , j=1 , j=2,  || j=0 , j=1 , j=2 , j=3

                if (list2[i][j] >max){

                    max=list2[i][j];
                }
            }

        }

        System.out.println("max == "+max);

    }
}
