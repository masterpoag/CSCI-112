public class CarLot {
    private Vehicle[] list = new Vehicle[1000];
    private int pointer = 0;

    public CarLot(){

    }
    public void addCar(Vehicle car){
        list[pointer] = car;
        pointer++;
    }
    public int priceTotal(){
        int cost = 0;
        for (int i = 0; i < pointer; i++) {
            cost = list[i].getCost();
        }
        return cost;
    }
    public int averagePrice(){
        int cost = 0;
        for (int i = 0; i < pointer; i++) {
            cost = list[i].getCost();
        }
        return cost/pointer;
    }

    public int getNumberOfCars() {
        return pointer;
    }
    @Override
    public String toString(){
        StringBuilder printed = new StringBuilder("You have " + pointer + " cars in your lot\n");
        for (int i = 0; i < pointer; i++) {
            printed.append("\t").append(list[i].toString());
        }
        return printed.toString();
    }
}
