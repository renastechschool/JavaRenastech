package day24_ClassessAndObject;

public class AnimalObject {

    public static void main(String[] args) {

        Animals animal1=new Animals();

        animal1.type="dog";
        animal1.name="tiger";
        animal1.color="yellow";
        animal1.age=5.4;

        animal1.getAnimalInfo(); // tiger ,5.4 ,yellow ,dog

        animal1.getAnimalType(); ///tiger is a dog
     //   System.out.println(name + " is a "+type);

        animal1.eating("shoes"); // System.out.println(name + " is a "+type);

        System.out.println(animal1);
       // Name of Animal : tiger age of the animal : 5.4 color of the animal yellow type of animal is : dog

        System.out.println("*************************");

        Animals animal2=new Animals();

        //toString method

        // return  "Name of Animal : "+name + " age of the animal : "+age
        //                + " color of the animal "+color +" type of animal is : " +type;

        System.out.println(animal2);  // Name of Animal : null age of the animal : 0.0 color of the animal null type of animal is : null

        animal2.setAnimalInfo("Monkey",3,"Brown","Java");

        System.out.println(animal2); //Name of Animal : Java age of the animal : 3.0 color of the animal Brown type of animal is : Monkey


        //eating() -->   System.out.println(name + " is eating "+food);
        animal2.eating("banana"); // Java is eating banana

        animal2.getAnimalType(); //Java is a Monkey


        Animals animal3=new Animals();

        animal3.setAnimalInfo("Lama",4.2,"white","Anna");

        System.out.println(animal3.age);// 4.2

        System.out.println(animal3.color); // white.

        System.out.println("*******************");
        String [] names={"Ali","Mark"};


        // I want to create an array which will store animals


        Animals [] animalsArray={animal1,animal2,animal3};
        //                         0      1        2

        System.out.println(animalsArray[2].age); // 4.2

        System.out.println(animalsArray[0].name); // tiger

        System.out.println(animalsArray[1].type); //monkey







    }
}
