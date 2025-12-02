package Employees;

public class Engineer extends Employee{

    String specialty;

    public Engineer(String name, String email, String employeeID, String specialty){
        super(name, email, employeeID);
        this.specialty = specialty;
    }

    @Override
    public String describe(){
        return "Engineer → " + super.describe() + " | Specialty: " + specialty;
    }
}
