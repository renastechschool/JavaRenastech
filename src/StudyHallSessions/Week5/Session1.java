package StudyHallSessions.Week5;

public class Session1 {
    public static void main(String[] args) {
        //Reverse an int

        int myNumber=123;  // 001
        // expected answer = 25


        int answerofInt=0; // will store answer in this variable


        // as long as my my number is not 0 , while loop will run
        // 52 !=0 >> true
        // 5 != 0 >> true
        // 0! = 0 >> false
        while (myNumber!=0){
           //                 52 % 10 = 2
            //                  5 % 10 = 5
            int remainderOf10= myNumber %10;
            //            0 * 10= 0 + 2
            //           2 * 10 = 20 +5
            answerofInt =answerofInt * 10 + remainderOf10;   // answer= 2 at first time ,, answer = 25

            //52 / 10 = 5
            // 5 /10 = 0.5 ==> type is int and it will = 0
            myNumber /=10;


        }

        System.out.println(answerofInt);







    }
}
