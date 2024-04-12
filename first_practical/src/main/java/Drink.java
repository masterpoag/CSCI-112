public class Drink {
    private String name;
    private String description;
    private double cost;

    public Drink(){
        name = "";
        description = "";
        cost = 0.0;
    }
    public Drink(String name, String description, double cost){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCost(double cost){
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
    @Override
    public String toString(){
        return String.format("%s\t\t%s\t\t$%,.2f", name, description, cost);
    }
}

