package day04_Operators;

public class c2_task {
    public static void main(String [] args){

        //create 3 different number
        // second number should be = first number + 7
        // third number should be  = second number + 8
        //ex : x=25  , y= 32 , z= 40 .
        //ex : x=20 , y= 27 , z= 35 .

        int x= 20; // 20
        //y =17    // 27
        //z =25    // 35

        int y= x + 7;//Y=27
        int z= y + 8;//z= 27 + 8 =35

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //sum of those 3 numbers
        System.out.println("Sum of numbers are : " + (x+y+z) );

    }
}
