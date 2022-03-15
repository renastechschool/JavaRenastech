package day07_switch_scanner;


import java.util.Scanner;

public class c6_max_min_numbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter First Number");
        short num1=scanner.nextShort();
        System.out.println("Enter Second Number");
        int num2=scanner.nextInt();
        System.out.println("Enter Third Number");
        int num3=scanner.nextInt();

        //        double > float > long > int > short > byte

        boolean num1Max=num1 > num2 && num1>num3;
        boolean num2Max=num2 > num1 && num2>num3;
        boolean num3max=num3 > num1 && num3>num2;

        int maxNumber = (num1Max) ? num1 : (num2Max) ? num2 : num3 ;

        System.out.println(maxNumber);

    }
}
