public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int cost;

    // constucters
    public Vehicle(){
        make = "";
        model = "";
        color = "";
        cost = 0;
    }
    public Vehicle(String make,String model,String color,int cost){
        this.make = make;
        this.model = model;
        this.color = color;
        this.cost = cost;
    }
    // setters
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    // getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString(){
        return String.format("This is a %s %s %s that cost %d%n",color,make,model,cost);
    }
}

