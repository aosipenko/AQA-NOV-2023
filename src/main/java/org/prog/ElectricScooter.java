package org.prog;

public class ElectricScooter extends ElectricCar implements ITurnable, IMovable{
    @Override
    public void moveForward(){ System.out.println("ElectricScooter move forvard");}
    @Override
    public void moveBackward(){System.out.println("ElectricScooter move backward");}
    }



