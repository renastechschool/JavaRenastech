package day17_Arrays;

import java.util.Arrays;

public class c1_ArrayEqual {

    public static void main(String[] args) {

        //arrays equal
        int [] arr1={3,5,7};
        int [] arr2={5,3,7};
        int [] arr3={3,5,7};
        int [] arr4={3,4,7};

        boolean b1= Arrays.equals(arr1,arr2); //false
        boolean b2=Arrays.equals(arr1,arr3); //true
        boolean b3= Arrays.equals(arr2,arr3); //false
        boolean b4= Arrays.equals(arr3,arr4); //false

        System.out.println(b1 + " , " + b2 + " , "+b3 + " , "+b4);

        //only condition that arrays will be equal is if both array equal with value and order

        Arrays.sort(arr1);//{3,5,7};
        Arrays.sort(arr2);//{3,5,7};
        Arrays.sort(arr3);//{3,5,7};
        Arrays.sort(arr4);//{3,4,7};


        boolean b11= Arrays.equals(arr1,arr2); //t
        boolean b21=Arrays.equals(arr1,arr3); //true
        boolean b31= Arrays.equals(arr2,arr3); //t
        boolean b41= Arrays.equals(arr3,arr4); //false

        System.out.println(b11 + " , " + b21 + " , "+b31 + " , "+b41);

    }


}
