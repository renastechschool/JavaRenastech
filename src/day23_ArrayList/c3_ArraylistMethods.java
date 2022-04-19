package day23_ArrayList;

import java.util.ArrayList;

public class c3_ArraylistMethods {

    //add
    //get
    //size

    //ArrayList<DataType> myNumbers = new ArrayList<Integer>(); // Valid

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(); //size is 0
        //add method will always add at the end
        numbers.add(5); //index 0
        numbers.add(50); //index 1
        numbers.add(500); //index 2

        System.out.println(numbers); //[5,50,500]
        numbers.add(0 , 20); //[20,5,50,500]
        System.out.println(numbers);

        numbers.add(2,100);//[20,5,100,50,500]
        System.out.println(numbers);

        //add(index , data)
        //this method will add your data to specific index that you want

        //numbers.add(8,47);//IndexOutOfBoundsExceptio
        int sizeOfList=numbers.size();
        System.out.println("sizeOfList = " + sizeOfList); //size is 5 last index 4
        numbers.add(5,47);
        //numbers.add(47)
        System.out.println(numbers);//[20,5,100,50,500 ,47]
    }
}
