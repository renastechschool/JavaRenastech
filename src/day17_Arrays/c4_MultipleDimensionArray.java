package day17_Arrays;

import java.util.Arrays;

public class c4_MultipleDimensionArray {

    public static void main(String[] args) {
        //declaration of array
        //1 dimension array
        //Datatype [] name = { data1,data2 ,data3}
        //2 dimension array
        //Datatype [][] name =
        // {
        //      { data1,data2 ,data3},
        //      { data1,data2  },
        //      { data1,data2 ,data3}
        //      { data1,data2 ,data3}
        // }


        int [] arr={1,2,3,4,5};
                 // 0 1 2 3 4
       // System.out.println(arr[2]);

        System.out.println("arr 1D : " + arr.length);//5

        int [][] arr2= {            {10,20,30} , {0,20,40} , {20,40 }    , {50}   };
        //conteiner indexes             0            1          2
        //index for each number      0  1  2         0 1  2  ,   0  1

        System.out.println("arr 2d : " + arr2.length);  //3

        System.out.println(arr2[2].length); //2

        //arr [][]
        //first bracket is always container number
        //second one is index of variable

        System.out.println(  arr2[1][2] );
        //arr2[1][2]  : get index1 container and get index2 from index1 conteiner

        //print 30
        System.out.println(arr2[0][2]);

        //print 50
        System.out.println(arr2[3][0]);

        System.out.println("&&&&&&&&&&&&&&&");
        //to get length of each container
        System.out.println(arr2[0].length);
        System.out.println(arr2[2].length);
        System.out.println(arr2[3].length);
//        System.out.println(arr2[5].length);


        //if i want to print all the numbers from specific container
        System.out.println(Arrays.toString(arr2[2]));


        int [] container0 = arr2[0];


    }
}
