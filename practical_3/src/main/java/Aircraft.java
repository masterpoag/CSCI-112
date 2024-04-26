public class Aircraft {
    private String craftType;   // Commercial, Military, Private, Business, Lighter-than-air
    private String propulsionType;  // Propeller, turbofan, turboprop, propfan, ramjet
    private double craftCost;   // this doesn't have to be accurate

    public Aircraft() {
        craftType = "";
        propulsionType = "";
        craftCost = 0.0;
    }

    public Aircraft(String craftType, String propulsionType, double craftCost) {
        this.craftType = craftType;
        this.propulsionType = propulsionType;
        this.craftCost = craftCost;
    }

    public void setCraftType(String craftType) {
        this.craftType = craftType;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public void setCraftCost(double craftCost) {
        this.craftCost = craftCost;
    }

    public String getCraftType() {
        return craftType;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public double getCraftCost() {
        return craftCost;
    }

    public String toString(){
        return String.format("This %s aircraft uses %s propulsion and costs $%,.2f", craftType, propulsionType, craftCost);
    }

    public void printCraft(){
        System.out.println(String.format("This %s aircraft uses %s propulsion and costs $%,.2f", craftType, propulsionType, craftCost));
    }
}
