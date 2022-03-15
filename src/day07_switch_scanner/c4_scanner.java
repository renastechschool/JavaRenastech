package day07_switch_scanner;

import java.util.Scanner;

public class c4_scanner {

    public static void main(String[] args) {
        //scanner is a library under java
        //this library has ready methods that you can use it
        //to be able to use this library we need to call them in our class
        //and create object from that library

       // Scanner input=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        //I called scanner class (ready library under java) and we created an object called "input"
        //from Scanner class


        //to import library
        //move your mouse on red line
        // click on option + enter  for mac
        //click on alt + enter for windows

        //to go to library hold on ctrl or command then click on library name

        System.out.println("insert your byte number");
        byte b1 = input.nextByte();
        //in scanner if you assign something that is not on the range of variable you will have exception

        System.out.println(b1);

        System.out.println("enter int number");
        int number=input.nextInt();
        //to be able to use scanner librarry methods you need to call the object
        System.out.println("int number : "+number);


        Scanner scan=new Scanner(System.in);
        //this is another object that we just created and it comes  from scanner class
        //object name is :  scan

        System.out.println("enter short number ");
        short number2=scan.nextShort();
        System.out.println("short number " + number2);


    }
}
