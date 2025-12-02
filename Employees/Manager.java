package Employees;

// Manager.java
import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Employee> team = new ArrayList<>();

    public Manager(String name, String email, String id) {
        super(name, email, id);
    }

    public void addTeamMember(Employee e) {
        team.add(e);
    }

    @Override
    public String describe() {
        return "Manager → " + name + " | Team size: " + team.size();
    }
}

