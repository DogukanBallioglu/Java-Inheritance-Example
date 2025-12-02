package Employees;
import java.util.Date;

public class Technician extends Employee {

    int experienceYears;

    public Technician(String name, String email, String employeeID, int experienceYears){
        super(name, email, employeeID);
        this.experienceYears = experienceYears;
    }

    public void maintenanceReport(){
        System.out.println(name + " bakım raporunu oluşturdu.");
    }

    public void maintenanceReport(boolean includeTimestamp){
        String dateInfo = includeTimestamp ? new Date().toString() : "N/A";
        System.out.println(name + " bakım raporunu oluşturdu. Tarih: " + dateInfo);    }

    @Override
    public String describe(){
        return "Technician → " + super.describe() + " | Exp: " + experienceYears;
    }
}
