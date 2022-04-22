package day24_ClassessAndObject;

public class Animals {

    String type; //instance variable
    double age;
    String color;
    String name;


    // will print all animal information
    public void getAnimalInfo(){
        System.out.println(name +" ," +age +" ," +color +" ,"+type);
    }


    //this method will set all information about animal in one line
    public void setAnimalInfo(String animalType, double animalAge , String animalColor, String animalName){
        type=animalType;
        age=animalAge;
        color=animalColor;
        name=animalName;
    }

    public void eating(String food){
        System.out.println(name + " is eating "+food);
    }

    public void getAnimalType(){

        System.out.println(name + " is a "+type);
    }

    public String toString(){

        return  "Name of Animal : "+name + " age of the animal : "+age
                + " color of the animal "+color +" type of animal is : " +type;


    }



}
