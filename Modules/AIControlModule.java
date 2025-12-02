package Modules;

public class AIControlModule extends Module {

    private String modelName;

    public AIControlModule(String name, String version, String modelName){
        super(name, version);
        this.modelName = modelName;
    }

    public void updateModel(String newModel){
        this.modelName = newModel;
    }

    public void updateModel(String newModel, boolean verbose){
        this.modelName = newModel;
        if(verbose){
            System.out.println("Model updated to -> " + newModel);
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | AI Model: " + modelName;
    }
}
