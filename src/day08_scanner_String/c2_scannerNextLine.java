package day08_scanner_String;

import java.util.Scanner;

public class c2_scannerNextLine {

    public static void main(String[] args) {


        //for the strings we can use next or nextline

        Scanner input=new Scanner(System.in);

//        System.out.println("Enter Full Name");
//        //String fullName=input.next();//next only accepting one word so if you have more then one
//        //its better to use nextline
//        String fullName=input.nextLine();
//        System.out.println(fullName);

        Scanner input2=new Scanner(System.in);
        System.out.println("Employee First name ");
        String firstName=input2.next();//next is not accepting enter
        System.out.println("First  name is : " + firstName);

        input2.nextLine();//this line to accept enter

        System.out.println("Employee fullname");
        String fullname=input2.nextLine(); // accepting enter
        System.out.println("full name is : "+fullname);
    }
}
