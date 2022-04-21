package day24_ClassessAndObject;

public class ShoeObject {

    //ArrayList list= new ArrayList;

    public static void main(String[] args) {

        //Shoe nike= new Shoe;
        Shoe object1=new Shoe();

        System.out.println(object1.brand); // null
        System.out.println(object1.size); // 0
        System.out.println(object1.color); // null

        object1.wear(); // She/He is wearing null .
        object1.getShoeInfo(); // null ,0 ,null

        System.out.println("******************");

        Shoe shoe1=new Shoe();

        //Updated object attributes
        shoe1.brand="nike";
        shoe1.size=12;
        shoe1.color="White";

        System.out.println(shoe1.brand); //nike
        System.out.println(shoe1.size); //12
        System.out.println(shoe1.color); //White

        shoe1.wear(); // She/He is wearing nike .
        shoe1.getShoeInfo(); // nike ,12 ,White





    }

}
