package org.prog;

public class CyberTruck extends ElectricCar implements IMovable {
    //Extends for class ElectricCar
    public void moveForward() {
        System.out.println("CyberTruck move forward");
    }

    public void moveBackward() {

        System.out.println("CyberTruck move back");
    }


}
