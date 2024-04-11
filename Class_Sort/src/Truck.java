
public class Truck {
    // class attributes
    private String make;
    private double cost;

    // empty parameter list Constructor
    public Truck() {
        make = "";
        cost = 0.0;
    }

    // non-empty parameter list Constructor
    public Truck(String Make, double cost) {
        make = Make;
        this.cost = cost;
    }

    // setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    // getters
    public String getMake() {
        return make;
    }
    public double getCost() {
        return cost;
    }

    // toString
    @Override
    public String toString(){
        return String.format("Make: %s cost: $%.2f", make, cost);
    }

}