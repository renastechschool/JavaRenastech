package day22_List;

import MyUtils.GenericUtils;

import java.util.ArrayList;

public class c5_List {

    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects

    // int [] arr=new Int[3];
    // ArrayList<DataType>  listName = new ArrayList<DataType>();
    //DataType can not be primitive
    //has to be wrapper class object or different object type

    //ArrayList: part of Collections
    //			does not support primitives, only support none primitives
    //			size is dynamic, automatically adjusted
    //			has index numbers

    //what is the differences between array and array list
    //1.size = array size is fixed and ; arrraylist size is dynamic (flexible)
    //2.array accepts primitives arraylist doesnt accept primitives
    //3.array is data structure and arraylist is part of collection data structure

    public static void main(String[] args) {
        // ArrayList<DataType>  listName = new ArrayList<DataType>();
        // ArrayList <int> list1=new ArrayList<int>(); collection doesnt accept primitives
        ArrayList<Integer> list2= new ArrayList<>();
        //what is the size of this list ? == 0 (for now since we didnt add anything in our list)

        //add() this method will add data to your list
        list2.add(55);//size of list2 = 1  index = 0
        list2.add(0); // size of list 2 = 2 index = 1
        list2.add(100); // size of list 2 = 3 index = 2
        list2.add(3000); // size of list 2 = 4 index = 3

        System.out.println(list2);

        int [] numbers= new int[10];//size is fixed 10

        //get() that will give you specific data from your list
        Integer numIndex1=list2.get(1);
        System.out.println("numIndex1 = " + numIndex1);

        System.out.println(list2.get(3));

       // System.out.println(list2.get(4));//IndexOutOfBoundsException

        //list2.get(0); 55 as wrapper object
        int number3 = list2.get(2); //
        //unboxing will help us to store wrapper object in the primitive data type
        System.out.println("number3 = " + number3);

        ArrayList<String> nameList=new ArrayList<>(); //size 0
        nameList.add("SK");
        nameList.add("LA");
        nameList.add("SHR"); // size = 3 ,, lastIndex=2

        System.out.println(nameList);



        //
        System.out.println("nameList.get(0) = " + nameList.get(0));
        System.out.println("nameList.get(1) = " + nameList.get(1));
        System.out.println("nameList.get(2) = " + nameList.get(2));

        //size() will give us size of arraylist
        System.out.println("nameList.size() = " + nameList.size());
        //last index == size -1

        //print me each name from arraylist
        System.out.println("Names Are : ");

        for (int i=0 ; i <= nameList.size() -1 ; i++){
            System.out.println("nameList.get("+i+") = " + nameList.get(i));
        }

        GenericUtils.Stars();

        for (String each : nameList){
            System.out.println(each);
        }

        nameList.add("EG");
        System.out.println("nameList.size() = " + nameList.size());


    }



}
