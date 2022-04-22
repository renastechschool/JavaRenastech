package day24_ClassessAndObject;

public class Shoe {


//custom classes which will be your library for shoes

//ArrayList class as example                //shoe
//data : can be any type of object          //data:shoe object
//functions : add ,remove ,size ,get ...    //functions :brand,size,color
                                             //wear() ,, getShoeInfo ...

//idea of creating object from class
//ArrayList<>  list     =  new ArrayList<>();
//  Class     refName           OBJECT

// Shoe  nike=new Shoe();

//class : it is where you actually implement your code . you store variables methods inside of your class
//this is where you create an object from . Class will explain behaviour of objects

    //local variables : local variables that we declared with in block(main method,other methods ,static block)
  //instance variables : object variables that we create inside of class
    //instance variables can not have static specifier
    //needs to be decleared outside of methods or blocks


 //Access-Modifer =public, protected ,default ,priavate
//specifier   : static ,final ,abstract ,synchronized
//return type : void , any datatype(int,string,char , int [] .......)
//some method has paramertes some dont have parameter


    //instance variables : object variables that we create inside of class
    //instance variables can not have static specifier
    //needs to be decleared outside of methods or blocks

    String brand; // instance variables  , more info: brand size abd color are attribute of the Shoe.
    int size;
    String color;

    //static String brand2; // static variable

    public void wear(){ // function of shoe class

        System.out.println("She/He is wearing "+brand+" .");

    }

    public void getShoeInfo(){
        System.out.println(brand +" ,"+size +" ,"+color);

    }


    //this method will set shoe object information
    public void setShoeInfo(String shoeBrand, int shoeSize, String shoeColor){
        brand=shoeBrand;
        size=shoeSize;
        color=shoeColor;

    }


    //    // toString(): the method gets executed automatically whenever we pass the object name into the print statement
    public String toString(){

        return brand +" / "+size +" / "+color;
    }

}
