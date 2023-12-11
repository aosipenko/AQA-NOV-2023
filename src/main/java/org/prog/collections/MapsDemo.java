package org.prog.collections;

import org.prog.Car;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
//        Car bobsCar = new Car();
//        Car eliceCar = new Car();
//        Car bobsnewCar = new Car();
//        bobsCar.color = "red";
//        eliceCar.color = "blue";
//        bobsnewCar.color = "yellow";
//
//        Map<String, Car> carOwners = new HashMap<>();
//        carOwners.put("Bob", bobsCar);
//        carOwners.put("Alice", eliceCar);
//        System.out.println(carOwners.get("Bob").color);
//        System.out.println(carOwners.get("Alice").color);
//
//        carOwners.put("Bob", bobsnewCar);
//        System.out.println(carOwners.get("Bob").color);
//        System.out.println(carOwners.get("Alice").color);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("key_1", "value_1");
        stringMap.put("key_2", "value_2");
        stringMap.put("key_3", "value_3");
        stringMap.put(null, "value_4");
        stringMap.put("null_value", null);
        System.out.println(stringMap.get(null));
        System.out.println(stringMap.get("null_value"));
        System.out.println(stringMap.get("key_that_not_exists"));

        Collection<String> c = stringMap.values();

    }
}
