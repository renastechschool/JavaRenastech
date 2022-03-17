package day09_StringMethods;

import java.util.Scanner;

public class c4_TwiterLoginVerificiation {

    //create a logic that will check login function of facebook,twitter,gmail.
    //correct username = renastech
    //correct password = renastech123

    //use scanner here to pass usernames and passwords
    //do validation of those usernames and password matching with correct credentials

    public static void main(String[] args) {

        String expectedUsername="renastech";
        String expectedPassword="renastech123";

        //correct credentials -- it should pass
            //true username true password
        //false credentials   -- it should fail
             //false username true password
            //false password true username
             //false username false password


        Scanner input=new Scanner(System.in);//this will create an object from scanner

        System.out.println("Enter Username : ");
        String userInputForUsername=input.nextLine();
        System.out.println("Enter Password : ");
        String userInputForPassword=input.nextLine();

        if (userInputForUsername.equals(expectedUsername) && userInputForPassword.equals(expectedPassword)){
            System.out.println("You have succesfully logged in !!! ");
        }else {
            System.out.println("Login function has failed");
            System.out.println("invalid credentials please check your credentials");
            System.out.println("your credentials are " +userInputForUsername + " / " + userInputForPassword);
        }




    }
}
