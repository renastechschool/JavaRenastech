package day07_switch_scanner;

public class c1_nestedIfPractice {


    //create a java program to check if person is eligible to give blood
    //requirement to give blood :
    //person needs to be older then 18
    //person weight needs to be more then 50

    //expected output :
    // if person age is smaller and equal to 18
    //print :"Person needs to be older then 18 "
    //if person age is bigger 18 and weight is bigger then 50
    //"Person is eligible to give blood"

    //example test data is person age is 15 weight is 150
    //"Person needs to be older then 18 "
    //example test data is person age is 20 weight is 40
    //"Person is not eligible to give blood "
    //example test data is person age is 20 weight is 100
    ////"Person is eligible to give blood"

    //example test data is person age is 18 weigth is 55
    //"Person needs to be older then 18 "

    public static void main(String[] args) {

        String personName="Aslihan";
        int age=-20;
        double weight=50.1;
        String result="";

        if (age>18){
            if (weight > 50.0){
                result = personName + " is eligible to give blood " ;
            }else {
                result = personName + " is not eligible to give blood" ;
            }
        }else if (age>0 && age <=18){
            result = personName + " is needs to be older 18 ";
        }else {
            result = " invalid age you entered " + age;
        }

        System.out.println(result);


    }
}
