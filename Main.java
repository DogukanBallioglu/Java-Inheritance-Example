
import Modules.*;
import Vehicles.*;
import Employees.*;



public class Main {
        public static void main(String[] args) {

            // Araçlar
            Car car = new Car("Tesla Model X", "CAR123", 4);
            car.setBatteryLevel(35);
            CargoBot bot = new CargoBot("CargoPro", "BOT555", 100);
            bot.setBatteryLevel(90);
            GroundDrone drone = new GroundDrone("Dronify", "DRN900", 6);
            drone.setBatteryLevel(56);

            // Modüller
            car.addModule(new NavigationModule("Nav", "1.0", "EuropeMap"));
            car.addModule(new SafetyModule("Safe", "2.1", 3));
            AIControlModule ai1 = new AIControlModule("AI", "1.0", "BaseModel");
            ai1.updateModel("ProModel", true);
            car.addModule(ai1);

            drone.addModule(new NavigationModule("NavD", "1.2", "DroneMap"));
            drone.addModule(new SafetyModule("SafeD", "2.5", 2));
            drone.addModule(new AIControlModule("AID", "1.0", "DroneAI"));

            // Personel
            Engineer eng = new Engineer("Ahmet", "AHMET@MAIL.COM", "E101", "Robotics");
            Technician tech = new Technician("Mehmet", "mehmet@mail.com", "T202", 5);
            Manager man = new Manager("Ayşe", "ayse@mail.com", "M303");
            man.addTeamMember(eng);
            man.addTeamMember(tech);

            // Görev
            Mission mission = new Mission("M1", "Thermal scan mission in industrial zone");
            mission.assignVehicle(drone);
            mission.assignEmployee(eng);
            Mission mission2 = new Mission("M2", "Thermal scan mission in industrial zone");
            mission.assignVehicle(drone);
            mission.assignEmployee(eng);

            // Fleet Center
            FleetControlCenter center = new FleetControlCenter();
            center.addVehicle(car);
            center.addVehicle(bot);
            center.addVehicle(drone);

            center.addEmployee(eng);
            center.addEmployee(tech);
            center.addEmployee(man);

            center.addMission(mission);
            center.addMission(mission2);

            // Drone scan
            drone.scan("thermal");

            System.out.println("\n--- Drone Araması ---");
            System.out.println("Search missions with 'thermal':");
            System.out.println(center.searchMission("thermal").size() + " found");

            System.out.println("\n--- Araç Açıklamaları ---");
            center.listVehiclesByStatus();

            System.out.println("\n--- Personel Açıklamaları ---");
            System.out.println(eng.describe());
            System.out.println(tech.describe());
            System.out.println(man.describe());

            System.out.println("\n--- Şarj Durumu ---");
            //car.charge(20);
            car.charge();
            System.out.println("\nCar battery: " + car.getBatteryLevel());


            System.out.println("\n--- Manuel Modül Kontrolü ---");
            tech.maintenanceReport();
            tech.maintenanceReport(true);
        }
    }

