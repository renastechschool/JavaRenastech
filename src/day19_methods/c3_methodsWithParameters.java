package day19_methods;

public class c3_methodsWithParameters {
    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater){
    //statments ,code
    //}

    public static void main(String[] args) {
        hello();
        hello();
        evenNumbers(0,100); // print until 100
        System.out.println("&&&&&&&**********************");
        //print until 20
        evenNumbers(0,20);

        System.out.println("&&&&&&&**********************");
        evenNumbers(35,55);


        System.out.println("&&&&&&&**********************");

        ageCategory(24);
        ageCategory(55);
        ageCategory(17);
        ageCategory(256);
        ageCategory(5);
        ageCategory(43);
        ageCategory(-25);
        //ageCategory("asdas");//error incompatible types: java.lang.String cannot be converted to int

    }

    //print hello
    public static void hello(){
        System.out.println("Hello");

    }
    //even numbers for any range
    public static void evenNumbers(int startingPoint , int endingPoint ){

        for (int i = startingPoint ; i <= endingPoint ;i++){

            if (i%2==0){
                System.out.println(i + " is even number");
            }
        }

    }

    //crete a method that will check given age and print the category of each age
    //if age is 0-5 baby
    //if age is 5-18 young
    //if age is 18-80 mature
    //if age is bigger then 80 print  old

    public static void ageCategory(int age){
       String  result="";

       if (age >=0 && age <=5){
           result = age + " is a baby";
       }else if (age >5 && age <= 18){
           result = age + " is a young";
       }else if (age > 18 && age<= 80){
           result = age + " is a mature";
       }else if (age >80){
           result = age + " is old ";
       }else {
           result = age + " is not exsist!!!!!!!!!!!!!!!!!";
       }

        System.out.println(result);
    }


}
