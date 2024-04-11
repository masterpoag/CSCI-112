public class Pizza {

    // class attributes
    private String pizzaName;
    private String size;
    private Topping[] toppings;
    private int counter;

    // empty constructor
    public Pizza() {
        pizzaName = "";
        size = "";
        toppings = new Topping[20];
        counter = 0;
    }

    // non-empty constructor
    public Pizza(String name, String Size) {
        pizzaName = name;
        size = Size;
        toppings = new Topping[20];
        counter = 0;
    }

    // setters
    public void setPizzaName(String name) {
        pizzaName = name;
    }

    public void setSize(String Size) {
        size = Size;
    }

    // getters
    public String getPizzaName() {
        return pizzaName;
    }

    public String getSize() {
        return size;
    }

    public int getCounter() {
        return counter;
    }

    // add to array
    public void addToppingToPizza(String name, double cost, String area){
        toppings[counter] = new Topping(name, cost, area);
        counter++;
    }

    public double calcPizzaCost(){
        double cost = 0.0;
        if (size.equals("Extra Large")){
            cost = 14.99;
        } else if (size.equals("Large")) {
            cost = 12.99;
        } else if ( size.equals("Medium")) {
            cost = 10.99;
        } else cost = 8.99;
        for(int i = 0; i < counter; i++){
            cost += toppings[i].getCost();
        }
        return cost;
    }

    public void printPizza(){
        System.out.println(size + " " + pizzaName + " pizza");
        System.out.println("with:");
        for(int i = 0; i < counter; i++){
            System.out.println("\t" + toppings[i].toString());
        }
        System.out.println();
        System.out.printf("\t Total cost $%.2f\n", calcPizzaCost());
        System.out.println();
    }
}