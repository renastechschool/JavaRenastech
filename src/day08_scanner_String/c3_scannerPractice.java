package day08_scanner_String;

import java.util.Scanner;

public class c3_scannerPractice {

    public static void main(String[] args) {
        //how do i use scanner
        //to be able to use scanner librarry we will need to create an object from scanner class
        Scanner object=new Scanner(System.in);

        System.out.println("Enter Employee First Name : ");
        String firstName=object.next();
        //next will accept one word
        //next doesnt accept enter
        System.out.println("firstname is " + firstName);

        //to handle enter that comes after next use below line
        object.nextLine();

        System.out.println("Enter full name for employee : ");
        String fullName=object.nextLine(); //will accept enter
        System.out.println("fullname is " + fullName);

        System.out.println("Enter Employee Age : ");
        int age = object.nextInt();
        System.out.println("employee age is "+age);

        //after passing age we also need to handle enter
        object.nextLine();//will accept enter that comes after age

        System.out.println("Enter Employee City");
        String cityName=object.nextLine();
        System.out.println("city name is " +cityName);

        System.out.println("Enter salary for employee :");
        double salary = object.nextDouble();
        System.out.println("Salary is "+ salary);


    }
}
