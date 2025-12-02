package Modules;

public class Module {
    private String name;
    private String version;

    public Module(String name, String version){
        this.name = name;
        this.version = version;
    }

    public String getInfo(){
        return "Module: " + name + " (v " + version + ")";
    }
}
