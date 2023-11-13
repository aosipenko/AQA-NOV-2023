package org.prog;

public class Car implements ITurnable,IMovable {

    public String color;
    public String engineVolume;

    public void drive() {System.out.println("Driving car");switchGear();
    }

    private void switchGear() {System.out.println("Car switching gear");turnLeft();}

    @Override
    public void turnLeft() {System.out.println("Car turning left");turnRight();}

    @Override
    public void turnRight() {System.out.println("Car turning right");moveForward();}

    @Override
    public void moveForward() {System.out.println("Car move forward");moveBackward();}

    @Override
    public void moveBackward() {System.out.println("Car move backward");}


    public void goTo(String city) {
        goTo(city, "current city");
    }

    public void goTo(String city, String fromCity) {
        goTo(city, fromCity, "no additional stops");
    }

    public void goTo(String city, String fromCity, String passingThrough) {
        goTo(city, fromCity, passingThrough, "empty");
    }

    public void goTo(String city, String fromCity, String passingThrough, String withCargo) {
        goTo(city, fromCity, passingThrough, withCargo, "Brovary");
    }


    //TODO: overload this this method: add return destination
    public void goTo(String city, String fromCity, String passingThrough, String withCargo, String destinationCity) {


        System.out.println("This vehicle goes to " + city + " from " + fromCity + " passing through " + passingThrough + " with " + withCargo + " to finish " + destinationCity);

        //System.out.println("This vehicle goes to " + city + " from " + fromCity +" passing through " + passingThrough + " with " + withCargo + " cargo");

    }
}





