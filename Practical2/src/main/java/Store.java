public class Store {

    private String name;
    private Products[] products;
    private int index;

    //empty Constructor
    public Store() {
        name = "";
        products = new Products[20];
        index = 0;
    }
    //non-empty Constructor
    public Store(String n) {
        name = n;
        products = new Products[20];
        index = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLogicalLength() {
        return index;
    }
    public void addProducts(String bn, String pd, double c) {
        products[index] = new Products(bn, pd, c);
        index++;
    }
    public Products getProduct(int Index){
        return products[Index];
    }
    public double calcAvgCost(){
        double sum =0;
        for(int i = 0; i < index; i++){
            sum += products[i].getCost();
        }
        return sum/index;



    }
    public void printData(){
        System.out.println("\t\t" + name);
        System.out.println("and the " + index + " current products at the store: ");
        System.out.println();
        for (int i = 0; i < index; i++) {
            System.out.println(products[i].toString());
        }
        System.out.println();
        System.out.printf("The average cost of the products is $%.2f\n", calcAvgCost());
        System.out.println();
        System.out.println("***************************************");
        System.out.println();
    }
    public void productSort() {
        int indexOfLargestProductsCost;
        Products largerCost;

        for(int outerControl = 0; outerControl < products.length - 1; outerControl++) {

            indexOfLargestProductsCost = outerControl;
            largerCost = products[outerControl];

            for(int innerControl = outerControl + 1; innerControl < index; innerControl++) {

                if( products[innerControl].getCost() < largerCost.getCost()) {
                    largerCost = products[innerControl];
                    indexOfLargestProductsCost = innerControl;
                }
            }
            products[indexOfLargestProductsCost] = products[outerControl];
            products[outerControl] = largerCost;
        }
    }
    public void smallProducts() {
        System.out.println("\t\t" + name);
        System.out.println();
        int count = 0;
        for(int i = 0; i < index; i++) {
            if(products[i].getCost() < 80.00) {
                System.out.println(products[i].toString());
                count++;
            }
        }
        if(count == 0) {
            System.out.printf("No products in this store are below $80\n");
        }
        System.out.println();
        System.out.println("***************************************");

    }

}