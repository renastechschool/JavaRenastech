package day24_ClassessAndObject;

import java.util.ArrayList;

public class ShoesObject2 {

    //since shoe is in same package you will be able to call your shoe librray
    //if it is not in same package you will need to import
    //and then create different objects from this shoe library

    //idea of creating object from class
//ArrayList<>  list     =  new ArrayList<>();
//        Class     refName               OBJECT

    public static void main(String[] args) {

        Shoe shoe1=new Shoe(); // created an object from shoe library.

        shoe1.color="pink";
        shoe1.size=14;
        shoe1.brand="Nike";

        System.out.println(shoe1); // Nike / 14 / pink
        //public String toString(){
        //        return brand +" / "+size +" / "+color;
        //    }

        Shoe shoe2=new Shoe();

        System.out.println(shoe2); // null / 0 / null

        shoe2.setShoeInfo("puma",11,"blue");

        System.out.println(shoe2); // puma / 11 / blue

        Shoe shoe3=new Shoe();
        System.out.println(shoe3); //null / 0 / null

        shoe3.setShoeInfo("gucci",16,"green");
        System.out.println(shoe3); //gucci / 16 / green

        System.out.println(shoe3.color); // green

        System.out.println(shoe1.size); // 14





    }


}
