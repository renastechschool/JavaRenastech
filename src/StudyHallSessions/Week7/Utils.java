package StudyHallSessions.Week7;

public class Utils {

    public static void makeLine(){

        System.out.println("*******************");
    }

    public static void print0to100(){

        for (int i = 0; i <=100 ; i++) {
            System.out.print(i +" ");


        }

        System.out.println("");
    }

    public static void sayName(String name){
        System.out.println("Hello "+name);
    }

    public static void reverseString(String str){
        String answer="";

        for (int i = str.length()-1; i >=0 ; i--) {

            answer+=str.charAt(i);

        }

        System.out.println(answer);

    }


}
