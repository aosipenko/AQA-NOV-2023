package org.prog;

public class SportElectricCar extends ElectricCar implements IMovable {
    public void speedMove() {System.out.println("increase movement speed"); }
    public void moveForward() { System.out.println(" Sport Car moving forward"); }
    public void moveBackward() { System.out.println(" Sport Car moving backward");}
}
