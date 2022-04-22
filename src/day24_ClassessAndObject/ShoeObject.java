package day24_ClassessAndObject;

import java.util.ArrayList;

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

        System.out.println("******************");
        Shoe shoe2=new Shoe();

        shoe2.brand="Adidas";
        shoe2.size=8;
        shoe2.color="yellow";

        System.out.println(shoe2.brand); // Adidas
        System.out.println(shoe2.size); // 8
        System.out.println(shoe2.color); // yellow

        shoe2.getShoeInfo(); // Adidas ,8 ,yellow
//  System.out.println(brand +" ,"+size +" ,"+color);

        System.out.println("----------------------");
        String [] array={"Hello", "World"};


        Shoe shoe3 =new Shoe();

        // datatype

        Shoe [] shoes={shoe1,shoe2, shoe3};
        //              0 , 1,        2

        shoes[0].getShoeInfo(); // nike ,12 ,White
        shoes[1].getShoeInfo(); //Adidas ,8 ,yellow
        shoes[2].getShoeInfo(); // null ,0 ,null


        ArrayList<Shoe> shoesList=new ArrayList<>();

        shoesList.add(shoe1); // index 0
        shoesList.add(shoe2); //index 1


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(shoesList.get(0).color); // White
        System.out.println(shoesList.get(0).size); // 12
        System.out.println(shoesList.get(0).brand); //nike

        System.out.println("!!!!!!!!!!!!@@@@@@@@@@@@@@@@@");

        System.out.println(shoesList.get(1)); // Adidas / 8 / yellow


        System.out.println(shoe2); // Adidas / 8 / yellow









    }

}
