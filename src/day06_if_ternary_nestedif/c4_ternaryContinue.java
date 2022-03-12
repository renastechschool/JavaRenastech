package day06_if_ternary_nestedif;

public class c4_ternaryContinue {

    public static void main(String[] args) {

        // if else if else if else with ternary

        //this task :
        //create a java program that takes score of student and prints the grade of student
        //between 100 to 85 is grade A
        //between 70 to 84 is grade B
        //between 60 to 69 is grade C
        //between 40 to 59 is grade D
        //between 0 to 39 is grade F
        //if number is not between 0-100 grade 0 ,,"invalid number"

        //if == ?
        //else == :
        //: ? == else if

        int score=69;
        char grade='0';

        String result ="";
        if (score >= 85 && score <=100){            //between 100 to 85 is grade A
            grade ='A';
        }else if (score >= 70 && score<85 ){        //between 70 to 84 is grade B
            grade = 'B';
        }else if (score >= 60 && score<70){         //between 60 to 69 is grade C
            grade='C';
        }else if (score >= 40 && score<60){         //between 40 to 59 is grade D
            grade='D';
        }else if (score >= 0 && score<40){          //between 0 to 39 is grade F
            grade='F';
        }else { //this part will be true if number is minus or bigger then 100
            grade ='0';
        }

        result = " Student grade is : " + grade;
        System.out.println(result);


        //ternary
        //if () ?
        //else :
        //else if  :()?

        char grade2= (score >= 85 && score <=100) ? 'A' :(score >= 70 && score<85)? 'B'
                :(score >= 60 && score<70)? 'C' :(score >= 40 && score<60)? 'D'
                :(score >= 0 && score<40)? 'F' : '0' ;

        String result2=" Student grade is : " + grade2;
        System.out.println(result2);


    }
}
