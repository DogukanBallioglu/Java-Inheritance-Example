package Vehicles;

public class GroundDrone extends Vehicle{
    int sensorCount;

    public GroundDrone(String model, String serialNumber, int sensorCount){
        super(model, serialNumber);
        this.sensorCount = sensorCount;
    }

    public void scan(){
        System.out.println("Drone scanning...");
    }

    public void scan(String mode){
        System.out.println("Drone scan mode: " + mode);
    }

    @Override
    public String getStatus(){
        return "Drone → " + "Sensors: " + sensorCount + " " + super.getStatus();
    }
}
