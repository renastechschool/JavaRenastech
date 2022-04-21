package StudyHallSessions.Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Session2 {
    public static void main(String[] args) {
        //Question 1
        //    (String) Sum of Digits in a string
//    Write a method that can return the sum of the digits in a string

        //Excepted output= 44
        String str = "a4v6aaa9!4489";
        System.out.println(sumOfDigits(str));
//Question 2
        //        (ArrayList) Remove "Amed"
//        Given a list of people' names: "Amed", "hello", "mike","renas","Amed",""...)
//        Write a java operation to remove all the names named Ahmed


        //Solution 1
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "sevgin", "sevgin", "ridvan"));
        //   System.out.println(names);
        // names.removeAll(Arrays.asList("sevgin")); // to remove duplicates
        // names.remove(1); // to remove one variable using index numbber
        //  System.out.println(names);

        //Using a custom method
        removeAllDupNames(names, "sevgin");

        //Solution 2

        List<String> names2 = new ArrayList<>(Arrays.asList("Ulzana", "Libby", "Sanjay", "ridvan", "ridvan"));
        Iterator<String> it = names2.iterator();
        System.out.println(names2);
        while (it.hasNext()) {//commonly used with List object

            if (it.next().equals("ridvan")) {
                it.remove();
            }
        }

        System.out.println(names2);

        //Question 3
        //        (ArrayList) Remove Some Values
        //        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 6, 7, 8, 87, 76, 101, 100, 121, 133, 234));
        //  System.out.println(numbers);
        // System.out.println(numbers.size());
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > 100) {
                numbers.remove(i);
                i = 0;
            }
        }
        System.out.println(numbers);
//we will go over this solution in the next class

    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        int sum2 = 0;
        char[] ch = str.toCharArray();
        for (char each : ch) {
            if (each >= 48 && each <= 57) {//This is range from ASCII table which is digits 0-9
                sum += Integer.parseInt("" + each);
            }
            if (Character.isDigit(each)) {
                sum2 += Integer.valueOf("" + each);
            }

        }

        return sum2;
    }

    public static void removeAllDupNames(ArrayList<String> names, String nameToBeRemoved) {
        System.out.println(names);//names Arraylist before removal
        names.removeAll(Arrays.asList(nameToBeRemoved));
        System.out.println(names);//Names arraylist after removal

    }

}
