package StudyHallSessions.Week8.Session3;

public class Slipper {

    // /*task1
// create a class called slipper

// Attributes:
// brand, size , color

    String brand; // instance variable
    double size;
    String color;


//Actions:
    // wear(), setSlipperInfo, toString;

    public void wear(){
        System.out.println("She/He is wearing "+brand);
    }

     //setSlipperInfo,
    public void setSlipperInfo(String slipperBand, double slipperSize, String sliepperColor){

        brand=slipperBand;
        size=slipperSize;
        color=sliepperColor;

    }

    //toString;
    // toString method will convert/retunr my object as string
    public String toString(){

        return brand +"__"+size+"__"+color;
    }


    //
    //create a slipper object class to set 5 slipperobjectst and print slipper info // */
    // /*
}
