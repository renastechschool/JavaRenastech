package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class c6_CollectionsExtra {


    ///All of those collections method will work any arraylisttype String,Double,Integar ,Boolean ....
    // Collections Class:
    //
    //        sort(CollectionType): this will sort any given collectionType
    //
    //        frequency(CollectionType, Object): this will return the frequency of the given object
    //        from the given collectionType
    //
    //        max(CollectionType): this will return the biggest object from collectiontype
    //
    //        min(CollectionType): this will return the smallest object from collectiontype
    //
    //        swap(CollectionType, index1, index3): this will swap the index1 and index 3
    //
    //        replaceAll(CollectionType, oldData, newData):


    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(4,5,6,7,8,3,35,9,9,999));

        //        max(CollectionType): this will return the biggest object from collectiontype
        System.out.println(Collections.max(numbers));

        //        min(CollectionType): this will return the smallest object from collectiontype
        System.out.println(Collections.min(numbers));

        //get second max
        Integer max=Collections.max(numbers);
        numbers.remove(max);
        System.out.println("Second max " + Collections.max(numbers));

        //        swap(CollectionType, index1, index3): this will swap the index1 and index 3

        ArrayList <Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(100,10,1,4,5,10,10,10));
        System.out.println(list3);

        Collections.swap(list3,0,3);
        System.out.println(list3);

        //    //        replaceAll(CollectionType, oldData, newData):
        Collections.replaceAll(list3,10,22);
        System.out.println(list3);
    }
}
