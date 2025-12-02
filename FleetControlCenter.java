import Employees.Employee;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class FleetControlCenter {
    ArrayList<Vehicle> vehicles;
    ArrayList<Employee> employees;
    ArrayList<Mission> missions;

    public FleetControlCenter() {
        this.vehicles = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.missions = new ArrayList<>();
    }

    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public void addMission(Mission m){
        missions.add(m);
    }

    public ArrayList<Mission> searchMission(String keyword){
        ArrayList<Mission> results = new ArrayList<>();

        for(Mission m : missions)
            if(m.containsKeyword(keyword))
                results.add(m);

        return results;
    }

    public void listVehiclesByStatus(){
        for(Vehicle v : vehicles){
            System.out.println(v.getStatus());
        }
    }


}
