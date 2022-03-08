package day3_variablesContinue;

public class c4_StringPractice {

    //  create 3 name and assign any name  ex: Firat Hatice Abe
    //  create 3 age assign any number you want to   ex : 20 30 40
    //  print those age with person name   ex : Abe age is : 20
    //  also sum those three person age  ex : 20 + 30 + 40
    //  print  "Sum of persons Age = 90 ;

    public static void main(String [] args){
        //  create 3 name and assign any name  ex: Firat Hatice Abe
        String name1="Firat";
        String name2="Hatice";
        String name3="Abe";

        //  create 3 age assign any number you want to   ex : 20 30 40
        byte age1=27;
        byte age2=25;
        byte age3=31;

        //  print those age with person name   ex : Abe age is 20
        System.out.println("Abe age is 31");
        System.out.println(name3 + " age is : " + age3 );
        System.out.println(name2 + " age is : " + age2 );
        System.out.println(name1 + " age is : " + age1 );

        //  also sum those three person age  ex : 20 + 30 + 40
        //  print  "Sum of persons Age = 90 ;
        System.out.println("Sum of persons Age =  " + (age1+age2+age3) );

        int sumOfAge=age1+age2+age3;
        System.out.println("Sum of persons Age =  " + sumOfAge );

    }
}
