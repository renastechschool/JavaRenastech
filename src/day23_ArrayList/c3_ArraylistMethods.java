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

        //set(index,data) //reassigning your datas
        //method will set value for given index
        //set 5 to 555 ; index number 5 wont be anymore 47 it will be 555
        numbers.set(2,11);
        System.out.println(numbers);//[20,5,11,50,500 ,47]

        ArrayList<String > letters=new ArrayList<>();
        System.out.println(letters);//[]

        letters.add("B");//0
        letters.add("X");//1

        System.out.println(letters);//[B, X]

        letters.add(1,"A");//[B, A,X]
        System.out.println(letters);

        letters.set(0,"N");
        System.out.println(letters);//[N, A,X]

        letters.add("A");
        System.out.println(letters);//[N, A, X, A]

        //remove
        letters.remove("A");
        System.out.println(letters);//[N, X, A]
        letters.remove(0);
        System.out.println(letters);//[X, A]

        letters.remove("T");
        System.out.println(letters);
        ////remove method will look at given object or index to remove it if it is present it will removve
        //        //if it is not presnet nothing will change

        boolean b1=letters.remove("R"); //false
        System.out.println(b1);

        //clear
        letters.clear();
        System.out.println(letters);//[]

        if (letters.size() == 0 ){
            System.out.println("clear method worked");
        }else {
            System.out.println("Clear method is not working");
        }

    }
}
