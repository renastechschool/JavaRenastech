package day21_MethodOverloading;

public class c3_methodOverloading {

    //Can we overload a main method
    //technically yes we can overload
    //but overloaded method cant run class
    //in order to run other main methods we will have to call them in (String [] args)
    public static void main(String[] args) {
        System.out.println("Default String main");

        int [ ] arr={1,2,3};
        main(arr);
    }

    public static void main(int [] arr){
        System.out.println("int main");
        System.out.println(2342);
    }
    public static void main(double [] arr){
        System.out.println("double main");
    }





}
