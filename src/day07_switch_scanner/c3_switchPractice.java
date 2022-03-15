package day07_switch_scanner;

public class c3_switchPractice {

    //3 cases with a b c
    //if the case is a, result should be Hello a
    //if the case is b, result should be Hello b
    //if the case is c, result should be Hello c
    //if letter is something else then Hello Invalid.

    public static void main(String[] args) {
        char letter='x';
        String result = "Hello";

        switch (letter){
            case 'a' :
                //result = "Hello a"; no need to reassign we can just add letter a to result
                result += " a"; // result = result + " a"
                break;

            case 'b' :
                result += " b"; //hello b


            case 'c':
                result += " c"; //result = result +" c" // result = hello b c
                break;

            default:
                result += " invalid";
        }

        System.out.println(result);

        //in switch first it will check matching case
        //and then it will excute all the lines after matching cases if there is no break
        //if there is break it will only exucute same line and then break rest of it


    }
}
