import java.util.ArrayList;

import Employees.Employee;
import Vehicles.Vehicle;

public class Mission {

    String missionID;
    String description;
    ArrayList<Vehicle>assignedVehicles;
    ArrayList<Employee>responsibleStaff;

    public Mission(String missionID, String description){
        this.missionID = missionID;
        this.description = description;
        this.assignedVehicles = new ArrayList<>();
        this.responsibleStaff = new ArrayList<>();
    }

    public void assignVehicle(Vehicle v){
        assignedVehicles.add(v);
    }

    public void assignEmployee(Employee e){
        responsibleStaff.add(e);
    }

    public boolean containsKeyword(String keyword){
        return description.toLowerCase().contains((keyword.toLowerCase()));
    }
}
