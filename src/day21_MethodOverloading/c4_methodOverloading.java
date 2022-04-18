package day21_MethodOverloading;

import java.util.Arrays;

public class c4_methodOverloading {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        String [] names={"b" ,"LA","AS","HIC" , "G"};
        char [] letters={'M','l','a' , 'h' , 'g' , 's'};

        Arrays.sort(names);
        Arrays.sort(arr);
        Arrays.sort(letters);

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(letters));


        System.out.println(concatenation("hello", "world", "java"));
        System.out.println(concatenation("hello", "world"));
    }

    //task create method that concats 2 string
    //task create method that concats 3 string

    public static String concatenation(String str1,String str2){

        return str1.concat(" " + str2) ;
    }
    public static String concatenation(String st1,String st2, String st3){
        return st1.concat(" " + st2).concat(" "+st3);
    }

}


