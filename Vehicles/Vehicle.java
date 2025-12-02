package Vehicles;

import java.util.ArrayList;
import Modules.Module;

public class Vehicle {
    String model;
    String serialNumber;
    double batteryLevel;
    ArrayList<Module> modules;

    public Vehicle(){
        this.model = "Unknown";
        this.serialNumber = "0000";
        this.batteryLevel = 100;
        this.modules = new ArrayList<>();
    }

    public Vehicle(String model, String serialNumber){
        batteryLevel = 100;
        modules = new ArrayList<>();
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public void setBatteryLevel(double level){
        if(level >= 0 && level <= 100)
            this.batteryLevel = level;
    }

    public double getBatteryLevel(){ return batteryLevel;}

    public void addModule(Module m){
        modules.add(m);
    }

    public void charge(double amount){
        batteryLevel = Math.min(100, batteryLevel + amount);
        System.out.println("Batarya " + batteryLevel + " seviyesine kadar şarj edildi!");
    }
    public void charge(){
        System.out.println("Şarjı fullendi!");
        batteryLevel = 100;
    }

    public String getStatus(){

        String status = "Vehicle: " + model + " (" + serialNumber + ") Battery: " + batteryLevel + "%";

        if (!modules.isEmpty()) {
            status += "\n   Modüller:";
            for (Module m : modules) {
                status += "\n     - " + m.getInfo();
            }
        }

        return status + "\n";
    }
}
