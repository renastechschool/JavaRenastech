package day05_ifStatements;

public class c2_ifStatement {

    public static void main(String [] args){
        boolean b1=10>5; //t
        boolean b2= 10 == 12; //false

        System.out.println("hatice");

        if (2>2){//opening bracket for if statement//false
            //if your if condition is false java will not check body of if statment
            System.out.println("Evin");
            System.out.println("Halil");

        }//closing bracket for if statment

        System.out.println("Sanjay");


        if (1==1){//true
            //java will exucute body of if statement
            System.out.println("Oscar");
            System.out.println("Oscar");
        }

        if (b2){//false
            //java wont read inside if
            //java wont excute the body of if statment
            System.out.println(b2);
            System.out.println("Esra");
        }

        if (true){
            System.out.println("Taylan");
        }


    }//closing for main
}//closing for the class
