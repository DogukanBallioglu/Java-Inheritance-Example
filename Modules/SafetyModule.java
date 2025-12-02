package Modules;

public class SafetyModule extends Module {

    private int riskLevel;

    public SafetyModule(String name, String version, int riskLevel){
        super(name, version);
        this.riskLevel = riskLevel;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " | Risk Level: " + riskLevel;
    }
}
