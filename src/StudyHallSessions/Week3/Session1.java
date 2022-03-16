package StudyHallSessions.Week3;

public class Session1 {

    public static void main(String[] args) {
        //Verification for amazon.com title.
        String expectedTitle="amazon.com";
        String actualTitle="Amazon.com. Spend less. Smile more.";

        if (expectedTitle==actualTitle){
            System.out.println("Test case passes. YAY");
        }else {
            System.out.println("Test case failed");
            System.out.println("Hey Houston , we have a problem");
        }


        System.out.println("*************");

        //Lottery game

        int userBirthYear=1997;

        int userAge=2022-userBirthYear; // 10

        int myLuckyNumber=36;
        int userLuckyNumber=36;

        //user a
        //    2022-2002  >=18 // true
        if (userAge >=18){//user is 18 or older


               // 36   ==     16==>  false
            if (myLuckyNumber==userLuckyNumber){ // user is 18 or older and user picked lucky number
                System.out.println("Congrats, You won 1 million $$$");

            }else { //user is 18 or older
                System.out.println("Please try again");
            }

        }else {// user is younger than 18;
            System.out.println("You can not play this game because of your age");

        }

        ////Question 3
        ////Discount and Revenue
        ////Revenue can be calculated as the selling price of the product times the quantity sold, i.e.
        // revenue = price × quantity. Write a program that asks the user to enter product price and quantity and then calculate the revenue.
        // If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue.

        //Variables
        double discount=0;
        double revenue =0;

        double price=50.99;
        double quantity=100;

        revenue = price * quantity;

        if (revenue > 5000){

            discount= 5000 * 0.10;  // percentage 80% ==> 0.8 ,, percentage 25, 0.25;

            revenue = revenue - discount;
            // net revenue

            System.out.println("revenue = " + revenue);
            System.out.println("discount = " + discount);

        }




    }
}
