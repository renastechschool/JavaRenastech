package day23_ArrayList;

import java.util.ArrayList;

public class c2_ArraylistReverse {
    //   write a program that can print the list of integers in reversed order
//    ex:
//      list=> {1,2,3,4,5,6}
//      output: 6 5 4 3 2 1

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        //add  numbers from 1 to 10

        for (int i=1 ; i <= 10 ; i++){
            list.add(i);
        }
        System.out.println(list);

        System.out.println("reverseArrayList() = " + reverseArrayList(list));
    }


    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> numbers){

        ArrayList<Integer> reversedList= new ArrayList<>();
        for (int i= numbers.size()-1 ; i >=0 ; i--){

            reversedList.add(numbers.get(i));
        }

        return reversedList;

    }
}
