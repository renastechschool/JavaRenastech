package day20_ReturnMethods;

public class c2_ReturnMethods {


    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)
    //statments ,code
    //}

    //Access-Modifer =public, protected ,default ,priavate
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has paramertes some dont have parameter

    //create a method that will print minumum number from 2 number
    public static void minNumber(int i1,int i2){
        String result="";
        if (i1<i2){
            result= i1 + " is min";
        }else if (i2<i1){
            result = i2 + " is min";
        }else {
            result = "equal";
        }

        System.out.println(result);
    }
    //void means any data type and doesnt need to return anything


    public static int  minNumber2(int i1,int i2){
        int result=0;
        if (i1<i2){
            result= i1 ;
        }else if (i2<i1){
            result = i2 ;
        }else {
            result = i1;
        }


        //you have to return a string
        //return result;
        return result;
    }

    public static void main(String[] args) {

        minNumber(63,44);
        minNumber(23,35);
        minNumber(13,115);
        minNumber(0,35);
        minNumber(23,0);
        minNumber(2,35);

        /*
        Group 1 63 ,44
        Group 2 23 , 35
        Group 3 13 , 115
        Group 4 0 , 35
        Group 5 23 , 0
        Group 6 2 , 35
         */

        //Get min number for each group
        //add 10 to result of group 4    == 10
        //remove 10 from result of group 2  == 13

        int group1= minNumber2(63,44);
        int group2= minNumber2(23,35);
        int group3= minNumber2(13,115);
        int group4= minNumber2(0,35);
        int group5= minNumber2(23,0);
        int group6= minNumber2(2,35);


        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);


        ////add 10 to result of group 4    == 10
        // remove 10 from result of group 2  == 13
        System.out.println("group4+10 = " + (group4 + 10) );
        System.out.println("group2 - 10 = " + (group2 - 10) );


        System.out.println(division(20, 3));
        int resultDivision = division(40,10);
        System.out.println("resultDivision = " + resultDivision);
        System.out.println("resultDivision*3 = " + (resultDivision * 3) );
    }

    //create a division method
    //2 int as parameter min number
    //return a min number == return type is int
    public static int division(int n1 , int n2){

        System.out.println("Hello This is division method ");
        System.out.println("division of " + n1 + " / "+n2);
       // int result=n1/n2;
        return n1/n2;
    }

    //addition methods
    public static void add1(int number1,int number2){
        System.out.println(number1 + number2);
    }
    public static int add2(int number1,int number2){

        return number1+number2;
    }
    public static byte add3(byte number1 , byte number2){
        return (byte) (number1+number2);
    }



}
