package StudyHallSessions.Week8.Session3;

public class MainObjects {

    public static void main(String[] args) {

        Slipper slipper1=new Slipper();

        slipper1.brand="Puma";
        slipper1.size=12.5;
        slipper1.color="green";


        Slipper slipper2=new Slipper();

        slipper2.setSlipperInfo("nike",13.2,"White");

        System.out.println(slipper2.brand); // nike
        System.out.println(slipper2.size); //13.2
        System.out.println(slipper2.color); // White

        slipper2.wear(); // She/He is wearing nike
        slipper1.wear(); // She/He is wearing Puma


        Slipper slipper3=new Slipper();
        System.out.println(slipper3);
        //null__0.0__null


        slipper3.setSlipperInfo("adidas",9,"yellow");

        System.out.println(slipper3); //adidas__9.0__yellow

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Car car1=new Car();

        car1.brand="Tesla";
        car1.model="CyberTruck";

        System.out.println(car1); // Tesla CyberTruck

        Car car2=new Car();

        car2.setCarInfo("Honda","Civic");

        car2.printBrand(); // Brand of the car is : Honda
        car2.drive(); //person driver Honda car.
        car2.stop(); //person stopped the car Honda

        System.out.println(car2); //Honda Civic

        System.out.println("***************");
        Car car3= new Car();

        car3.setCarInfo("BMW","X5");
        System.out.println(car3.model); // X5

        car3.drive();// System.out.println("person driver " +brand +" car. ");
// person driver BMW car.





    }




}
