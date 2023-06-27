package activities;

public class Activity1 {

    public static void main(String[] args) {
        Car honda = new Car();
        honda.make = 2017;
        honda.color = "White";
        honda.transmission = "Automatic";

        //Using Car class method
        honda.displayCharacterstics();
        honda.accelerate();
        honda.brake();
    }

}