package day16_Arrays;

import java.util.Arrays;

public class c1_array1 {
    public static void main(String[] args) {

        // find the sum of the numbers from int array

        int [] numbers={ 4, -90, 200 ,5};//
        //              0   1    2    3

        int sumOfTheArray=0; // we will use to store my answer;

        int lastIndex= numbers.length-1;

        //    i=0;      0 < 4              0++
        //    i=1       1 < 4              1++
        //    i=2       2<4                 2++
        //    i=3       3<4                3++
        //    i=4       4<4
        for (int i = 0; i < numbers.length ; i++) {

            sumOfTheArray+=numbers[i]; // 0 +  4 -90 +200 +5
            //            =numbers[0]=4
            //            =numbers[1]= -90
            //            =numbers[2]=200
            //           =numbers[3] =5
        }

        System.out.println("sumOfTheArray = " + sumOfTheArray);


        // ARRAY   SIZE PART ;
        // Array size is fixed

        int [] ages=new int[5];
        // lenght is 5

      //  System.out.println(ages[10]); // ArrayIndexOutOfBoundsException

        ages[2]=50; // updated index 2 value

        System.out.println(ages[2]);// 50
        System.out.println(ages[3]); // 0 , as default value it will be equal 0

        boolean [] foundJob=new boolean[3]; // as default values will be false in boolean array.
        //                  0 1 2

        System.out.println(foundJob[0]); // false
        System.out.println(foundJob[1]); //false ,

        foundJob[0]=true; // I updated index 0 with value true
        System.out.println("foundJob[0] = " + foundJob[0]); //true


        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");

        // ARRAY UTILS

        // Array is a java library which has some methods

        String [] futureSdets={"Libby", "Gulsum","Gule","Aslihan","Suleyman","Abe"};

        System.out.println(futureSdets); // If I print name of the array , it will print hashcode [Ljava.lang.String;@1540e19d

        System.out.println(Arrays.toString(futureSdets)); // [Libby, Gulsum, Gule, Aslihan, Suleyman, Abe]

        /**
         * Notes: Arrays.toString() is a method that converts an array as a String
         */

        int [] numlist={0,0,78,900};

        System.out.println(numlist); // [I@677327b6 , whichs hashcode for numList

        System.out.println(Arrays.toString(numlist)); //[0, 0, 78, 900]


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //Combine 2 int array

        int [] list1={1,0,5}; // length=3
        //           0  1  2
        int [] list2 ={-90, 78,100,90}; // length= 4
        //              0  1  2     3

        // Expected array will>>  int[] list3={1,0,5 ,-90,78,100}; length =7
        ///  length willbe= list.length+list2.length

        //                     3          +   4
        int [] list3=new int[list1.length + list2.length];

        System.out.println(Arrays.toString(list3));// [0, 0, 0, 0, 0, 0, 0] because I didn't assign any value

        for (int i = 0; i <list1.length ; i++) { // we will put list1 into the list3
            // i=0       0< 3           0++
            // i=1      1<3             1++
            // i=2      2<3
            list3[i] = list1[i];
            // list3 index 0 >> 1
            // list3 index 1 >> 0
            // list3 index 2 >> 5;

        }

        System.out.println(Arrays.toString(list3)); // [1, 0, 5, 0, 0, 0, 0]

        for (int i = 0; i <list2.length ; i++) { // we will put list2 into the list3
            //   i=0    0 < 4           0++
            // i= 1     1 < 4           1++
            // i=2       2<4            2++
            // i=3      3<4             3++
            // i=4     4 <4  false statement

            list3[list1.length + i ] =list2[i];
            // list3 [ 3 + 0] =  -90     = list2[0]
            // list3[ 3 + 1] =>   78      =list2[1]
            // list3[ 3+2 ] >>    100     =list2[2]
            // list3[ 3 + 3]>.    90       =list2[3]
        }

        System.out.println(Arrays.toString(list3)); // [1, 0, 5, -90, 78, 100, 90]
    }
}
