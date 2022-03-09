package day04_Operators;

public class c2_task {
    public static void main(String [] args){

        //create 3 different number
        // second number should be = first number + 7
        // third number should be  = second number + 8
        //ex : x=25  , y= 32 , z= 40 .
        //ex : x=20 , y= 27 , z= 35 .

        int x= 30; // 20
        //y =17    // 27
        //z =25    // 35

        int y= x + 7;//Y=27
        int z= y + 8;//z= 27 + 8 =35

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //sum of those 3 numbers
        System.out.println("Sum of numbers are : " + (x+y+z) );

        //if x is divisible by 2,3, 5
        //if the x is divisble by 2 ,3 ,5
//        3. check if x is divisible by 2 , 3 , 5  (Check for each number)
//                      if it is divisible print : x is divisible by 2  true
//                      if it is not divisible print : x is divisible by 2 false

        //x=20
        //this is divisible by2
        //System.out.println("20 is divisible by 2 true");

        //if number is divisible by 2 == that means number has remiander as 0
        boolean divisibleBy2forX= x % 2 ==0; //if remiender is equal 0 that means number is divisible by 2

        System.out.println(x + " is divisible by 2 :" + divisibleBy2forX);

        boolean divisibleBy3forX= x % 3==0; //25%3 ==1 false

        System.out.println(x + " is divisible by 3 : " + divisibleBy3forX);

        System.out.println(35/3); //11
        System.out.println(35%3); //2


    }
}
