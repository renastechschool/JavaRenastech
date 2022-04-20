package day23_ArrayList;

import MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Collections;

public class c4_arraylistmethods {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(110);
        list.add(33);
        list.add(-11);
        list.add(-47);

        //indexof(Object) will print index number of the object that you are passing
        //if that object is present in your list you will get index number
        //if object is not present you will get index as -1

        System.out.println(list.indexOf(33));//1
        System.out.println(list.indexOf(-47));//3
        System.out.println(list.indexOf(0));//-1
        System.out.println(list.indexOf(500));//-1

        GenericUtils.Stars();

        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list2.indexOf("B")); //1
        System.out.println(list2.indexOf("b")); //-1

        //contains return boolean condition
        System.out.println(list2.contains("B")); //true

        //all methods that we use with arraylist will return wrapper class object
        //we can store either in wrapper or primitive
        boolean b1=list2.contains("X"); // false //unboxing
        //list2.contains("X");//returns wrapperr

        ///arrays .sort
        //Collections is an library whihc is very usefull with arraylist
        //Collection is data structure

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //equals method
        ArrayList <Integer> num1=new ArrayList<>();
        num1.add(5);
        num1.add(2);

        ArrayList <Integer> num2=new ArrayList<>();
        num2.add(5);
        num2.add(2);
        num2.add(2);

        boolean bool=num1.equals(num2);
        System.out.println(bool);

        Collections.sort(num2);
        System.out.println(num2);
        for (int each : num2){
            System.out.println(each);
        }

        //isEmpty
        num2.clear();
        System.out.println(num2.isEmpty());

        System.out.println(num2.size());

    }



}
