package org.prog;

public class Car implements ITurnable {

    public String color = null;
    public String engineVolume;

    public void drive() {
        System.out.println("Driving car");
        switchGear();
    }

    //TODO: call this method when there is not color set, and intercept exception that occurs
    //TODO: in same block in finally set car color to some value


    public void printColorlength() {
        try {
            System.out.println(color.length());
        } catch (RuntimeException e) {
            System.out.println("Something went wrong! Because the color value is empty!");
        } finally {
            color = "purple";
            System.out.println("Legth of new color is " + color.length() + " symbols");
        }
    }

    private void switchGear() {
        System.out.println("Switching gear");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turning right");
    }

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
        goTo(city, fromCity, passingThrough, withCargo, "unknown");
    }

    //TODO: overload this method: add return destination - DONE!
    public void goTo(String city, String fromCity, String passingThrough, String withCargo, String lastDest) {
        System.out.println("This vehicle goes to " + city + " from " + fromCity +
                " passing through " + passingThrough + " with " + withCargo + " cargo to " + lastDest + " destination");
    }
}
