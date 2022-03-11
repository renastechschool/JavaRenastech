package StudyHallSessions.Week2;

public class Session3 {

    public static void main(String[] args) {

        int i1=40/3; // 13
        int i2=39/3;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        /**
         *John and Mike both play basketball in different teams. In the latest 3 games, John’s team scored 89,
         * 120 and 103 points, while Mike’s team scored 116, 94, and 123 points.
         *
         * 1. Calculate the average score for each team.
         *
         * 2. Decide which teams wins in average (highest average score), and print the winner to the console with if else statement.
         * Also include the average score in the output.
         *
         * 3. Then change the scores to show different winners.
         * Don’t forget to take into acount there might be a draw (the same average score).
         */

        System.out.println("****************");

        //1. Calculate the average score for each team.
        int johnTeam = (89+120+103)/3;
        int mikeTeam=(116+94+123)/3;

      //  System.out.println(johnTeam);
      //  System.out.println(mikeTeam);

        // stuation 1- John's team wins
        if(johnTeam >mikeTeam){
            System.out.println("Winner is John's team with score of "+johnTeam);

         // situation 2- Mike's team wins
        }else if(mikeTeam > johnTeam){
            System.out.println("Winner is Mike's team with score of "+mikeTeam);

        }else {
            System.out.println("Both team have same score");
        }

        /**  //Task - Buying Liquor.
         * 1- Ask user to enter his/her birth year (example: 1997, 1980, 1890);
         * 2-  Calcualate user's age as a new variable
         * 3-if user is 21 or older print You can buy liquor.
         * 4-If user is younger than 21 ,
         *  Print you can't buy liquor now , but you can buy (21-userAge) year later.
         *  (Example user is 18 years old, it should say "you can't buy liquor now , but you can buy 3 year later")
         */

        System.out.println("******************");

        //Ask user to enter his/her birth year (example: 1997, 1980, 1890);
        int userBirthYear = 2011;

       // Calcualate user's age as a new variable
        int currentYear= 2022;

        //           2022 - 2011 =11
        int userAge =currentYear - userBirthYear;

        //if user is 21 or older print You can buy liquor.

       //  11  > = 21
        if (userAge >= 21){
            System.out.println("You can buy liquor");

            //-If user is younger than 21 ,
        }else {
           // Print you can't buy liquor now , but you can buy (21-userAge) year later.
            System.out.println("you can't buy liquor now , but you can buy "+ (21-userAge) +" years later ");
        }


        if (!false ){
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
            System.out.println("Hello world ");
        }
        else{
            System.out.println("Hello Digor");
        }

        System.out.println("***************");
        /**
         * Mark and John are trying to compare their BMI (Body Mass Index), which is calculated using the formula:
         * BMI = mass / (height * height) (mass in kg and height in meter).
         *
         * Test data:
         * ** Data 1: Marks weights 78 kg and is 1.69 m tall. John weights 92 kg and is 1.95 m tall.
         *
         * Requirements:
         * 1- Create variables for Mark and John.
         * 2- Calculate Mark's and Jonh's BMI as a variable
         * 3- Print who has more BMS using if else statement
         * 4- Repaet same steps for new data (New data sample is in Below)
         *
         * **Data 2: Marks weights 95 kg and is 1.88 m tall. John weights 85 kg and is 1.76 m tall.
         */

        System.out.println("**********");

        //Variables for Mark
        double markWeight=78 ; // as kilogram
        double markHeight=1.69;
        //         BMI  = mass / (height * height)
        double markBMI= markWeight / ( markHeight*markHeight );

        //Variables for john,  John weights 92 kg and is 1.95 m tall.
        double johnWeight= 92; //92.0
        double johnHeight=1.95;
        //         BMI  = mass / (height * height)
        double johnBMI= johnWeight / (johnHeight * johnHeight);


        if (markBMI > johnBMI){
            System.out.println("Mark has higher BMI");
            System.out.println("markBMI = " + markBMI);
        }else if(johnBMI > markBMI){
            System.out.println("John has higher BMI");
            System.out.println("markBMI = " + markBMI);
        }else {
            System.out.println("Mark and John have same BMI");
            System.out.println("markBMI = " + markBMI);
            System.out.println("johnBMI = " + johnBMI);
        }



    }
}
