package day19_methods;

public class c2_Methods {

    public static void main(String[] args) {

        //we call prinyJava10 in order to print java 10 times
        printJava10();
        hello();

        evenNumbers100();
    }

    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)
    //statments ,code
    //}

    //Access-Modifer =public, protected ,default ,priavate
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has paramertes some dont have parameter

    //create a method that will print java 10 times
    public static void printJava10(){
        for (int i=1 ; i <=10 ; i++){
            System.out.println("Java");
        }

    }

    //print a hello
    public static void hello(){
        System.out.println("Hello Hello");
    }

    ////create a method that will print even numbers between 1-100
    //    //name this method evenNumbers100
    public static void evenNumbers100(){
        //1-100 // 5 -500 // 100-1000
        // 2  4 6 8 10 ... 98
        for (int i=2 ; i <101 ; i +=2 ){
            System.out.print(i + " ");
        }

        System.out.println();
    }


}

//    // void method (without parameters)
//    // void method (with parameters)\
//    // return method (without parameters)
//    // return method (with parameters)

//you can use above methods with different access modifier and specifier
