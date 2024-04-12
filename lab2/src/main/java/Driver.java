import java.util.Random;

public class Driver {
    public static void main(String[] args){
        Carlot lot = new Carlot("First Carlot");

        lot.addVehicle("make","model","Color",150);
        lot.addVehicle("make","model","Color",150);
        lot.addVehicle("make","model","Color",150);
        lot.printData();
    }

}
