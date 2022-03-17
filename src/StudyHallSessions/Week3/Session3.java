package StudyHallSessions.Week3;

import java.util.Scanner;

public class Session3 {
    public static void main(String[] args) {

        /**
         * // Ask user to enter a number by using scanner
         * // if number is divided by 5 and 3 print FinRa
         * // if number is divided by 3 print Fin
         * //if number is divided by 5 print RA
         */


        // Ask user to enter a number by using scanner

//        Scanner input=new Scanner(System.in);
//        System.out.println("Please enter a number \nPlease enter only a number");
//        int number=input.nextInt();// 6, 90, 52
//
//        //if number is divided by 5 and 3 print FinRa
//        if (number % 5 ==0  && number % 3 ==0){
//            System.out.println("FinRa");
//
//            //if number is divided by 3 print Fin
//        }else if(number %3==0){
//            System.out.println("Fin");
//
//            ///if number is divided by 5 print RA
//        }else if (number % 5==0){
//            System.out.println("RA");
//        }else {
//            System.out.println("Your number is not divisible  by 3 or 5");
//        }

        System.out.println("*************************");

        /**
         *
         // Ask user to enter their firstname , last name and middle name
         //And print user's initials
         // if user doesn't have middle name user will enter N/A
         */

        // charAt();
//
//        Scanner input2=new Scanner(System.in);
//        System.out.println("Please enter your FirstName");
//        String userFirstname = input2.nextLine();// first data will be user First name
//
//        System.out.println("Please enter your lastname");
//        String userLastName=input2.nextLine(); // second data will be user last name
//
//        System.out.println("Please enter your middle name if not applicable enter N/A , n/a");
//        String userMiddleName=input2.nextLine(); // 3rd data will be user middle name
//
//
//        String myName="Renastech";
//        //            myName.charAt(0); => R, INDEX STARTS WITH O !!
//
//
//
//
//        //And print user's initials
//
//        //if user does not have middle name
//        if (userMiddleName.equals("N/A") || userMiddleName.equals("n/a")){
//            // false or false
//
//            System.out.println(userFirstname.charAt(0)+"."+userLastName.charAt(0));
//            //                    R                     .S
//
//            // if user has a middle name
//        }else{
//
//            System.out.println(userFirstname.charAt(0)+"."+userMiddleName.charAt(0)+"."+userLastName.charAt(0));
//
//        }


//
        String name="Gulsum";
        //           01234
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(4));

        //          name= Gulsum 5
   //     System.out.println(name.charAt(100)); //String index out of range: 100
     //   System.out.println(name.charAt(6));// String index out of range: 100

        System.out.println("***********************");

        System.out.println("u"=="U");

        //        System.out.println("Please enter your name");
//        String wordName=input3.nextLine(); //"true", "90" ,"0.00"
        // System.out.println(wordName);


     //   System.out.println("Please enter your age");
      //  int age=input3.nextInt();


        /**
         * // Ask user to enter 3 names by using scanner
         * // print last index of the namas with the names
         * // Example : Renastech --> Last index is h for Renastech
         */

        Scanner input3=new Scanner(System.in);
        System.out.println("Please enter your name");
        String myname=input3.nextLine();

        // Ozgur -->
        System.out.println(myname.charAt(myname.length()-1));

















    }


}
