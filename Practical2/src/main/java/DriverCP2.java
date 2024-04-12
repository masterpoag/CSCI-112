public class DriverCP2 {
    public static void main(String[] args) {

        // TODO pass the name of your Company in the Constructor call
        Company com = new Company("Name");

        com.addStores("Academy Sports");
        com.addStores("Dick's Sporting Goods");
        com.addStores("Scheels");
        com.addStores("Champs Sports");

        //add products to Academy Sports (half 80/7 products)
        com.addProductToStore("Nike", "Women's Athletic Shoes",  120.89, 0);
        com.addProductToStore("H20 Xpress", "Fishing Rods", 50.99, 0);
        com.addProductToStore("Under Armour", "Men's Shirts",  20.39, 0);
        com.addProductToStore("Wilson", "Baseball Gloves",  149.99,0);
        com.addProductToStore("Tachikara", "Volleyballs",  34.19, 0);
        com.addProductToStore("Oakley", "Sunglasses",  148.99, 0);
        com.addProductToStore("HEAD", "Tennis Racquets",  19.99, 0);

        //add products to Dick's (all 80+/4 products)
        com.addProductToStore("Taylor Made", "Golf Club",  579.99, 1);
        com.addProductToStore("Ridell", "Football Helmets",  168.49, 1);
        com.addProductToStore("Fitness Gear", "Utility Bench",  205.53, 1);
        com.addProductToStore("Lifetime", "Basketball Hoop", 349.59, 1);

        //add products to Scheels (all -80/5 products)
        com.addProductToStore("Kinetic", "Incline Skates", 54.28, 2);
        com.addProductToStore("Bestway", "Inflatable Pool", 77.10, 2);
        com.addProductToStore("Black Diamond", "Biking Helmet", 45.20, 2);
        com.addProductToStore("Petzl", "Climbing Harness",  59.99, 2);
        com.addProductToStore("Hyperlite", "Life Jacket",  62.74, 2);

        //6 products to Champs Sports
        com.addProductToStore("Everlast", "Boxing Gloves",  45.00, 3);
        com.addProductToStore("Adidas", "Swim Clogs",  58.32, 3);
        com.addProductToStore("Weider", "Dumbbells",  95.39, 3);
        com.addProductToStore("Nike", "Soccer Cleats",  250.77, 3);
        com.addProductToStore("RUDIS", "Wrestling Singlet",  85.23, 3);
        com.addProductToStore("Gaiam", "Yoga Mat",  22.65, 3);

        System.out.println("This is the " + com.getName() + " Company. Welcome!");
        System.out.println();

        com.sortCompany();

        com.printCompany();
        System.out.println("*****************************************************************************");
        com.smallCompany();
        System.out.println("Thank you for checking out the " + com.getName() + " Company.");
    }
}
