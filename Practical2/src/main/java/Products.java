public class Products {

    //data fields
    private String brandName;
    private String productDscript;
    private double cost;
    //constructors
    public Products() {
        brandName = "";
        productDscript = "";
        cost = 0.0;
    }
    public Products(String brandName, String pd, double c) {
        this.brandName = brandName;
        productDscript = pd;
        cost = c;
    }
    //setters
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public void setProductDescription(String pd) {
        productDscript = pd;
    }

    public void setCost(double c) {
        cost = c;
    }
    //getters
    public String getBrandName() {
        return brandName;
    }
    public String getProductDescription() {
        return productDscript;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Product Name: %-14s Description: %-23s Cost: %-8.2f",  brandName,productDscript,cost);
    }
}

