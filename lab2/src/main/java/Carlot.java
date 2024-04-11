public class Carlot {
    private String lotName;
    private Vehicle[] cars;
    private int counter;

    public Carlot(){
        lotName = "";
        cars = new Vehicle[100];
        counter = 0;
    }

    public Carlot(String lotName) {
        this.lotName = lotName;
        cars = new Vehicle[100];
        counter = 0;
    }

    public void setLotName(String lot){
        lotName = lot;
    }

    public String getLotName(){
        return lotName;
    }

    public int getLogicalLength(){
        return counter;
    }

    public void addVehicle(String Make, String Model, String Color, double Cost){
        cars[counter] = new Vehicle(Make, Model, Color, Cost);
        counter++;
    }

    public double calcAverageCost(){
        double sum = 0;
        for(int i = 0; i < counter; i++){
            sum += cars[i].getCost();
        }
        return sum/counter;
    }

    public void printData(){
        System.out.println(lotName + " currently has " + counter + " available vehicles");
        System.out.println();
        for(int i = 0; i < counter; i++){
            System.out.println(cars[i].toString());
        }
        System.out.println();
        System.out.println(String.format("The average cost of a vehicle is $%,.2f", calcAverageCost()));
        System.out.println();
    }
    public Vehicle getIndexofArray(int i){
        return cars[i];
    }
}
