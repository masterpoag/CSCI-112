public class Boeing extends cargo {
    private String model;
    private String cargoType;
    private int buildNumber;

    public Boeing(String craftType, String propulsionType, double craftCost, int storageSpace, int maxWeight, int maxSpeed) {
        super(craftType, propulsionType, craftCost, storageSpace, maxWeight, maxSpeed);
        model = "";
        cargoType = "";
        buildNumber = 0;
    }
    public Boeing(String propulsionType,int cost,String model,String cargoType,int buildNumber){
        super("commercial",propulsionType,cost);
        this.model = model;
        this.cargoType = cargoType;
        this.buildNumber = buildNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    @Override
    public String toString() {
        return super.toString()+"Boeing{" + "model='" + model + '\'' + ", cargoType='" + cargoType + '\'' + ", buildNumber=" + buildNumber + '}';
    }
    @Override
    public void printCraft(){
        super.printCraft();
        System.out.println("Boeing{" + "model='" + model + '\'' + ", cargoType='" + cargoType + '\'' + ", buildNumber=" + buildNumber + '}');
    }
}
