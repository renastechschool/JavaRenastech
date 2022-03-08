package day3_variablesContinue;

public class c1_aritmeticOperators {

    public static void main(String [] args){
        //plus
        //minus operator
        //multiple operator
        //division
        //reminder

        //dataType variablename=data;

        byte oscarAge=31;
        byte halilAge=69;

        double libbyAge=29.5;
        double muhhamedAge=130.7;

        //plus
        System.out.println(oscarAge+halilAge);
        System.out.println(libbyAge+oscarAge);
        //minus operator
        System.out.println(oscarAge-halilAge);
        System.out.println(muhhamedAge-libbyAge);
        //multiple operator
        System.out.println(oscarAge * 5); //Whole number +-*..  whole number=  whole number
        System.out.println(libbyAge * 2);//having one decimal number will make your result as a decimal
        //division
        System.out.println(libbyAge / 2);//decimal/whole =decimal
        System.out.println(oscarAge / 3);//whole /whole =whole

        System.out.println(5/3); //1
        System.out.println(5/3.0); //1.6666..
        System.out.println(5.0/3.0); // 1.6666..

        //remainder
        System.out.println(10 % 5);// 0

        System.out.println(10 % 3); // 1
        System.out.println(10/3); // 3
        System.out.println(10/3.0); //3.33
        System.out.println(10 % 3.0);//1.0

    }

}
