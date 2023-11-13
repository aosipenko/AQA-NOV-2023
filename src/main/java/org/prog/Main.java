package org.prog;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class Main {

    /**
     * ##################################
     * ##################################
     * #####redCar#######################
     * ##################################
     * ##################################
     * ##################################
     * ################yellowCar#########
     * ##################################
     * ##################################
     *
     * @param args
     */

    public static void main(String[] args) {
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
        //BigTruck bigTruck = new BigTruck();
        ElectricScooter electricScooter = new ElectricScooter();
        Truck truck = new Truck();

        myCar.drive();
        //bigCar.drive();
        electricCar.drive();
        electricScooter.drive();

       //followTheRoute(myCar);
       //followTheRoute(telega);
       //followTheRoute(truck);
       //followTheRoute(bigTruck);
       //followTheRoute(electricCar);
       followTheRoute(electricScooter);
       drive(electricScooter);

        Car car = new Car();
        car.goTo("Lviv");
        car.goTo("Dnipro", "Chernihiv");
        car.goTo("Kyiv", "Kharkiv", "Poltava");
        car.goTo("Odessa", "Kyiv", "Dnipro", "food");
        car.goTo("Kyiv","Boryspol", "Bortnichy", "pizza", "Bortnichy");

    }

 //   public static void paintCar(Car car) {
 //       car.color = "black";
 //   }

    public static void followTheRoute(ITurnable iCar) {
        iCar.turnLeft();
        iCar.turnRight();
    }
    public static void drive(IMovable iMove) {
        iMove.moveForward();
        iMove.moveBackward();
    }
}
