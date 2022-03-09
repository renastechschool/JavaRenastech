package day04_Operators;

public class c6_AssigmentOperators {

    public static void main(String [] args){

        int number=125;
        System.out.println(number);

        //if you want to reassign your number to 100
        number = 100;
        //
        System.out.println(number);

        int number2=25;
        number2=number;
        System.out.println(number2);

        //
        int x=10;
        x=x+10;//x=10+10 = 20
        System.out.println(x);//20
        x=x+30;//x=20+30 =50
        System.out.println(x);

        x += 100; // x = x+100
        System.out.println(x);

        int y=20;
        y = y+20; //40 == y= 20+20 ==40
        y += 20 ; //60  y = y+20  --- y = 40 +20 ==60

        y *= 2; // y = y * 2 =60 *2 =120


    }
}
