package Vehicles;

public class Car extends Vehicle {

    int passengerCapacity;

    public Car(String model, String serialNumber, int passengerCapacity){
        super(model, serialNumber);
        this.passengerCapacity = 4;
    }

    @Override
    public String getStatus(){
        return "Car → " + "Capacity: " + passengerCapacity + " " + super.getStatus();
    }
}
