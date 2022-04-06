package day16_Arrays;

import java.util.Arrays;

public class c2_ArraysSorting {

    public static void main(String[] args) {

        // ARRAY METHODS

        //sort : it will sort numbers from smallest number to biggest numbers.

        int [] numbers= {90, -2, 45,87 ,-299 ,4,6};
        System.out.println(Arrays.toString(numbers)); // [90, -2, 45, 87, -299, 4, 6]

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [-299, -2, 4, 6, 45, 87, 90]

        // create a method that will print max number from int array

        //first solution

        int max=numbers[0]; // I assume numbers inndex 0 is max number
        for (int i=0 ; i<numbers.length; i++){

            if (numbers[i] > max){
                max =numbers[i];
            }
        }

        System.out.println("max " +max);

        // solution 2

        int [] ages={24, 89, 100, 5, 25};

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages)); // [5, 24, 25, 89, 100]

        int length=ages.length;

        int maxNumber=ages[length-1];

        System.out.println("maxNumber = " + maxNumber);

        int minNumber = ages[0];

        System.out.println("**************************");

        String [] names={"M Bora","Mustafa", "Ezgi","Sezar"};


        System.out.println(Arrays.toString(names)); // [M Bora, Mustafa, Ezgi, Sezar]

        Arrays.sort(names); // it will sort names as alphabecit numbers

        System.out.println(Arrays.toString(names)); // [Ezgi, M Bora, Mustafa, Sezar]






    }


}
