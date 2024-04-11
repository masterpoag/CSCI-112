public class Topping {

    // class attributes
    private String toppingName;
    private double cost;
    private String area;

    // empty constructor
    public Topping() {
        toppingName = "";
        cost = 0.0;
        area = "";
    }

    // non-empty constructor
    public Topping(String name, double Cost, String Area) {
        toppingName = name;
        cost = Cost;
        area = Area;
    }

    // setters
    public void setToppingName(String name) {
        toppingName = name;
    }

    public void setCost(double Cost) {
        cost = Cost;
    }

    public void setArea(String Area) {
        area = Area;
    }

    // getters
    public String getToppingName() {
        return toppingName;
    }

    public double getCost() {
        return cost;
    }

    public String getArea() {
        return area;
    }

    // toString

    @Override
    public String toString() {
        return String.format("%s, on: %s of pizza, add $%.2f, ", toppingName, area, cost);
    }
}