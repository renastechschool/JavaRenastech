package StudyHallSessions.Week8;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Session1 {
    public static void main(String[] args) {

        //Difference between Array and Arraylist

        // 1 -- //In Java, ArrayList is a class of Collections framework
        //An array is a basic functionality provided by Java

        //2 -Syntax
        //Array >>  Datatype [] name ={};
        int [] numbers={23,56,90,6};
        String [] names=new String[]{"Ezgi","Gulsum","Yousef","Omer"};

        //Arraylist
        ArrayList<Integer> numbers1=new ArrayList<>();
        ArrayList<String> names1=new ArrayList<>();

        //3- Sizes
        // Array size is fixed, but ArrayList size is dynamic,changeable.

        int [] ages=new int[2]; // size of ages is 2;

       // ages[3]=34;  // ArrayIndexOutOfBoundsException: because ages size is 2;

        ArrayList<Integer> agesList=new ArrayList<>(); // size can be changes. Dynamic.
        agesList.add(45);
        agesList.add(23);
        agesList.add(23);

        //4-  Access to Elements.

        int [] number1={1,2,3,5};
        //              0 1 2 3
        System.out.println(number1[1]); // 2

        ArrayList<Integer> numbers2=new ArrayList<>();
        numbers2.add(45); // index 0
        numbers2.add(23); // index 1
        numbers2.add(23); // index 2

        System.out.println(numbers2.get(0)); //45


        //5- An array can contain both primitive data types as well as objects of a class depending on the definition of the array.
        // However, ArrayList only supports object entries, not the primitive data types.

        int [] array=new int[4];
        boolean[] array2=new boolean[4];

        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        arrayList.add(3);
        arrayList.add(0);

        ArrayList<Double> doubleArrayList=new ArrayList<>();

        // 6- Getting size or length

        System.out.println(array.length); // for array length   >> //4
        System.out.println(arrayList.size()); // for arraylist size() >>>// 2


        //7-  Multi-Dimensional : Array can be multi dimensional , but Arraylist doesn't have multi-dimension

        String [][] teams={{"mike","Gule","Esra"},{"Gulsen","sezar","Ozgur"},{"Ugur","Lopez","Firat"}};

        System.out.println(teams.length); // 3

        //ArrayList can not be multi Dimensional.


        // Find max number in an Array

        int [] team1ages={25,26,40,30,50,18};

        int maxNumberinArray=team1ages[0];

        for (int i = 0; i <team1ages.length ; i++) {

            if (team1ages[i] > maxNumberinArray){

                maxNumberinArray=team1ages[i];
            }

        }

        System.out.println("maxNumberinArray = " + maxNumberinArray);
        //maxNumberinArray = 50


        //Find max number in an ArrayList

        ArrayList<Integer> team2ages=new ArrayList<>();

        team2ages.addAll(Arrays.asList(23,45,80,15,23)); // will add multiple data

        System.out.println(team2ages); // [23, 45, 80, 15, 23]

        int maxInTeam2=team2ages.get(0);

        for (int i = 0; i < team2ages.size() ; i++) {

            if (team2ages.get(i) >maxInTeam2){

                maxInTeam2=team2ages.get(i);
            }

        }

        System.out.println("maxInTeam2 = " + maxInTeam2); //maxInTeam2 = 80



    }
}
