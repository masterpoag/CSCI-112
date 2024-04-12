/*
TODO Create a class called Bar with the attributes of a Bar name, and a
    Drink array (with a length of 25), and an indexing variable.
    - Create the normal types of methods of an Intermediate class
    excluding a toString (make a print method instead) as well as the
    methods called by the Driver since they cause a compiling issue
*/
public class Bar {
    private String name;
    private Drink[] drinks;
    private int counter = 0;

    public Bar(){
        name = "";
        drinks = new Drink[25];
    }
    public Bar(String name){
        this.name = name;
        drinks = new Drink[25];
    }
    public void addDrinkToArray(String name,String description,double cost){
        drinks[counter] = new Drink(name,description,cost);
        counter++;
    }
    public void printData(){
        System.out.println("Drink\t\tDescription\t\tCost");
        System.out.println("-------\t\t------------\t\t-----");
        for (int i = 0; i < counter; i++) {
            System.out.println(drinks[i].toString());
        }
    }

    public String getLeast() {
        Drink picker = drinks[0];
        for (int i = 1; i < counter; i++) {
            if (picker.getCost() > drinks[i].getCost()) picker = drinks[i];
        }
        return picker.toString();
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return counter;
    }

    public double getAvg() {
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += drinks[i].getCost();
        }
        return sum/counter;
    }
    public Drink getDrink(int index){
        return drinks[index];
    }
}

