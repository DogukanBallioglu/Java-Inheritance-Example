package Modules;

public class NavigationModule extends Module {

    private String mapVersion;

    public NavigationModule(String name, String version, String mapVersion) {
        super(name, version);
        this.mapVersion = mapVersion;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " | Map Version: " + mapVersion;
    }
}
