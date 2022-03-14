package day06_if_ternary_nestedif;

public class c5_nestedIf {

    //simply nested if is if conditions inside of if conditions
    //if the main if condition is true then you will check sub if conditions
    public static void main(String[] args) {

//        if (){
//            if (){
//
//            }else if (){
//
//            }else if (){
//
//            }else {
//
//            }
//        }else if (){
//            if (){
//
//            }else if(){
//
//            }else {
//
//            }
//        }else {
//            if (){
//
//            }else if (){
//
//            }else {
//
//            }
//        }

        //to comment everything choose the area
        // then hold on ctrl (windows) + /
        // then hold on command(mac)  + /

        // to get back things that you deleted
        // command + z
        // ctrl + z



        ////this task :
        //    //create a java program that takes score of student and prints the grade of student
        //    //between 100 to 51 is grade A
        //    //between 0 to 50 is grade B
        //    //if number is not between 0-100 grade 0 ,,"invalid number"
        //    if students absent
        //
        //having student present
            //check student grades
        //having student absent
            //no need to check student grade


        int score=-20;
        String  attend="yes";//Yes No
        String result="";

        if (attend == "Yes" || attend =="yes"){//java is case sensitive
            if (score>=51 && score <=100){
                result = " Student was present and Score is : "+  score +" Grade is A";
            } else if (score>=0 && score < 51) {
                result = " Student was present and Score is : "+  score +" Grade is B";
            }else {
                result = " Student was present and Score is : "+  score +" Invalid Number";
            }
        }else if (attend == "No" || attend =="no"){
            result = "-----------Student was Absent --- no need to check score";
        }else {
            result =" !!!!! invalid text for attandence please check attendence "+ attend;
        }


        System.out.println(result);
    }
}
