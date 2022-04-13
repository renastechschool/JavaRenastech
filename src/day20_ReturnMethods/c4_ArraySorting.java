package day20_ReturnMethods;

import MyUtils.GenericUtils;

import java.util.Arrays;

public class c4_ArraySorting {

    public static void main(String[] args) {
        int [ ] numbers = {5,45,67,89,0,2,4,21,47};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //System.out.println("&&&&&&&&&&&&&&&&");
        GenericUtils.Stars();
        int [] numbers2={5,45,67,89,0,2,4,21,47};
        descendingSort(numbers2);

        //System.out.println("*******");
        GenericUtils.Stars();

        //int [] descendingResult = descendingSort(numbers2); void doesnt have any return
        int [] descendingResult = descendingSort2(numbers2);
        System.out.println(Arrays.toString(descendingResult));
    }

    //create a  method that will will print array in descending order
    public static void descendingSort(int [] arr){
        //first i will sort it and reverse the arrray
        //so i can have from large to small
        Arrays.sort(arr);

        int []descArr=new int[arr.length];
        int lastIndex= arr.length -1 ;

        for (int i =0 ; i < descArr.length ; i ++){
            //descArr[0] == arr[lastindex]
            //descArr[1] == arr[lastindex-1]
            //descArr[2] == arr[lastindex-2]
            //descArr[3] == arr[lastindex-3]
            //....
            //descarr[lastindex]==arr [0]
            descArr[i]=arr[lastIndex];
            lastIndex--;

        }

        System.out.println(Arrays.toString(descArr));
    }

    //create a return method that will print array in descending order
    //logic is to take an array and return that array in descending order
    //that means my return type is int []
    public static int [] descendingSort2(int [] arr){
        //first i will sort it and reverse the arrray
        //so i can have from large to small
        Arrays.sort(arr);

        int []descArr=new int[arr.length];
        int lastIndex= arr.length -1 ;

        for (int i =0 ; i < descArr.length ; i ++){
            //descArr[0] == arr[lastindex]
            //descArr[1] == arr[lastindex-1]
            //descArr[2] == arr[lastindex-2]
            //descArr[3] == arr[lastindex-3]
            //....
            //descarr[lastindex]==arr [0]
            descArr[i]=arr[lastIndex];
            lastIndex--;

        }

        return descArr;
    }


}
