public class Vehicle {
    private String make;
    private String model;
    private String color;
    private double cost;

    public Vehicle() {
        make = "";
        model = "";
        color = "";
        cost = 0.0;
    }
    public Vehicle(String Make, String Model, String Color, double Cost) {
        make = Make;
        model = Model;
        color = Color;
        cost = Cost;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String Make) {
        make = Make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String Model) {
        model = Model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        color = Color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double Cost) {
        cost = Cost;
    }

    public String toString(){
        return String.format("Make: %-15s Model: %-10s in %s, asking price: $%,.2f", make, model, color, cost);
    }
}
