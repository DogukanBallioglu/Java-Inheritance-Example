package Employees;

public class Employee {

    String name;
    String email;
    String employeeID;

    public Employee(){}

    public Employee(String name, String email, String employeeID){
        this.name = name;
        this.email = email;
        this.employeeID = employeeID;
    }

    public String getNormalizedEmail(){
        return email.trim().toLowerCase();
    }

    public String describe(){
        return "Employee: " + name + " | Email: " + email + " | ID: " + employeeID;
    }}
