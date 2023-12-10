package org.prog;
public class Car implements ITurnable {

    public String color = null;
    public String engineVolume;

    public void drive() {
        System.out.println("Driving car");
        switchGear();
    }
    //TODO: call this method when there is not color set, and intercept exception that occurs
    //вызовите этот метод, когда цвет пустой, и перехватить ошибку которая там возникнет
    //TODO: in same block in finally set car color to some value
    //в этом же блоке добавить finally и присвоить этому цвету какое-то значение
    public void printColorLength() {
        try {
            System.out.println(color.length());
        } catch (RuntimeException e) {
            System.out.println("Цвет машины пустой!");
        } finally {
            color = "Зеленый";
            System.out.println("Цвет этой машины - " + color + " )))");
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
        goTo(city, fromCity, passingThrough, withCargo, "no return");
    }
    //TODO: overload this this method: add return destination
    public void goTo(String city, String fromCity, String passingThrough, String withCargo, String reTurn) {
        System.out.println("This vehicle goes to " + city + " from " + fromCity +
                " passing through " + passingThrough + " with " + withCargo + " cargo " + reTurn + " to port");
    }
}