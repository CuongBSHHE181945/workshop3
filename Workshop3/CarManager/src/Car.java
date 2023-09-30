/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Car {
    protected String colour;
    protected int EnginePower;
    protected boolean convertible;
    protected boolean ParkingBrake;

    public Car() {
    }

    public Car(String colour, int EnginePower, boolean convertible, boolean ParkingBrake) {
        this.colour = colour;
        this.EnginePower = EnginePower;
        this.convertible = convertible;
        this.ParkingBrake = ParkingBrake;
    }

    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    
    public void pressAcceleratorButton() {
        System.out.println("You have pressed the accelerator button");
    }

    public void output() {
        System.out.println("Car{" + "colour=" + colour + ", EnginePower=" + EnginePower + ", convertible=" + convertible + ", ParkingBrake=" + ParkingBrake + '}');
    }
    
    
}
