package day22_List;

public class c2_TypeCasting {

    //Type Casting
    //1.Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
    // For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
    //Passed as a parameter to a method that expects an object of the corresponding wrapper class.
    //Assigned to a variable of the corresponding wrapper class.
    //2.Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
    // For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
    //Passed as a parameter to a method that expects a value of the corresponding primitive type.
    //Assigned to a variable of the corresponding primitive type.
    //The following table lists the primitive types and their corresponding wrapper classes,
    // which are used by the Java compiler for autoboxing and unboxing:
    //Primitive Data Type	Wrapper Class
    //byte	                Byte
    //short	                Short
    //int	                Integer
    //long	                Long
    //float	                Float
    //double	            Double
    //boolean	            Boolean
    //char	                Character

    public static void main(String[] args) {

        //
        String str=new String("Hello");

        //create an Integer Object
        Integer myInt= new Integer(10);

        int i1=myInt;  //unboxing
        //converting an object of wrapper class to primitive int

        Character myCh='w'; //autoboxing
        //we take 'w' and assign to wrapper class
        //Converting a primitive value into an object of the corresponding wrapper class

        char ch2=myCh; //unboxing

        System.out.println("myCh = " + myCh);
        System.out.println("ch2 = " + ch2);

        int number =100; //prim

        Integer myInt5=number; // autoboxing

        Byte myByte=26;
        byte b1=myByte;//unboxing



    }

}
