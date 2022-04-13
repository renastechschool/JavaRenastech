package day20_ReturnMethods;

import MyUtils.GenericUtils;

import java.util.Arrays;

public class c5_utilPractice {

    public static void main(String[] args) {
        GenericUtils.hello();
        GenericUtils.Stars();
        GenericUtils.reverseString("hello world");
        int []arr1= {4,5,3,0,-2,200,500,55};
        GenericUtils.descendingSort(arr1);
        int [] result=GenericUtils.descendingSort2(arr1);
        System.out.println(Arrays.toString(result));
    }
}
