package org.prog;

public class ElectricTruck extends ElectricCar implements IMovable{
    @Override
    public void moveForward() {System.out.println("ElectricTruck moveForward");}
    @Override
    public void moveBackward() {System.out.println("ElectricTruck moveBackward");}
}
