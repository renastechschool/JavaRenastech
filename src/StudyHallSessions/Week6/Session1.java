package StudyHallSessions.Week6;

import java.util.Arrays;

public class Session1 {
    public static void main(String[] args) {
  //Create a java program that will print only numbers that divisible by 3,  int [] arr={23,25,26,32,42,51,99,2};


        int [] arr={23,25,26,32,42,51,99,2};
        //         0  , 1  2 ....... lastindex== length-1;

        for (int i = 0; i < arr.length ; i++) { // this logic to loop my int array

            // we will check which number is divisible by 3
            if (arr[i] %3==0 ){
                // we will print if number divisible by 3
                System.out.print(arr[i] +" ");
            }

        }

         System.out.println("");
        System.out.println("***********************");
   //Create a java program that will print sum of the ODD numbers from given array.  int[] arr={2,3,5,6,56,0,53};

        int[] list1={2,3,5,6,56,0,53};
        //           0,1,2,3,4,5,6 == > lastIndex => lenght-1
        int startingPoint=0;
        int endingPoint=list1.length-1 ;

        int sumOfOddNumbers=0; // we will store our answer in this variable

        while (startingPoint <= endingPoint){ // we will loop list1 Array with while loop

            // we will decide which number is odd number
            if (list1[startingPoint] %2 != 0){

                sumOfOddNumbers=sumOfOddNumbers+list1[startingPoint];
                 //sumOfOddNumbers += list1[startingPoitn]
            }
            startingPoint++;//0 ++ , 1 .. lastPopint= 7 will break itself when while loop statement is false

        }

        System.out.println("sumOfOddNumbers = " + sumOfOddNumbers);
        // sumOfOddNumbers = 61



        //Create a java program that will print how many java is in the given String array=.
        // String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"}

        String [] names={"jAvA","name1","name2","JAVA","JAVA","C","R" ,"Java"};
        //

        int count = 0;// Step-1 : Create my variable to store answer.

        //              i< names.length
        for (int i = 0; i <= names.length -1; i++) {

          //   System.out.println(names[i]); will print all names
            if (names[i].equalsIgnoreCase("java")){
                count++;

            }
        }

        System.out.println("Java is repeated "+count+" times"); // Java is repeated 4 times

        //create a java program that will print numbers from biggest numbet to smallest number.
        // int [] arr={2,90,4,-99, 99,73};

        int [] numbers={2,90,4,-99, 99,73};

        int [] newArray=new int[numbers.length]; // we will use this int array to store our answer

        System.out.println("numbers.length = " + numbers.length); //numbers.length = 6
        System.out.println("newArray.length = " + newArray.length); //numbers.length = 6

        Arrays.sort(numbers); // [-99, 2, 4, 73, 90, 99]

      //  newArray[9]=90; // ArrayIndexOutOfBoundsException: 9


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newArray)); //>> 

        int temp=0; // we will temp for index number in new Array int.

        //
        for (int i =numbers.length-1 ; i >=0 ; i--) {

            newArray[temp] = numbers[i];
            // temp= 0, 1 ,2

            temp++;   // 0++
        }
        System.out.println(Arrays.toString(newArray));// [99, 90, 73, 4, 2, -99]





    }
}
