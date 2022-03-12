package day06_if_ternary_nestedif;

public class c1_multiIfStatement {

    //short cut of main method  : main + enter

    public static void main(String[] args) {

        // starting point is 0                                      print  you are at starting point
        // ending  point  is 10                                     print  you are at ending point
        // between those numbers (0-10) will be  on my way          print  you are on your way
        // anything left will be wrong way                          print some warning mesegaes

        //int to store a number
        //if ;else if ;else if .. else

        int point=100;

        if (point==0){ // we covered only 1 scnerio which is point = 0 ;
            System.out.println("You are at starting point");
        }else if (point == 10){ // we covered only 1 scnerio which is point =10;
            System.out.println("You are at ending point");
        }else if(point>0 && point<10){ // we covered 9 scnerio -- 1 2 3 4 5 6 7 8 9
            System.out.println("You are on your way");
        }else {
            System.out.println("You are on wrong way");
            System.out.println("Please check your point " + point);
            System.out.println("Point has to be between 0-10 !!!!!");
        }


    }
}
