import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Store> stores = new ArrayList<Store>();

    public Company() {
        name = "";
    }
    public Company(String n) {
        name = n;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void addStores(String name) {
        stores.add(new Store(name));
    }

    public Store getStore(int Index){
        return stores.get(Index);
    }

    public void addProductToStore(String bn, String pd, double c, int i) {
        stores.get(i).addProducts(bn, pd, c);
    }
    public void printCompany() {
        System.out.printf("There are %d stores under this Company.\n", stores.size());
        System.out.println();
        for(int i = 0; i < stores.size(); i++) {
           stores.get(i).printData();
        }
        System.out.println();
    }
    public void sortCompany() {
        for (int i = 0; i < stores.size(); i++) {
            stores.get(i).productSort();
        }
    }

    public void smallCompany() {
        System.out.println("These are the products in each store with cost below $80: ");
        System.out.println();
        for(int i = 0; i < stores.size(); i++) {
            stores.get(i).smallProducts();
        }
    }

}
