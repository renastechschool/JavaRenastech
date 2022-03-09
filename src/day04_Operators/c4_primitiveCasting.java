package day04_Operators;

public class c4_primitiveCasting {
    //we have 2 type of primitive casting
    //1.implicit casting (done automaticly from java)
    //2.explicit casting (needs to be handle manually)

    //double > float > long > int > short > byte
    public static void main(String [] args){

        byte number1=20; //-128 to 127
        long number2=number1; //implicit casting (this will be done by java auto)

        int i1=10;
        byte b1=(byte)i1;//explicit casting . This needs to be done mannuaaly

        double d1=2.5;
        float f1=(float) d1;

        int i2=500;
        long l2=i2;

        double d12=2.5;
        byte b2= (byte) d12;

        System.out.println(d12);//2.5
        System.out.println(b2); //

    }
}
