package Vehicles;

public class CargoBot extends Vehicle {
    double maxLoadKg;
    double currentLoad;

    public CargoBot(String model, String serialNumber, double maxLoadKg){
        super(model, serialNumber);
        this.maxLoadKg = maxLoadKg;
        this.currentLoad = 0;
    }

    public void load(double kg){

        if((currentLoad + kg) <= maxLoadKg)
            currentLoad += kg;
        else
            System.out.println("HATA: Maksimum yük sınırı aşıldı!");
    }

    public void unlaod(){
        currentLoad = 0;
    }

    @Override
    public String getStatus(){
        return "CargoBot → " + "Load: " + currentLoad + "/" + maxLoadKg + " " + super.getStatus();

    }
}
