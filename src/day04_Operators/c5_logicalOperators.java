package day04_Operators;

public class c5_logicalOperators {

    // && -- and
    // || -- or
    // ! -- not
    public static void main(String [] args){

        System.out.println( (4>2)  && (2>4)  ); //(True && false) // false
        System.out.println( (10<=5)&& (0==0) ); //(false && true) //false
        System.out.println( (1>=2) && (2!=2) ); //(false && false) //false
        System.out.println( (10>=10) && (10<=10) );//(true && true) //true

        //if you are using and operator && only option that you will get true result is all conditions are true
        //true && true &&true &&false && true ==false

        System.out.println("****************");
        // || -- or
        System.out.println( (4>2)  || (2>4)  ); //(True || false) // true
        System.out.println( (10<=5) || (0==0) ); //(false || true) // true
        System.out.println( (1>=2) || (2!=2) ); //(false || false) // false
        System.out.println( (10>=10) || (10<=10) );//(true || true) // true

        //false || false || false || true == true

        // ! -- not

        boolean bool1=true;
        boolean bool2= !(10 !=15); //! (true) == false

        System.out.println(bool1 && bool2);//true && false ==false


        boolean b3= !!!!!!bool1;// !!!!!!(True)
        //!!!!!(false)
        //!!!!(true)
        //true

        boolean b4= !(15>=15);//!(true) == false

        System.out.println( (b3||b4) && true);
                         // (true || false ) && true
                        //  true             && true == true


        System.out.println( ("maryam" == "abe") || ("murat"=="Murat") );
                        //  false || false == false
        //java is case sensitive to be able to have true it has to exact match .

        System.out.println("1@Hello2"=="1@Hello2");

        System.out.println(" engin"=="engin"); //false


    }
}
