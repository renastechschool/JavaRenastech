package day16_Arrays;

import java.util.Arrays;

public class c3_ArrarysPractice {

    public static void main(String[] args) {

        //Create a pragram what will print numbers from biggest to smallest in given array.

        int [] numbers={34, 50 ,90 ,99,-90}; // expected output= [99, 90, 50,34 ,-90]
        System.out.println(Arrays.toString(numbers)); // [34, 50, 90, 99, -90]

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //[-90, 34, 50, 90, 99]  => length =5
        //                                               0     1   2   3   4
        int [] biggestToSmallest=new int[numbers.length];  // 5 , numbers.length

        int temp=0;

        //      i=  5-1=4
        for (int i = numbers.length-1; i >=0; i--) {
            //  i=4                     4>=0   i--
            // i= 3                       3>=0  i--
            // i=2                       2>=0   i--
            // i= 1                     1> =0    i--
            // i=0                     0 >= 0    i--
            // i=-1                   -1>=0  false condition and then for loop ends.

            biggestToSmallest[temp] = numbers[i];

            // biggestToSmallest[0]=  numbers[4] >>>>> 99
            // biggestToSmallest [1]=  numbers[3]>>>>> 90
            //biggestToSmallest[ 2] = numbers[2] >>>> 50
            //biggestToSmallest[3] = numbers[1]>>>  34;
            //biggestToSmallest[4]= numbers[0] >>>> -90

            temp++; //0++ , 1++ , 2++, 3++ , 4++
        }
        System.out.println("******************************");

        System.out.println(Arrays.toString(biggestToSmallest)); // [99, 90, 50, 34, -90]


        System.out.println("*******************************************");
        ////write a program that can return the largest string of text from an array
        ////ex         String[] names = {"denver", "texas", "orlando", "Toronto", "jeniffer", "sevgin", "renastechschool"};
        ////output :renastechschool


        //             len = 6        5        7          7          9      6                14
        String[] names = {"denver", "texas", "orlando", "Toronto", "jeniffer", "sevgin", "renastechschool"}; // names lenght=7
//                        0          1          2         3         4           5         6
        //length of the index 2
        System.out.println(names[2].length()); // 7

        int maxLenghtIndex=0; // assume that names index 0 has longest length;

        for (int i = 0; i < names.length ; i++) {

            System.out.println(""+ names[i]+ " has "+ names[i].length()+" lenght");
            //   i=0    0< 7             i++
            // i=1     1<7


            //   names[0].lenght 6 > 6
            //  name[1].lenght   5 > 6
            if (names[i].length() > maxLenghtIndex){
                maxLenghtIndex=i;

            }

        }

        System.out.println("**********************");
        System.out.println(names[maxLenghtIndex]);












    }
}
