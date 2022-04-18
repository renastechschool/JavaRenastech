package day21_MethodOverloading;

public class c2_MethodOverloading {

    ////1. print sum of 2 int numbers
    ////2. print sum of 3 int numbers
    ////3. print sum of 2 double numbers

//    public static void sum(int a , int b){
//        System.out.println("***2 int sum method***");
//        System.out.println(a+b);
//    }

    public static int sum(int a, int b){
        System.out.println("***2 int sum method***");
       // System.out.println();
        return a+b;
    }

    //method overloading :
    //you cant have same loads and same method name with different returnt types
    //in order to achive methodoverloading you have to have different type of load or amount of load

    public static void sum(int a , int b ,int c){
        System.out.println("***3 int sum method***");
        System.out.println(a+b+c);
    }
    public static void sum(int a , int b ,int c , int d){
        System.out.println("***4 int sum method***");
        System.out.println(a+b+c+d);
    }
    public static void sum(double a , double b){
        System.out.println("***2 double sum method***");
        System.out.println(a+b);
    }


    //public static void sumOf2Numbers(int a , int b){ }  instead of having long method names
    // i can use one method name that will have same function but with different loads (methodoverloading)

    public static void main(String[] args) {

        System.out.println(sum(10,2));
        sum(2,3,5);
        sum(5.0,2.5);
        sum(4,5,6,7);
    }
}
