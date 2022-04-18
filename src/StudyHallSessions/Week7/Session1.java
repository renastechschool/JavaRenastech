package StudyHallSessions.Week7;

public class Session1 {
    public static void main(String[] args) {
        //Method: Method is simply a block of code which only runs whenever it's called.
        //Void Methods: no return type.

        greeting();

        String word="Renastech";

        System.out.println(word.toUpperCase());

        age("Omer",1988); //Omer is 34 years old
        System.out.println("******************");
        age("Muhammed",2000); //Muhammed is 22 years old
        makeLine();
        makeLine();

        Utils.makeLine();
        Utils.print0to100();
        Utils.makeLine();

        Utils.sayName("Libby"); // Hello Libby

        Utils.makeLine();
        Utils.reverseString("Renastech"); //hcetsaneR
        Utils.reverseString("Ali"); //ilA


    }
    public static void greeting(){
        System.out.println("Hello Hello");
        System.out.println("It's a nice day");

    }

    public static void age(String fname, int birthYear){
        System.out.println(fname +" is " +(2022-birthYear)+ " years old");
    }

    public static void makeLine(){
        System.out.println("************************");

        //
    }
}
