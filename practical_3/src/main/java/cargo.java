import java.text.DecimalFormat;

public class cargo extends Aircraft{
    private int storageSpace = 0;
    private int maxWeight = 0;
    private int maxSpeed = 0;

    public cargo(String craftType, String propulsionType, double craftCost){
        super(craftType,propulsionType,craftCost);
    }
    public cargo(String craftType, String propulsionType, double craftCost, int storageSpace,int maxWeight,int maxSpeed){
        super(craftType,propulsionType,craftCost);
        this.storageSpace = storageSpace;
        this.maxWeight = maxWeight;
        this.maxSpeed = maxSpeed;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"cargo{" + "storageSpace=" + storageSpace + ", maxWeight=" + maxWeight + ", maxSpeed=" + maxSpeed + '}';
    }
    public void printCraft(){
        StringBuilder s = new StringBuilder();
        DecimalFormat df = new DecimalFormat("###.#");
        super.printCraft();
        if (storageSpace == 0){
            s.append("storage space is not defined ");
        }else{
            s.append(String.format("it can hold up to %d feet long items ",storageSpace));
        }
        if (maxWeight == 0){
            s.append("The maxWeight is not defined ");
        }else{
            s.append(String.format("this can hold %d pounds of item ",maxWeight));
        }
        if (maxSpeed == 0){
            s.append("speed is not defined ");
        }else{
            s.append(String.format("max speed is  %d MPH ",maxSpeed));
        }
        System.out.println(s);

    }
}
