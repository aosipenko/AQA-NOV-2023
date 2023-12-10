package org.prog;
public class Main {

    public static void main(String[] args) {

//        int i = 10;
//        increment(i);
//        System.out.println(i);
//
//        Integer integer = Integer.valueOf(10);
//        increment(integer);
//        System.out.println(integer);

//        CarService carService = new CarService();
//
//        Car redCar = new Car();
//        Car yellowCar = new Car();
//
//        redCar.color = "red";
//        yellowCar.color = "yellow";
//        System.out.println(redCar.color);
//        System.out.println(yellowCar.color);
//
//        Car thatCar = redCar;
//        System.out.println(thatCar.color);
//        paintCar(thatCar);
//        System.out.println(">>>>>>" + redCar.color);
//        carService.paintCar(yellowCar);
//        System.out.println(yellowCar.color);

        Car myCar = new Car();
        BigCar bigCar = new BigCar();
        ElectricCar electricCar = new ElectricCar();
        Telega telega = new Telega();
        BigTruck bigTruck = new BigTruck();
        Truck truck = new Truck();
        ElectricTruck electricTruck = new ElectricTruck();

        Car car = new Car();

        car.printColorLength();

//        myCar.drive();
//        bigCar.drive();
//        electricCar.drive();

//        followTheRoute(myCar);
//        followTheRoute(telega);
//        followTheRoute(truck);
//        followTheRoute(bigTruck);
//        followTheRoute(electricTruck);
//        followTheRoute2(electricTruck);

//        Car car = new Car();
//        car.goTo("Lviv");
//        car.goTo("Dnipro", "Chernihiv");
//        car.goTo("Kyiv", "Kharkiv", "Poltava");
//        car.goTo("Odessa", "Kyiv", "Dnipro", "food");
//        car.goTo("Odessa", "Kyiv", "Dnipro", "food", "return");
    }

//    private static void increment(Integer input){
//        input += 1000;
//        System.out.println(input);
//    }

    public static void paintCar(Car car) {
        car.color = "black";
    }

    public static void followTheRoute(ITurnable iCar) {
        iCar.turnLeft();
        iCar.turnRight();
    }
    public static void followTheRoute2(IMovable iCar) {
        iCar.moveForward();
        iCar.moveBackward();
    }
}