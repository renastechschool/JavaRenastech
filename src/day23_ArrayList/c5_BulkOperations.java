package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class c5_BulkOperations {

    /*
       Bulk Operations:

       contailsAll(CollectionType):

       addAll(CollectionType):

       removeAll(CollectionType):

       retainAll(CollectionType):
       //
      */
    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(3,5,10,87,123,45,343,78,9,0));
        System.out.println(numbers);

        Integer [] nums={0,2,3,57,6};
        numbers.addAll(Arrays.asList(nums));
        numbers.add(10000);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        //contains
        System.out.println(numbers.contains(0));

        //       contailsAll(CollectionType):
        System.out.println("numbers.containsAll(Arrays.asList(0,2,10,45,57)) = " + numbers.containsAll(Arrays.asList(0, 2, 10, 45, 57)));
        System.out.println("numbers.containsAll(Arrays.asList(0,2,10,45,57)) = " + numbers.containsAll(Arrays.asList(11, 2, 10, 45, 57)));

        //removeall this will remove all the matching objects from the arraylist
        //remove will only remove first matching one

        ArrayList<Double> nList=new ArrayList<>();
        nList.addAll(Arrays.asList(1.0,2.0,2.5,1.0,2.0,1.0,5.4,6.3,2.0,2.0,2.0,2.0));
        Double num=2.0;
        nList.remove(num);//this will remove first 2.0
        nList.remove(num);//this will remove second 2.0
        System.out.println(nList);

        nList.removeAll(Arrays.asList(1.0));
        System.out.println(nList);


        //       retainAll(CollectionType):
        //will search for given data and it will keep them . others will be removed

        ArrayList<Integer> list5=new ArrayList<>();
        list5.addAll(Arrays.asList(1,1,11,1,1,2,2,2,3,3,3,55,5,54,4));

        System.out.println(list5);

        list5.retainAll(Arrays.asList(11,2));
        System.out.println(list5);
    }




}
