package day23_ArrayList;

import java.util.ArrayList;

public class c1_ListPratice {

    //create an list of Integers
    //add 4 numbers
    //return maximumnumber

    public static void main(String[] args) {
        ArrayList<Integer> numberList=new ArrayList<>();
        numberList.add(200);
        numberList.add(300);
        numberList.add(400);
        numberList.add(500);
        numberList.add(50);
        numberList.add(5000);
        numberList.add(-5000);

       // int max= numberList.get(1); //assuming index 1 is max number
        int max= Integer.MIN_VALUE; //-2147483648 assuming min number is my max number
        //System.out.println(Integer.MIN_VALUE);

        //create a for loop to compare my list elements with max value
        //if elements is bigger then max reassign max value
        for (int i=0; i< numberList.size() ; i++){

            if (numberList.get(i) > max){ //300 > 200
                max = numberList.get(i); // max = 200  ; 300
            }
        }

        System.out.println(max);

        System.out.println(minNumber(numberList));


    }

    //create a return method that will give min number from arraylist
    public static Integer minNumber(ArrayList<Integer> numberList ){


        Integer min= Integer.MAX_VALUE; //+2147483648 assuming min number is my max number
        //System.out.println(Integer.MIN_VALUE);

        //create a for loop to compare my list elements with max value
        //if elements is bigger then max reassign max value
        for (int i=0; i< numberList.size() ; i++){

            if (numberList.get(i) < min){ //300 > 200
                min = numberList.get(i); // max = 200  ; 300
            }
        }


        return min;

    }


}
