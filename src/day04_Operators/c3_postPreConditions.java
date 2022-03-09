package day04_Operators;

public class c3_postPreConditions {

    public static void main(String [] args){

        int x=10;

        System.out.println(x);
        //pre condition
        System.out.println(++x); // pre condition will increasse your number by one immediately //11
        System.out.println(x);

        System.out.println(+x);//+ (11)==11
        //one plus wont add anything it is about being possitive or negative

        int y =20;
        System.out.println(y);

        //post condition : post condition wont effect number right away
        //it will effect on next step
        System.out.println(y++);//20
        System.out.println(y);//21

        byte number1=30;
        System.out.println(number1); //30
        System.out.println(--number1); //29 pre


        int number2=50;
        System.out.println(number2--);//post //50 but it will be 49 on next line
        System.out.println(number2--);//post //49 but it will be 48 on next line
        System.out.println(--number2);//pre //48 and since its pre condition it is now 47 on next line 47
        System.out.println(number2);//47
        System.out.println(number2++);//post //47 but it will be 48 on next line
        System.out.println(number2);//48

    }
}
