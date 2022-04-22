package StudyHallSessions.Week8.Session3;


// / /*task2
// // create a class called Car

public class Car {


    // //Attributes:
    // // brand, model

     String brand;
     String model;


    // //Actions:
    //
    //// printBrand(), -- to print car brand

    public void printBrand(){
        System.out.println("Brand of the car is : "+brand);
    }

    //// drive() , -- to print person drive car brand

    public void drive(){
        System.out.println("person driver " +brand +" car. ");
    }


    //// stop() -- to print person stopped the car brand
    public void stop(){
        System.out.println("person stopped the car "+brand);
    }

    //// //setCarinfo() to set car brand and model
    public void setCarInfo(String carBrand, String carModel){
        brand=carBrand;
        model=carModel;


    }

    //// //toString to print car brand and model with -

    public String toString(){
        return  brand +" "+model;
    }
}
