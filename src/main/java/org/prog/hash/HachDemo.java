package org.prog.hash;

import org.prog.BigCar;
import org.prog.Car;

import java.util.HashSet;
import java.util.Set;

public class HachDemo {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        o1.equals(o2);

        Car redCar1 = new Car();
        redCar1.color = "red";

        Car redCar2 = new Car();
        redCar2.color = "red";

        BigCar redCar3 = new BigCar();
        redCar3.color = "red";

        BigCar redCar4 = new BigCar();
        redCar4.color = "red";

        redCar1.equals(redCar2);

//        System.out.println(redCar1.equals(redCar2));
//        System.out.println(redCar1.equals(redCar3));
//
//        System.out.println(redCar2.equals(redCar1));
//        System.out.println(redCar2.equals(redCar3));
//
//        System.out.println(redCar3.equals(redCar1));
//        System.out.println(redCar3.equals(redCar2));
//
//        System.out.println(redCar1.hashCode());
//        System.out.println(redCar2.hashCode());
//        System.out.println(redCar3.hashCode());

        Set<Car> cars = new HashSet<>();
        cars.add(redCar1);
        cars.add(redCar2);
        cars.add(redCar3);

//        System.out.println(cars.contains(redCar4));

//        System.out.println(cars.size());

        System.out.println(redCar1.equals(redCar2));
        System.out.println(redCar1 == redCar2);
    }
}
