
public class CP1Driver {
    public static void main(String[] args) {


        Bar bar = new Bar("New bar");

        bar.addDrinkToArray("Elk Cove", "Pinot Noir", 8.00);
        bar.addDrinkToArray("Guinness", "Stout beer", 5.00);
        bar.addDrinkToArray("Yuengling", "Lager beer", 3.00);
        bar.addDrinkToArray("White Russian", "Vodka drink", 6.00);
        bar.addDrinkToArray("Cutty Sark", "Scotch Whiskey", 7.00);
        bar.addDrinkToArray("Vodka & tonic", "Vodka drink", 3.00);
        bar.addDrinkToArray("Red Note", "Cabernet", 4.00);
        bar.addDrinkToArray("Miller Lt.", "Lager beer", 2.50);
        bar.addDrinkToArray("Coors Light", "Lager beer", 2.50);
        bar.addDrinkToArray("Blackadder", "Scotch Whiskey", 4.00);

        System.out.println("Welcome to bar " + bar.getName());
		System.out.println(String.format("Here is a list of our %d Drinks.", bar.getCount()));
		System.out.println();
        // prints every book in the book store
        bar.printData();

        // prints the average cost
        System.out.printf("The average cost of a drink at %s is: $%.2f\n", bar.getName(), bar.getAvg());
        System.out.println();

        // prints the least expensive book
        System.out.println("The least expensive drink is: ");
        System.out.println(bar.getLeast());
        System.out.println();
        System.out.println();

        System.out.println("Have a great night and make it home safe!");

    }

}
