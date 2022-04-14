package StudyHallSessions.Week7;

public class Session2 {

    public static void main(String[] args) {

        addition(20, 34); //54
        addition(0,-900);

       // int sumof10and24=addition(10,24);
        // since my addition method is a void method I can not assign into variable

        int a=method1(); // return 10;

        System.out.println(a); //  int a=method1();
        System.out.println(method1()); //10

        Utils.makeLine();

        int sumOf5and10=add(5,10);

        System.out.println("sumof5and10 "+ sumOf5and10); //sumof5and10 15


        Utils.makeLine();

        System.out.println(multipication(5,3)); //15

        int number3=multipication(2,9); // 2*9
        System.out.println("number3 = " + number3); //number3 = 18

        Utils.makeLine();
        Utils.makeLine();

        addition(3,4); //7

     // int number=addition(3,4); // my method void method, which doesn't have a return

     int myNumber =   add(3,4); //  return i1+i2;

        System.out.println(myNumber); //7
        System.out.println(add(3,4)); // print 3 +4;  7

    }

    public static void addition(int i1, int i2){
        System.out.println(i1+i2);
    }

    public static int add(int i1, int i2){
       // int sum=i1+i2;
        //return sum;
        return i1+i2;
    }


    public static int method1(){
        return 10;
    }

    public static int multipication(int number1 , int number2){
        int returnofnumberandNumber= number1* number2;

        return returnofnumberandNumber;
    }

}
